import { createApp } from 'vue'
// import App from './App.vue'
// import App2 from './App2.vue'
// import App3 from './App3.vue'
import App4 from './App4.vue'
// import App5 from './App5.vue'
// 전역 컴포넌트 등록 (p.177)
// import CheckboxItem from './components/CheckboxItem.vue'
import mitt from 'mitt' // 이벤트 에미터 라이브러리

import './assets/main.css'

// 전역 컴포넌트 등록 (p.177)
// createApp(App).component('CheckboxItem', CheckboxItem).mount('#app')
// createApp(App).mount('#app')
// createApp(App2).mount('#app')
// createApp(App3).mount('#app')
createApp(App4).mount('#app')

// 이벤트 에미터 등록
// const emitter = mitt()
// emitter.on('*', (type, e) => console.log(`### 이벤트 로그: ${type} -> `, e))
// const app = createApp(App5)
// app.config.globalProperties.emitter = emitter
// app.mount('#app')
