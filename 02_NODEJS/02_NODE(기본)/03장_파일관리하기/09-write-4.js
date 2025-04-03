const fs = require("fs");

// 파일에 내용 추가
let content = `
==============
새로운 내용을 추가
==============
`;
// writeFileSync의 flag 옵션 사용
fs.writeFileSync("./text-1.txt", content, { flag: "a" });
