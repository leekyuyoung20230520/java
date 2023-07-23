// 모듈 추출
const express = require('express');

// 서버 실행
const app = express();
app.use(express.static('public')) // 미들웨어 설정(정적리소스 경로 셋팅)


// request 이벤트 리스너를 설정
app.get('*', (request,response)=>{    
    response.status(404);
    response.send("해당경로는 아무것도 없습니다.");
});

// 서버 실행
app.listen(52273,()=>{
    console.log('running server at http://localhost:52273')
});