drop database if exists bookrental ;
create database bookrental;
use bookrental;

drop table if exists tbl_admin_member;
CREATE TABLE tbl_admin_member(
	a_m_no		INT 	AUTO_INCREMENT, 
	a_m_approval	INT	NOT NULL DEFAULT 0, 
	a_m_id		VARCHAR(20) 	NOT NULL, 
	a_m_pw		VARCHAR(100) 	NOT NULL, 
	a_m_name	VARCHAR(20) 	NOT NULL, 
	a_m_gender	CHAR(1) 	NOT NULL, 
	a_m_part	VARCHAR(20) 	NOT NULL,
	a_m_position	VARCHAR(20) 	NOT NULL,
	a_m_mail	VARCHAR(50) 	NOT NULL, 
	a_m_phone	VARCHAR(20) 	NOT NULL, 
	a_m_reg_date 	DATETIME, 
	a_m_mod_date	DATETIME, 
	PRIMARY KEY(a_m_no)
	);
    
    
select * from tbl_admin_member;    

drop table if exists tbl_user_member;
CREATE TABLE tbl_user_member(
	u_m_no		INT 	AUTO_INCREMENT, 	
	u_m_id		VARCHAR(20) 	NOT NULL, 
	u_m_pw		VARCHAR(100) 	NOT NULL, 
	u_m_name	VARCHAR(20) 	NOT NULL, 
	u_m_gender	CHAR(1) 	NOT NULL, 		
	u_m_mail	VARCHAR(50) 	NOT NULL, 
	u_m_phone	VARCHAR(20) 	NOT NULL, 
	u_m_reg_date 	DATETIME, 
	u_m_mod_date	DATETIME, 
	PRIMARY KEY(u_m_no)
	);
    
    select * from tbl_user_member;


drop table if exists tbl_book;
CREATE TABLE tbl_book(
	b_no				INT 	AUTO_INCREMENT, -- pk 자동증가 	
	b_thumbnail			VARCHAR(100),   		-- 표지 이미지	
	b_name				VARCHAR(30) 	NOT NULL, -- 도서 이름
    b_author			VARCHAR(20) 	NOT NULL, -- 저자 이름
    b_publisher			VARCHAR(20) 	NOT NULL, -- 출판사
    b_publish_year	char(4) 	NOT NULL, -- 출판년도
    b_isbn				VARCHAR(30) 	NOT NULL, -- ISBN
    b_call_number		VARCHAR(30) 	NOT NULL, -- 청구기호
    b_rantal_able		tinyint 	NOT NULL default 1, -- 청구기호    		
	b_reg_date 			DATETIME, 					-- 등록일
	b_mod_date			DATETIME, 					-- 수정일
	PRIMARY KEY(b_no)
	);
    
    select * from tbl_book;
