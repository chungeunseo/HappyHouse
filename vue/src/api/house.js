import http from "./http.js";

function sidoList(success, fail) {
  http.get(`/map/sido`).then(success).catch(fail);
}

function gugunList(params, success, fail) {
  http.get(`/map/gugun`, { params: params }).then(success).catch(fail);
}

function houseList(params, success, fail) {
  http.get(`/map/apt`, { params: params }).then(success).catch(fail);
}

export { sidoList, gugunList, houseList };
