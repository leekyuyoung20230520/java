// 모듈 추출
const express = require('express');

// 서버 실행
const app = express();

// request 이벤트 리스너를 설정
app.get('*', (request,response)=>{

    setTimeout(() => {
        response.redirect("http://www.naver.com");    
    }, 2000);
    
    // response.send("<h1>리다이렉트 메세지가 있습니다.</h1>");
});
// 서버 실행
app.listen(52273,()=>{
    console.log('running server at http://localhost:52273')
});