// 모듈 추출
const express = require('express');
const bodyParser = require('body-parser')

// 서버 실행
const app = express();
app.use(express.static('public')) // 미들웨어 설정(정적리소스 경로 셋팅)

// 바디파서 미들웨어
app.use(bodyParser.urlencoded({extended:false}));

// request 이벤트 리스너를 설정
app.get('/', (request,response)=>{    
    let output = `
        <form method = "post">
        <input type= "text", nane = "a"/>
        <input type= "text", nane = "b"/>
        <input type= "submit"/>
        </form>
    `;
    response.send(output);
});
app.post('/',(request,response)=>{
    console.log(request.body);
});

// 서버 실행
app.listen(52273,()=>{
    console.log('running server at http://localhost:52273')
});