const fs = require("fs");

// fs.rmdirSync() - 동기 함수, 빈 디렉터리만 삭제 가능 (빈 디렉터리 = 파일 없는 것)
// fs.rmdir() - 비동기 함수, 빈 디렉터리만 삭제 가능
if (fs.existsSync("./test")) {
  fs.rmdir("./test", (err) => {
    if (err) {
      console.error(err);
    } else {
      console.log("folder deleted.");
    }
  });
} else {
  console.log("folder does not exist.");
}
