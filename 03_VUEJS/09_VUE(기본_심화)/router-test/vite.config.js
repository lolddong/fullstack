import { fileURLToPath, URL } from 'node:url'

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import vueDevTools from 'vite-plugin-vue-devtools'
import { manualChunksPlugin } from 'vite-plugin-webpackchunkname'

// https://vite.dev/config/
export default defineConfig({
  plugins: [vue(), vueDevTools(), manualChunksPlugin()],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url)),
    },
  },
})
