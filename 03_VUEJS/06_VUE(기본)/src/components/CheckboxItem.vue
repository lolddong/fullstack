<script>
export default {
  name: 'CheckboxItem',
  props: {
    id: [Number, String],
    // name: String,
    name: {
      validator(v) {
        return typeof v !== 'string' ? false : v.trim().length >= 4 ? true : false
      },
    },
    checked: {
      type: Boolean,
      required: false, // 생략 가능
      default: false,
    },
  },
}
</script>

<template>
  <li><input type="checkbox" :checked="checked" />{{ id }} - {{ name }}</li>
</template>
