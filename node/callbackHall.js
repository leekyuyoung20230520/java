// 비동기처리를 많이하면 '콜백 지옥'
// '콜백 지옥' 콜백함수를 너무 많이사용하면 코드가 보기힘든상태

// 콜백을  사용한 경우
const async = require('async');
a = async.parallel([
    function(callback){
        setTimeout(() => {
            callback(null,'one');
        }, 2000);
    },
    function(callback){
        setTimeout(() => {
            callback(null,'two');
        }, 100);
    }
],function(err,results){
    console.log(results);
});
a