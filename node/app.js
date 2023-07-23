// 이코들 실습하려면 visual studio에서 확장프로그램에서 thunder client를 설치해야함
// 화면구성없이 로직을 점검하는 용도로 사용

// 간단한 RestFull 서비스 구현
const express = require('express');
const app = express();
app.listen(8080,()=>{
    console.log("localhost:8080");
});

// 미들웨어 출가
app.use(express.urlencoded({extended:false}));

let userCounter = 0;
const users = [];
//전체 데이터 조회
app.get('/user', (request,response)=>{
    response.send(users);
});
// 특정데이터 조회
app.get('/user/:id', (request,response)=>{
    const id = request.params.id;
    const filtered = users.filter((user)=>user.id == id);
    if(filtered.length == 1)
        response.send(filtered[0]);
    else
        response.status(404).send('데이터가 존재하지 않습니다.');
});
// 데이터 추가
app.post('/user', (request,response)=>{
    const body = request.body;
    if(!body.name)
        return response.status(404).send('name이 없습니다');
    else if(!body.region)
        return response.status(404).send('region이 없습니다');
    const name = body.name;
    const region = body.region;
    const data = {
        id:userCounter++,
        name:name,
        region:region
    };
    users.push(data)    
    response.send(data);

});
// 수정
app.put('/user/:id', (request,response)=>{
    const id = request.params.id;
    const user =  users.find((x)=>x.id == id);
    if(user){
        if(request.body.name)
            users[id].name =request.body.name;
        if(request.body.region)
            users[id].region =request.body.region;
        response.send(user);
    }
    else{
        response.status(404).send('데이터가 존재하지 않습니다.');
    }
});

app.delete('/user/:id', (request,response)=>{
    const id = request.params.id;
    const index =  users.findIndex((x)=>x.id == id);

    if(index != -1){
        users.splice(index,1);
        response.send("제거완료");
    }
    else{
        response.status(404).send('데이터가 존재하지 않습니다.');
    }
});
