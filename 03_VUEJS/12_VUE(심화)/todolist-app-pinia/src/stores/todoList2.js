import { defineStore } from 'pinia'
import { reactive, computed } from 'vue'
import axios from 'axios'

// 1. BASEURI는 vite.config.js의 프록시 설정에 맞추어 지정
// 2. owner는 생플 백엔드 API 서버(https://sample.bmaster.kro.kr)의 문서 참조하여 지정 (기본값 gdhong 데이터는 존재함)
const owner = 'gdhong'
// 의도적 1초의 지연시간 발생시키는 API 사용
const BASEURI = '/api/todolist_long'

// todoList2 스토어 (Composition API)
export const useTodoListStore = defineStore('todoList2', () => {
  // State 정의 (todoList, isLoading)
  const state = reactive({
    todoList: [],
    isLoading: false,
  })
  // Actions 정의
  const fetchTodoList = async () => {
    state.isLoading = true
    try {
      const response = await axios.get(BASEURI + `/${owner}`)
      if (response.status === 200) {
        state.todoList = response.data
      } else {
        alert('데이터 조회 실패')
      }
      state.isLoading = false
    } catch (error) {
      alert('에러 발생: ' + error)
      state.isLoading = false
    }
  }

  const addTodo = async ({ todo, desc }, successCallback) => {
    if (!todo || todo.trim() === '') {
      alert('할 일은 반드시 입력해야 합니다.')
      return
    }
    state.isLoading = true
    try {
      const payload = { todo, desc }
      const response = await axios.post(BASEURI + `/${owner}`, payload)
      if (response.data.status === 'success') {
        state.todoList.push({ id: response.data.item.id, todo, desc, done: false })
        if (typeof successCallback === 'function') {
          successCallback()
        }
      } else {
        alert('Todo 추가 실패: ' + response.data.message)
      }
      state.isLoading = false
    } catch (error) {
      alert('에러 발생: ' + error)
      state.isLoading = false
    }
  }

  const updateTodo = async ({ id, todo, desc, done }, successCallback) => {
    if (!todo || todo.trim() === '') {
      alert('할 일은 반드시 입력해야 합니다.')
      return
    }
    state.isLoading = true
    try {
      const payload = { todo, desc, done }
      const response = await axios.put(BASEURI + `/${owner}/${id}`, payload)
      if (response.data.status === 'success') {
        let index = state.todoList.findIndex((todo) => todo.id === id)
        state.todoList[index] = { id, todo, desc, done }
        if (typeof successCallback === 'function') {
          successCallback()
        }
      } else {
        alert('Todo 변경 실패: ' + response.data.message)
      }
      state.isLoading = false
    } catch (error) {
      alert('에러 발생: ' + error)
      state.isLoading = false
    }
  }

  const deleteTodo = async (id) => {
    state.isLoading = true
    try {
      const response = await axios.delete(BASEURI + `/${owner}/${id}`)
      if (response.data.status === 'success') {
        let index = state.todoList.findIndex((todo) => todo.id === id)
        state.todoList.splice(index, 1)
      } else {
        alert('Todo 삭제 실패: ' + response.data.message)
      }
      state.isLoading = false
    } catch (error) {
      alert('에러 발생: ' + error)
      state.isLoading = false
    }
  }

  const toggleDone = async (id) => {
    state.isLoading = true
    try {
      const response = await axios.put(BASEURI + `/${owner}/${id}/done`)
      if (response.data.status === 'success') {
        let index = state.todoList.findIndex((todo) => todo.id === id)
        state.todoList[index].done = !state.todoList[index].done
      } else {
        alert('Todo 완료 변경 실패: ' + response.data.message)
      }
      state.isLoading = false
    } catch (error) {
      alert('에러 발생: ' + error)
      state.isLoading = false
    }
  }

  // getter 정의
  const todoList = computed(() => state.todoList)
  const isLoading = computed(() => state.isLoading)
  const doneCount = computed(() => {
    const filtered = state.todoList.filter((todoItem) => todoItem.done === true)
    return filtered.length
  })
  return {
    todoList,
    isLoading,
    doneCount,
    fetchTodoList,
    addTodo,
    updateTodo,
    deleteTodo,
    toggleDone,
  }
})
