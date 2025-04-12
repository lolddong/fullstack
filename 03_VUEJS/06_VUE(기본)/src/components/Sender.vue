<script>
export default {
  name: 'Sender',
  methods: {
    sendMessage() {
      this.emitter.emit(
        'message',
        new Date().toLocaleString('ko-KR', { timeZone: 'Asia/Seoul' }) + '에 발신된 메시지',
      )
    },
  },
}
</script>

<template>
  <div style="border: 1px solid lightcoral; padding: 5px; margin: 5px">
    <h2>Sender</h2>
    <hr />
    <button @click="sendMessage">이벤트 발신</button>
  </div>
</template>
