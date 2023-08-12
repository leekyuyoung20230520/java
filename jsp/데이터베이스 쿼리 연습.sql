-- 조회
select * from actor;

-- 정렬 기본 ascending 오름차순
select * from actor order by first_name;

-- 검색 firstname al이 포함되어 있는 데이터
select * from actor where first_name like '%al%';
-- al로 시작하는
select * from actor where first_name like 'al%';
-- al로 끝나는
select * from actor where first_name like '%al';

-- address
select * from address where city_id = 300;

-- city  id 300
select * from city where city_id = 300;

-- contry id 20
select * from country where country_id = 20;

-- 3개의 데이블 조인
select 
	co.country, ci.city, ad.address, 
    ad.address2,ad.district,ad.postal_code,ad.phone
from 
	country co, city ci, address ad
where 
	co.country_id = ci.country_id 
    and ad.city_id =ci.city_id
	and co.country like '%kor%'
;

-- 고객 정보 조회, 주소아이디
select * from customer;

-- erd : Databse - >ReversEnginering-> .... ... ..

select * from customer;

