process.on('exit', ()=>console.log('종료되었음'));

console.log('타이머 시작')
setTimeout(() => {
    console.log('exit 호출');
    process.exit();
}, 5000);

