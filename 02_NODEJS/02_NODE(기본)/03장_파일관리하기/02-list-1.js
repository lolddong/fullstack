// fs (File System) 모듈 불러오기
const fs = require('fs');

// 현재 작업 디렉토리 파일 목록 출력 (동기 함수 사용)
let files = fs.readdirSync('./');
console.log(files); // [ '01-path.js', '02-list-1.js' ]
