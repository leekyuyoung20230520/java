// 모듈 추출
const express = require('express');

// 서버 실행
const app = express();

// request 이벤트 리스너를 설정
app.get('/page/:id/:name', (request,response)=>{
    // 토큰을 꺼냅니다.
    const id = request.params.id;
    const name = request.params.name;
    // 응답
    const result =`
    <h1>${id} Page</h1>
    <h3>${name}</h3>
    ` ;
    response.send(result);
});
// 서버 실행
app.listen(52273,()=>{
    console.log('running server at http://localhost:52273')
});