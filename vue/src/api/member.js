import http from "./http.js";

async function login(user, success, fail) {
  await http
    .post(`/user/login`, JSON.stringify(user))
    .then(success)
    .catch(fail);
}

async function findById(userid, success, fail) {
  http.defaults.headers["access-token"] =
    sessionStorage.getItem("access-token");
  await http.get(`/user/${userid}`).then(success).catch(fail);
}

async function register(user, success, fail) {
  await http.post(`/user`, JSON.stringify(user)).then(success).catch(fail);
}

function modify(user, success, fail) {
  http
    .put(`/user/${user.userId}`, JSON.stringify(user))
    .then(success)
    .catch(fail);
}

export { login, findById, register, modify };
