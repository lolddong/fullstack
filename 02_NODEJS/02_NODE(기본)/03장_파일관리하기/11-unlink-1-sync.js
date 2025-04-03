const fs = require("fs");

// 파일 삭제 (동기 함수)
fs.unlinkSync("./text-1.txt");
console.log("file deleted");

// 파일 존재 여부 확인, 없으면 종료, 있으면 삭제
if (!fs.existsSync("./text-1.txt")) {
  console.log("file does not exist");
} else {
  fs.unlinkSync("./text-1.txt");
  console.log("file deleted.");
}
