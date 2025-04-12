<script>
import InputName from './components/InputName.vue'
export default {
  name: 'App4',
  components: { InputName },
  data() {
    return { parentName: '' }
  },
  methods: {
    nameChangeHandler(e) {
      this.parentName = e.name
    },
  },
  computed: {
    invalidName() {
      return this.parentName.length > 0 && this.parentName.length < 3
    },
  },
}
</script>

<template>
  <div>
    <InputName @nameChanged="nameChangeHandler" />
    <br />
    <h3>App 데이터: {{ parentName }}</h3>
    <!-- 에러 메세지 출력 -->
    <p v-if="invalidName" style="color: red">
      입력하신 이름의 길이가 너무 작습니다. <br />
      현재 입력하신 글자 수: {{ parentName.length }} <br />
      더 입력하셔야 되는 글자 수: {{ 3 - parentName.length }}
    </p>
  </div>
</template>
