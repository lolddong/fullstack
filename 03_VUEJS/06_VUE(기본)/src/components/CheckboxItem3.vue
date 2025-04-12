<script>
import Idol from '../Idols.js'
export default {
  name: 'CheckboxItem3',
  props: {
    idol: Idol,
  },
}
</script>

<template>
  <li><input type="checkbox" :checked="idol.checked" />{{ idol.name }}</li>
</template>
