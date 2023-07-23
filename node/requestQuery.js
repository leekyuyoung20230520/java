// 모듈 추출
const express = require('express');

// 서버 실행
const app = express();

// request 이벤트 리스너를 설정
app.get('*', (request,response)=>{
    console.log(request.query);
    response.send(`<h1>${JSON.stringify(request.query)}</h1>`);
});

// 서버 실행
app.listen(52273,()=>{
    console.log('running server at http://localhost:52273')
});