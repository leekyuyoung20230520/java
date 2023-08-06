CREATE SCHEMA if not exists mysns DEFAULT CHARACTER SET utf8 ;
use mysns;

drop table if exists user;
create table if not exists user(
	id varchar(128) primary key,
    password varchar(32),
    name varchar(32),
    ts timestamp default current_timestamp
);

drop table if exists feed;
create table if not exists feed(
	no int unsigned auto_increment primary key,
	id varchar(128),
    content varchar(4096),
    ts timestamp default current_timestamp
);

-- 데이터 추가  
insert into user(id,password,name) values('abc@abc.com','abc','에이비씨');
insert into user(id,password,name) values('123@abc.com','123','일이삼');
insert into user(id,password,name) values('333@abc.com','333','삼삼삼');

insert into feed(id,content) values('abc@abc.com','abc가 쓴 글입니다.');
insert into feed(id,content) values('abc@abc.com','abc가 쓴  두번째 글입니다.');
insert into feed(id,content) values('123@abc.com','123가 쓴 글입니다.');

-- 데이터 조회
-- 모든 데이터 조회
select * from user;
-- 조건을 가지고 조회(이름에 삼이 들어간 경우)
select * from user where name like '%삼%';

-- 삭제(이름이 일이삼인 데이터만 삭제)
delete from user where name  = '일이삼';

-- 업데이트 
update user set password = '000' where name like '%삼%';


-- 조회-정렬(기본이 오름차순)
select * from user order by name;

-- 조회-정렬(내림차순)
select * from user order by name desc;

-- 조회-갯수제한 - mysql ex) top10
select * from user limit 2;

-- join 연산 ( user중에 어떤 사람이 어떤 글을 썻는지 두 테이블 조인)
select * from user,feed where user.id = feed.id;

-- join연산 정렬... id  순으로
select * from user,feed where user.id = feed.id order by user.id;

