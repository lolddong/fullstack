<script>
import CheckboxItem from './components/CheckboxItem.vue'
export default {
  name: 'App',
  components: { CheckboxItem },
  data() {
    return {
      idols: [
        { id: 1, name: 'BTS', checked: false },
        { id: 2, name: 'Black Pink' },
        { id: 3, name: 'EXO' },
        { id: 4, name: 'ITZY' },
      ],
    }
  },
  computed: {
    invalidIdols() {
      return this.idols.filter((idol) => {
        return typeof idol.name !== 'string' || idol.name.length < 4
      })
    },
  },
}
</script>

<template>
  <div>
    <h2>관심 있는 K-POP 가수? App</h2>
    <hr />
    <ul>
      <CheckboxItem
        v-for="idol in idols"
        :key="idol.id"
        :id="idol.id"
        :checked="idol.checked"
        :name="idol.name"
      />
      <!-- 에러 메세지 출력 -->
      <p v-if="invalidIdols.length > 0" style="color: red">
        유효하지 않은 이름을 가진 가수가 {{ invalidIdols.length }}명 있습니다:
      </p>
      <ul>
        <li v-for="idol in invalidIdols" :key="idol.name">
          이름: {{ idol.name }} / 길이: {{ idol.name.length }} / 데이터타입: {{ typeof idol.name }}
        </li>
      </ul>
    </ul>
  </div>
</template>
