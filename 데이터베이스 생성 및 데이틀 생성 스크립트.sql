create database contacts;
use contacts;
create table person(
	name varchar(20),
    phone varchar(20),
    email varchar(20),
    primary key(phone)
);

insert into person(name,phone,email) 
values('김선달','010-000-0000','kim@gmail.com');

insert into person(name,phone,email) 
values('김달선','010-000-1111','dal@gmail.com');

select * from person;
