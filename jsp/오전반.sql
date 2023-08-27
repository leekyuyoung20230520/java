CREATE SCHEMA if not exists mysns DEFAULT CHARACTER SET utf8 ;
use mysns;

drop table if exists user;
create table if not exists user(
	id varchar(128) primary key not null,
    password varchar(32) not null,
    name varchar(32) not null,
    ts timestamp default current_timestamp
);

drop table if exists feed;
create table if not exists feed(
	no int unsigned auto_increment primary key,
	id varchar(128) not null,
    content varchar(4096),
    ts timestamp default current_timestamp
);
-- 기존 feed 테이블에 images 컬럼 추가
alter table feed add column images varchar(1024);

commit;

-- 데이터 추가  
insert into user(id,password,name) values('abc@abc.com','abc','에이비씨');
insert into user(id,password,name) values('123@abc.com','123','일이삼');
insert into user(id,password,name) values('333@abc.com','333','삼삼삼');

insert into feed(id,content) values('abc@abc.com','abc가 쓴 글입니다.');
insert into feed(id,content) values('abc@abc.com','abc가 쓴  두번째 글입니다.');
insert into feed(id,content) values('123@abc.com','123가 쓴 글입니다.');


select 
no,
id,
case
	when char_length(content) > 20 then concat(substring(content,1,20), '...')
    else content
end as content
from feed
;


select id,case when char_length(content) > 20 then concat(substring(content,1,20), '...') else content end as content from feed;


select * from feed;



select now() ;


update feed set content='aaa', images='test.png', ts=now() where id = 'abc@abc.com';

select * from feed where id = 'abc@abc.com';
