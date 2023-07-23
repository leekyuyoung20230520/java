const request = require('request')
const cheerio = require('cheerio')

// url 을 이용해서 html문서 구조를 가져온다
const url = 'https://www.hanbit.co.kr/academy/books/new_book_list.html';
title_list = [];
writer_list = []
const getTitleWriter = (callback) =>{
    request(url,(error,response,body)=>{    
        if(!error && response.statusCode == 200){
            const $ = cheerio.load(body);    
            $('.sub_book_list').each( (index,element)=>{
                const title = $(element).find('.book_tit').text().trim();
                const writer = $(element).find('.book_writer').text().trim();                                
                title_list.push(title);
                writer_list.push(writer);            
            } ); 
        callback(null, {title_list,writer_list});
        }else{
            console.log('error');
            callback(error, null);
        }
    });
};
console.log('request 요청 끝난후 실행');

getTitleWriter( (err,data)=>{
    if(err)
        console.log("error", err);
    else
        console.log(title_list);
        console.log(writer_list)
} );

