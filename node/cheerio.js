const request = require('request')
const cheerio = require('cheerio')

// url 을 이용해서 html문서 구조를 가져온다
const url = 'https://www.hanbit.co.kr/academy/books/new_book_list.html';
request(url,(error,response,body)=>{
    const $ = cheerio.load(body);
    // console.log( $('.new_book_list_wrap'));
    $('.new_book_list_wrap').each( (index,element)=>{
        const title = $(element).find('.book_tit').text().trim();
        const writer = $(element).find('.book_writer').text().trim();
        console.log(title);
        console.log(writer);
        console.log("\n");        
    } );
});