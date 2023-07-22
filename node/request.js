const request = require('request');

const url = 'https://www.daum.net';
request(url,(error,response,body)=>{
    console.log(body);
});