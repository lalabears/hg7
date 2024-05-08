/*

SQL : Structured Query Language
데이터를 정의, 조작, 제어 하기위해 사용되는 언어 
목적에따라서 3가지로 구분됨 
1. DDL (data definition language)
   데이터 베이스나 테이블을 생성, 삭제, 구조를 변경하기 
   위한 명령어  (create, alter, drop)	
2. DML (data manipulation language)
   데이터베이스에 저장된 데이터를 처리하거나
   조회, 검색하기 위한 명령어 (insert, update, delete, select 등)
3. DCL( data control language)
   데이터베이스에 저장된 데이터를 관리하기 위해 데이터 보안성 및
   무결성을 제어하기위한 명령어( grant, revoke 등)

테이블의 세로 줄 :  열(column), 필드(field), 속성(attribute)
테이블의 가로 줄 :  행(row), 튜플(tuple), 레코드(recode)
> 관계형 데이터 베이스는 테이블들이 다른 테이블들과 관계를 맺고 모여있는
집합체 

*/

-- 테이블 생성
/*
제약조건 
NOT NULL  : 해당필드는 NULL값을 저장할 수 없다.
UNIQUE     : 해당필드는 서로다른 값을 가져야한다. 
PRIMARY KEY: 해당필드는 NOT NULL+UNIQUE
FOREIGN KEY : 하나의 테이블을 다른테이블에 의존하게 만듦 
DEFAULT : 해당필드의 기본값을 설정함 
*/ 
CREATE TABLE RESERVATION
(
    ID NUMBER(2)  PRIMARY KEY,       -- NUMBER(2) : 정수 두자리
    NAME VARCHAR(30)   NOT NULL,        -- VARCHAR, VARCHAR2 문자30자리를 의미함 
    RESERVEDATE DATE,
    ROOMNUM INT
);

--   DROP TABLE RESERVATION;  -- 테이블 삭제 

CREATE TABLE MEMBER
(
    ID VARCHAR2(20) PRIMARY KEY,
    PW VARCHAR2(20),
    NAME VARCHAR2(20),
    PHONE VARCHAR2(20)
);
-- PRIMARY KEY : 고유하면서 비어있지 않도록 하는 키, 테이블당 한개. 테이블을 대표하는키
/*
학생 테이블을 생성해보세요 : STUDENTS
ID, NAME, KOR, ENG, MATH, TOTAL, AVG, RANK
ID랑 NAME은 VACHAR2 나머지는 NUMBER 
AVG -> NUMBER(4,1) 로 만드세요 

NUMBER(7,2)
숫자 7자리로 구성되어있으며
2자리는 소숫점이하
XXXXX.XX 를 의미 
*/
/*
create table 테이블이름 
(
   필드이름1   필드타입1,
   필드이름2   필드타입2, 
   .....
   필드이름3   필드타입3 
);*/

CREATE TABLE STUDENTS
(
    ID VARCHAR2(20),
    NAME VARCHAR2(20),
    KOR NUMBER(3),
    ENG NUMBER(3),
    MATH NUMBER(3),
    TOTAL NUMBER(3),
    AVG NUMBER(4,1), -- 총 4자리 수 인데 소숫점이1자리 인숫자 XXX.X 
    RANK NUMBER(4)
);

--  DROP TABLE 테이블이름; -- 테이블삭제

/*
레코드 삽입 INSERT 
1. insert into 테이블이름 (필드이름1, 필드이름2, .. )
   values (데이터값1, 데이터값2, ...) ;

2. insert into 테이블이름 values(데이터값1, 데이터값2,...);
*/
desc reservation;     --    ID   NAME   RESERVEDATE     ROOMNUM


insert into reservation (id, name, reservedate, roomnum) 
values (1, '홍길동','2024-05-08', 1001);
commit; -- 저장  
select * from reservation;

-- 유관순, 이순신의 정보도 입력해보세요 
insert into reservation (id, name, reservedate, roomnum) 
values (3, '이순신' ,'2024-05-08', 1003);
insert into reservation (id, name, reservedate, roomnum) 
values (2, '유관순','2024-05-08', 1002);
-- 추가하는 레코드는 반드시 모든 값을 가져야 할 필요는 없습니다. 
insert into reservation (id, name)
values(4, '강감찬');
-- 전체 필드를 추가할때 필드명을 생략할 수 있습니다. 
insert into reservation 
values (5,'김구','2024-05-08',1004);

