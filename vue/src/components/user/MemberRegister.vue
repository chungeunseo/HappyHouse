<template>
  <div>
    <b-form v-if="show">
      <b-form-group id="input-group-1" label="ID:" label-for="input-1">
        <b-form-input
          id="input-1"
          v-model="user.userId"
          type="text"
          placeholder="아이디를 입력해주세요"
          required
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-2" label="NAME:" label-for="input-2">
        <b-form-input
          id="input-2"
          v-model="user.userName"
          placeholder="이름을 입력해주세요"
          required
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-3" label="PASSWORD:" label-for="input-3">
        <b-form-input
          id="input-3"
          v-model="user.userPwd"
          placeholder="비밀번호를 입력해주세요"
          required
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-4" label="ADDRESS:" label-for="input-4">
        <b-form-input
          id="input-4"
          v-model="user.userAddr"
          placeholder="주소를 입력해주세요"
          required
        ></b-form-input>
      </b-form-group>

      <b-form-group
        id="input-group-5"
        label="PHONE NUMBER:"
        label-for="input-5"
      >
        <b-form-input
          id="input-5"
          v-model="user.userPhone"
          placeholder="핸드폰번호를 입력해주세요"
          required
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-6" label="AGE:" label-for="input-6">
        <b-form-input
          id="input-6"
          v-model="user.userAge"
          placeholder="나이를 입력해주세요"
          required
        ></b-form-input>
      </b-form-group>

      <b-button type="button" @click="register" variant="outline-success"
        >가입</b-button
      >
      <b-button type="button" @click="cancle" variant="outline-warning"
        >취소</b-button
      >
    </b-form>
  </div>
</template>

<script>
import { register } from "@/api/member.js";

export default {
  data() {
    return {
      user: {
        userId: "",
        userPwd: "",
        userName: "",
        userAddr: "",
        userPhone: "",
        userAge: "",
      },
      show: true,
    };
  },
  methods: {
    register() {
      console.log(this.user);
      register(
        this.user,
        () => {
          this.$router.push({ name: "home" });
          alert("가입완료");
        },
        () => {},
      );
    },
    cancle() {
      this.$router.push({ name: "home" });
    },
  },
};
</script>
