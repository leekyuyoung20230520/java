drop database if exists bookrental ;
create database bookrental;
use bookrental;

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
