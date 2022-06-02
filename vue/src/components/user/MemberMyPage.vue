<template>
  <div>
    <b-form v-if="show">
      <b-form-group id="input-group-1" label="아이디:" label-for="input-1">
        <b-form-input
          id="input-1"
          v-model="user.userId"
          type="text"
          placeholder="Enter ID"
          required
          readonly
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-2" label="이름:" label-for="input-2">
        <b-form-input
          id="input-2"
          v-model="user.userName"
          placeholder="Enter name"
          required
          readonly
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-3" label="비밀번호:" label-for="input-3">
        <b-form-input
          id="input-3"
          v-model="user.userPwd"
          placeholder="Enter PWD"
          required
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-4" label="주소:" label-for="input-4">
        <b-form-input
          id="input-4"
          v-model="user.userAddr"
          placeholder="Enter ADDR"
          required
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-5" label="핸드폰 번호:" label-for="input-5">
        <b-form-input
          id="input-5"
          v-model="user.userPhone"
          placeholder="Enter Phone"
          required
        ></b-form-input>
      </b-form-group>

      <b-form-group id="input-group-6" label="나이:" label-for="input-6">
        <b-form-input
          id="input-6"
          v-model="user.userAge"
          placeholder="Enter Age"
          required
        ></b-form-input>
      </b-form-group>

      <b-button type="button" @click="modify" variant="primary">수정</b-button>
      <b-button type="button" @click="cancle" variant="danger">취소</b-button>
    </b-form>
  </div>
</template>

<script>
import { mapState } from "vuex";
const memberStore = "memberStore";

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
  computed: {
    ...mapState(memberStore, ["userInfo"]),
  },
  created() {
    this.user = this.userInfo;
  },
  methods: {
    modify() {
      console.log(this.$store.state.memberStore.userInfo);
      this.$store.dispatch("memberStore/userModify", this.user);
    },
    cancle() {
      this.$router.push({ name: "home" });
    },
  },
};
</script>
