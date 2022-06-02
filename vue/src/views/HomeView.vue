<template>
  <b-container class="bv-example-row mt-3 text-center">
    <b-row>
      <b-col></b-col>
      <b-col cols="10">
        <div>
          <b-jumbotron
            header="Happy House"
            style="background-color: transparent"
          >
            <p></p>
            <p>아파트 매매 정보 사이트</p>
          </b-jumbotron>
        </div>

        <template>
          <img src="@/assets/home.jpg" class="img-fluid" />
        </template>
      </b-col>
      <b-col></b-col>
    </b-row>
  </b-container>
</template>

<script>
export default {
  name: "HomeView",
  props: {
    msg: String,
  },
};
</script>

<style scoped>
.underline-steelblue {
  display: inline-block;
  background: linear-gradient(
    180deg,
    rgba(255, 255, 255, 0) 70%,
    rgba(72, 190, 233, 0.3) 30%
  );
}
</style>
