// 모듈 추출
const express = require('express');
const fs = require('fs');

// 서버 실행
const app = express();

app.get('/image',(request,response)=>{
    fs.readFile('image.png', (err,data)=>{
        // 이미지파일 제공
        response.type('image/png');  // mine 타입설정
        response.send(data);
    });
});

app.get('/audio',(request,response)=>{
    fs.readFile('audio.mp3', (err,data)=>{
        // 이미지파일 제공
        response.type('audio/mpeg');  // mine 타입설정
        response.send(data);
    });
});

// 서버 실행
app.listen(52273,()=>{
    console.log('running server at http://localhost:52273')
});