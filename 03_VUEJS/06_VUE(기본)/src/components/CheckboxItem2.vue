<script>
export default {
  name: 'CheckboxItem2',
  props: ['idol'],
  created() {
    this.idol.checked = false
  },
}
</script>

<template>
  <div class="CheckboxItem2">
    <li><input type="checkbox" :checked="idol.checked" /> {{ idol.name }}</li>
  </div>
</template>
