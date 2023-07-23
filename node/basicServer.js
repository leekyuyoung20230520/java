const express = require('express');
const app = express();

// 이벤트 리스너를 설정
app.use( (request,response)=>{
    response.send("<h1>Hello Express</h1>");
});

// 서버실행
app.listen(52273,()=>{
    console.log("server running at http://localhost:52273");
})