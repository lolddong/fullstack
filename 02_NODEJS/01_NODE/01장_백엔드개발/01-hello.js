// 실행 # node 파일명
function hello(name) {
  console.log(name + '님, 안녕하세요?');
}

hello('안다윤');

// npm install ansi-colors 후 실행
const c = require('ansi-colors');
function d(name) {
  console.log(c.green(name) + '님, 안녕하세요?');
}

d('Pearl2');
