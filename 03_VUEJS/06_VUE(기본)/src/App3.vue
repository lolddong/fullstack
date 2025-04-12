<script>
import CheckboxItem3 from './components/CheckboxItem3.vue'
import Idol from './Idols.js'
export default {
  name: 'App3',
  components: {
    CheckboxItem3,
  },
  data() {
    return {
      idols: [
        new Idol(1, 'BTS', true),
        new Idol(2, 'Black Pink', false),
        new Idol(3, 'EXO', true),
        'hello',
      ],
    }
  },
  computed: {
    invalidIdols() {
      return this.idols.filter((idol) => {
        return typeof idol !== 'object'
      })
    },
  },
}
</script>

<template>
  <div>
    <h2>관심있는 가수? App3</h2>
    <hr />
    <ul>
      <CheckboxItem3 v-for="idol in idols" :idol="idol" />
    </ul>
    <!-- 에러 메세지 출력 -->
    <p v-if="invalidIdols.length > 0" style="color: red">
      유효하지 않은 타입을 가진 가수가 <span style="color: blue">{{ invalidIdols.length }}</span
      >명 있습니다.
    </p>
    <ul>
      <li v-for="idol in invalidIdols" :key="idol.name">
        내용: {{ JSON.stringify(idol) }}, type: {{ typeof idol }}
      </li>
    </ul>
  </div>
</template>