-- 학생테이블 학생추가하기 
insert into students 
values('1','홍길동',100,100,100,(100+100+100),(100+100+100)/3,0);
commit;   -- 커밋한 순간 저장
rollback;  -- 커밋하기전 되돌리기 
select * from students;
-- 각각 다른점수로, 학생을 5번까지 입력해보세요  (유관순, 이순신, 김구, 강감찬)
insert into students 
values('2','유관순',90,95,80,(90+98+80),(90+98+80)/3,0);
insert into students 
values('3','이순신',95,85,80,(95+85+80),(95+85+80)/3,0);
insert into students 
values('4','김구',100,85,75,(100+85+75),(100+85+75)/3,0);
insert into students 
values('5','강감찬',90,80,100,(90+80+100),(90+80+100)/3,0);
-- 학생의 평균 순으로 정렬 해보기 
select * from students order by avg desc;
--평균이 80 점 이상인 학생의 이름과 평균을 출력해보기
select * from students where avg>=90;
/*
레코드 수정 update 

update 테이블이름
set 필드이름1=데이터값, 필드이름2=데이터값, ..
where 필드이름=데이터값 ; 
*/ 
select * from reservation;
-- 홍길동의 방번호를 1005로 변경하기 
update reservation set roomnum = 1005 where name='홍길동';
commit;
-- 만약에 where절을 생략한다면 - 전체가 변경된다 
update reservation set roomnum = 1006;
rollback;

-- 강감찬의 reservedate와 roomnum을 채워보세요 
update reservation set reservedate='2024-05-08' , roomnum=1007
where id=4;

update students set id='5' where name='강감찬'; 

/*
delete from 테이블이름
where 필드이름 = 데이터값 ; 

만약에 where절을 생략을하면.. 테이블에 저장된
모든 데이터가 삭제됨 
*/

-- 강감찬 삭제하기
-- delete from reservation where name='강감찬';
select * from reservation;
rollback;
-- delete from reservation;

-- 테이블을 삭제하는 명령어 
-- drop table 테이블이름 ;

select * from tab;  -- 사용자가 소유한 테이블의 정보를 알려줌
desc member;  -- member 테이블의 정보를 보여줌 

/*
insert into 테이블이름 (필드이름1, 필드이름2, .. )
values (데이터값1, 데이터값2, ...) ;

aaa 1111 홍길동 010-1111-1111
bbb 1111 이순신 010-2222-2222
ccc           김구
ddd   2222  유관순 
eee           고길동 010-3333-3333
*/
insert into member (id, pw, name, phone)  values ('aaa', '1111','홍길동','010-1111-1111'); 
insert into member  values ('bbb', '1111','이순신','010-2222-2222'); 
insert into member (id, name) values ('ccc', '김구'); 
insert into member (id, pw, name) values ('ddd', '2222','유관순'); 
insert into member (id, name, phone) values ('eee', '고길동','010-3333-3333'); 

select * from member;
commit;
/*
레코드 수정 
update 테이블이름
set 필드이름1=데이터값, 필드이름2=데이터값, ..
where 필드이름=데이터값 ; 

아이디가 ccc 인 사람의 비밀번호를 3333으로 수정하세요
아이디가 eee 인 사람의 비밀번호를 7777으로 수정하세요
아이디가 ddd인 사람의 전화번호를 010-5555-5555로 수정
*/
update member set pw = '3333' where id='ccc';
update member set pw = '7777' where id='eee';
update member set phone = '010-5555-5555', pw ='2222' where id='ddd';
select * from member;
commit;
/* 삭제 
delete from 테이블이름
where 필드이름 = 데이터값 ; 
아이디가 ccc인 사람의 정보를 삭제하세요  
*/
delete from member where id='ccc';

-- 테이블 삭제하기 
--  drop table students;

create table stu
(
    id varchar2(20) primary key,
    name varchar2(20),
    kor number(3),
    eng number(3),
    math number(3)
);
 -- 1 김서아 100, 90, 80  2 박이서 95, 80, 85    3 송아윤 80, 90, 95
 -- 4 채이준 95, 80,100   5 안서준 90, 100, 80   6 곽은우 85,95,80

insert into stu values ('1','김서아',100, 90, 80);
insert into stu values ('2','박이서',95, 80, 85);
insert into stu values ('3','송아윤',80, 90, 95);
insert into stu values ('4','채이준',95, 80,100);
insert into stu values ('5','안서준',90, 100, 80);
insert into stu values ('6','곽은우',85,95,80);
select * from stu;
commit;

-- 이름, 국어점수 만 가져와서 출력해보기
select name, kor from stu;
-- 이름, 영어점수로 출력하는데 국어점수의 순으로 (높은->낮은) 정렬하기
select name, eng, kor from stu order by kor desc;

select name as 이름, kor+eng+math as 총점, (kor+eng+math)/3 as 평균 
from stu 
order by 총점 desc;

