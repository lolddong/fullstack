<script>
import { reactive, onMounted } from 'vue'
import TodoList from './components/TodoList.vue'
import InputTodo from './components/InputTodo.vue'

export default {
  name: 'App',
  components: { InputTodo, TodoList },
  setup() {
    const ts = new Date().getTime()
    const state = reactive({ todoList: [] })

    onMounted(() => {
      state.todoList.push({ id: ts, todo: '자전거 타기', completed: false })
    })
  },
}
</script>

<template>
  <div id="app" class="container">
    <div class="card card-body bg-light pt-5 pb-5">
      <div class="title">:: Todolist App</div>
    </div>
    <div class="card card-default card-borderless">
      <div class="card-body">
        <InputTodo />
        {{ ts }}
        <TodoList :todoList="todoList" />
      </div>
    </div>
  </div>
</template>
