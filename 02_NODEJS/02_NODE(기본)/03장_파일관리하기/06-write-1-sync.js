const fs = require('fs');

// 파일 읽어와 다른 파일에 쓰기 (동기 함수 사용)
const data = fs.readFileSync('./example.txt', 'utf-8');
fs.writeFileSync('./text-1.txt', data);
