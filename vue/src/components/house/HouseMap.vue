<template>
  <div>
    <div id="map"></div>
  </div>
</template>

<script>
import { mapState } from "vuex";
const houseStore = "houseStore";

export default {
  name: "HouseMap",
  data() {
    return {
      map: null,
      markers: [],
      latitude: 0,
      longitude: 0,
    };
  },
  computed: {
    ...mapState(houseStore, ["houses"]),
  },
  watch: {
    houses: function (newVal) {
      const markerPositions = newVal.map((house) => {
        return {
          lat: house.lat,
          lng: house.lng,
          content: `<div>${house.aptName}</div>`,
        };
      });
      this.displayMarker(markerPositions);
    },
  },
  created() {
    if (!("geolocation" in navigator)) {
      return;
    }

    // get position
    navigator.geolocation.getCurrentPosition(
      () => {
        this.latitude = 37.5012743;
        this.longitude = 127.039585;

        if (window.kakao && window.kakao.maps) {
          this.initMap();
        } else {
          const script = document.createElement("script");
          /* global kakao */
          script.onload = () => kakao.maps.load(this.initMap);
          script.src = `//dapi.kakao.com/v2/maps/sdk.js?autoload=false&appkey=${process.env.VUE_APP_KAKAOMAP_KEY}`;

          document.head.appendChild(script);
        }
      },
      (err) => {
        alert(err.message);
      },
    );
  },
  methods: {
    initMap() {
      const container = document.getElementById("map");
      const options = {
        center: new kakao.maps.LatLng(33.450701, 126.570667),
        level: 5,
      };
      this.map = new kakao.maps.Map(container, options);
      this.displayMarker([
        {
          content: "<div>SSAFY 서울 캠퍼스</div>",
          lat: this.latitude,
          lng: this.longitude,
        },
      ]);
    },
    displayMarker(markerPositions) {
      if (this.markers.length > 0) {
        this.markers.forEach((marker) => marker.setMap(null));
      }

      const positions = markerPositions.map(
        (position) => new kakao.maps.LatLng(position.lat, position.lng),
      );

      if (positions.length > 0) {
        this.markers = positions.map(
          (position) =>
            new kakao.maps.Marker({
              map: this.map,
              position,
            }),
        );

        for (var i = 0; i < positions.length; i++) {
          const infowindow = new kakao.maps.InfoWindow({
            content: markerPositions[i].content, // 인포윈도우에 표시할 내용
          });
          kakao.maps.event.addListener(
            this.markers[i],
            "mouseover",
            this.makeOverListener(this.map, this.markers[i], infowindow),
          );
          kakao.maps.event.addListener(
            this.markers[i],
            "mouseout",
            this.makeOutListener(infowindow),
          );
        }

        const bounds = positions.reduce(
          (bounds, latlng) => bounds.extend(latlng),
          new kakao.maps.LatLngBounds(),
        );

        this.map.setBounds(bounds);
      }
    },
    makeOverListener(map, marker, infowindow) {
      return function () {
        infowindow.open(map, marker);
      };
    },
    makeOutListener(infowindow) {
      return function () {
        infowindow.close();
      };
    },
  },
};
</script>

<style scoped>
.test {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  height: 100vh;
}

#map {
  width: 1110px;
  height: 500px;
  border: 1px #a8a8a8 solid;
}
</style>
