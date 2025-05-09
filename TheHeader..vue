<template>
  <div class="header_grid">
    <h1 class="logo">
      <router-link to="/home" id="logo_link">
        <span id="logo_txt">배추</span>
        <img id="logo_img" src="../../img/cabbage/logo1.png" alt="로고" />
      </router-link>
    </h1>
    <div id="title">{{ headerTitle }}</div>
    <div class="profile">
      <img
        class="rounded-circle"
        id="profile_img"
        src="@/img/cabbage/pretty_cabbage.jpg"
        alt="프로필 이미지"
      />
      <div class="info_text">
        <div id="user_name">{{ userInfo.name }}</div>
        <div id="user_role">{{ userInfo.role }}</div>
      </div>
      <img
        id="more_icon"
        src="@/img/icons/more_profile.svg"
        alt="더보기"
        @click="toggleModal"
      />
    </div>
    <!-- 모달창 -->
    <div class="modal" v-if="modalShow">
      <ul>
        <router-link to="/mypage"
          ><li @click="toggleModal">My Page</li></router-link
        >
        <li id="datrkmode_btn">Dark Mode</li>
        <li id="logout_btn" @click="logout">Log out</li>
      </ul>
    </div>
  </div>
</template>

<script setup>
import { useRoute } from "vue-router";
import { ref, computed } from "vue";
import { useUsersTableStore, logoutUser } from "@/stores/UsersTableStore";

const route = useRoute();
const headerTitle = computed(() => {
  return route.meta.title || "페이지";
});

const { getUserInfoLocalStorage } = useUsersTableStore();
const userInfo = getUserInfoLocalStorage();
const modalShow = ref(false);

function toggleModal() {
  modalShow.value = !modalShow.value;
  console.log(modalShow.value);
}

function logout() {
  logoutUser();
}
</script>

<style scoped>
.header_grid {
  position: relative;
  background-color: var(--color-point-5);
  display: grid;
  grid-template-columns: 200px 1fr 100px;
  align-items: center;
  height: 100%;
}
.logo {
  /* 스타일 생략됨 */
}
</style>
