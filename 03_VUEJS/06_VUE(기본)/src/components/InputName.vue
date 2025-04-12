<script>
export default {
  name: 'InputName',
  emits: {
    nameChanged: (e) => {
      return e.name && typeof e.name === 'string' && e.name.trim().length >= 3 ? true : false
    },
  },
  methods: {
    nameChangeHandler() {
      this.$emit('nameChanged', { name: this.name })
    },
  },
  data() {
    return { name: '' }
  },
}
</script>

<template>
  <div style="border: 1px solid lightcoral; padding: 5px">
    이름: <input type="text" v-model="name" @keyup.enter="nameChangeHandler" />
    <button @click="nameChangeHandler">이벤트 발신</button>
  </div>
</template>
