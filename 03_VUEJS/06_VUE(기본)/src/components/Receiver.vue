<script>
export default {
  name: 'Receiver',
  created() {
    this.emitter.on('message', this.receiveHandler)
  },
  data() {
    return {
      textMessage: '',
    }
  },
  methods: {
    receiveHandler(msg) {
      this.textMessage = msg
    },
  },
}
</script>

<template>
  <div style="border: 1px solid lightblu; padding: 5px; margin: 5px">
    <h2>Receiver</h2>
    <hr />
    <h2>전송된 텍스트: {{ textMessage }}</h2>
  </div>
</template>
