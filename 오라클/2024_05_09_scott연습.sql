 -- 사용자가 소유한 테이블 정보를 알려줌
select * from tab ; 
-- 테이블의 구조를 살펴보기  : desc 테이블이름
desc member;
/* 테이블 만들기 
create table 테이블 이름
(   
    필드이름1 필드타입1 제약조건1, 
    필드이름n 필드타입n 
);

제약 조건 : not null        -  null 값을 저장할 수 없다. 
                unique         -  서로다른 값을 가져야 한다. 
                primary key   - 테이블당1개, 대표키, not null + unique
필드 타입 : varchar2(30)  - 30자리 문자열 
                number(2)     - 2자리 숫자 
                number(5,2)   - 총5자리 숫자, 소수점이하가 2자리 xxx.xx
*/
create table test 
( 
    id varchar2(20) primary key ,
    pw varchar2(20) not null, 
    name varchar2(20)
);
desc test;
/* 레코드 삽입  - insert 
1. insert into 테이블이름 (필드명1, ... 필드명n) 
    values(데이터값1,.... 데이터값n);
2. insert into 테이블이름 values(데이터값1,.... 데이터값n);
*/
insert into test (id, pw, name) values('aaa','1111','홍길동');
insert into test values('bbb','2222','유관순');
insert into test (id, pw) values ('ccc','3333');
commit;   -- 실행문을 저장하기 
rollback; -- 실행문 되돌리기 
select * from test;
--Q1.   ddd, 4444, 고길동 넣어보세요
insert into test values('ddd', '4444', '고길동');
--Q2.    eee, 5555를 입력해보세요
insert into test(id, pw) values('eee','5555');
/* 레코드 수정 - update 
update 테이블이름
set 수정할필드명 = 수정될값 , .. 
where 필드명 = 데이터값
*/
update test set name='홍길자' where id='aaa';
update test set name='김구', pw='1234' where id='bbb';

-- Q1.  아이디가 ccc인 사람의 이름을 강감찬으로, 비번은 9999로 바꾸기
update test set name='강감찬', pw='9999' where id='ccc';

-- Q2.  아이디가 eee인 사람의 이름을 박문수로 변경하기 
update test set name='박문수' where id ='eee';


/* 레코드 삭제 
delete from 테이블이름 
where 필드이름=테이블값 ; 
만약에 where절을 생략하면 테이블에 저장된 모든데이터가 삭제가 됩니다. 
*/
 delete from test where id = 'bbb';

-- Q1. 아이디가 ccc인 사람을 삭제해 보세요 
-- delete from test where id = 'ccc';
commit;
select * from test;

/* 테이블 삭제 . 
drop table 테이블이름; 
*/
-- drop table test;

select * from tab;

-- 테이블 만들기 
CREATE TABLE studata (
    stuid   NUMBER(4),
    stuname VARCHAR2(20),
    kor     NUMBER(3),
    eng     NUMBER(3),
    math    NUMBER(3),
    total   NUMBER(3),
    avg     NUMBER(5, 2),
    rank    NUMBER(3)
);
/*
update 
set 
where 만약에  조건절을 사용하지 않으면 전체 컬럼을 업데이트 시킨다
*/
 
-- 1. update로  stuid=1인 학생의 총점, 
update studata set total=kor+eng+math where stuid=1; 
-- 2 . 평균을 넣어보세요 
update studata set avg =total/3 where stuid=1; 
rollback;
-- 3. 전체 학생의 총점과 평균을 넣어보세요 
update studata set total=kor+eng+math; 
update studata set avg =total/3 ;
commit;
-- 4. Rank 전체 0을 넣어보세요 
update studata set rank = 0 ;

select * from studata;
-- Q1. 국어성적이 90점이상 95점 이하인 학생 검색 
select * from studata where kor between 90 and 95;
-- Q2. 총점이 280 이거나 290 이거나 300인 학생 검색 
select * from studata where total in (280, 290, 300);
-- Q3. 이름에 li가 포함된 학생 검색 
select * from studata where lower(stuname) like '%li%';
-- Q4. 이름이 s로 끝나는 학생 검색 
select * from studata where lower(stuname) like '%s';
-- Q5. 두번째 글자가 a인 학생 검색 
select * from studata where lower(stuname) like '_a%';
-- Q6. 국어가 90점이상이고 영어가 90점이상이고 수학이 90점이상인 학생을 총점순으로 정렬
select * from studata where kor>=90 and eng>=90 and math>=90
order by total; 
-- Q7. 평균이 90이상 100이하인 학생을 수학성적순으로 정렬 
select * from studata where avg between 90 and 100 order by math desc; 
-- Q8. 이름에 a를 포함하지 않는 학생 검색 
select * from studata where lower(stuname) not like '%a%';

-- Q1. 수학점수는 순차정렬로, 같을경우 국어점수 역순으로 정렬 
select * from studata order by math, kor desc;
-- Q2. 수학점수는 역순으로 정렬하고 같은경우 이름알파벳순으로 정렬 
select * from studata order by math desc, stuname;


-- drop table member;

create table member 
(
     id  varchar2(20) primary key,  -- not null, unique
     pw varchar2(20),
     name varchar2(20),
     phone varchar2(20),
     cdate date
);
-- 레코드삽입
insert into member 
values('aaa', '                1111', '홍    길동','010-1111-1111       ', sysdate);
commit;
select * from member;

-- pw의 길이 출력해보기 

select length(pw) from member;

-- replace : 문자를 바꿀수 있다, 공백을 없앨 수 있다. 
select pw, replace(pw, '1','2') from member;
-- ' ' > ''
select pw, replace(pw, ' ',''), length(replace(pw, ' ','')) from member;

-- trim, ltrim, rtrim 
-- trim : 양쪽공백제거 
-- ltrim : 문자열의 왼쪽 공백제거 
-- rtrim : 문자열의 오른쪽 공백제 

select '     공백       ', trim('     공백       '), ltrim('     공백       '),
rtrim('     공백       '),  ltrim(rtrim('     공백       ')) from dual; 

-- update 를 사용해서 pw공백을 제거해보자 
update member set pw = ltrim(pw); 
commit;
select pw, length(pw) from member;

--Q. phone번호의 공백을 제거해서 저장해보세요 
update member set phone = rtrim(phone);
update member set phone = trim(phone);
update member set phone = replace(phone,' ','');
select phone, length(phone) from member;
--Q. 이름의 공백을 제거해서 저장해보세요 
update member set name = replace(name,' ','');
commit;
select name, length(name) from member;

-- concat : 문자열 합치기 
select concat(id, concat('-',pw)) from member;
-- || '-' ||
select id || '-' || pw from member; 

-- Q. 이름의 국어점수 : 점수 를 출력해보세요 -  studata 테이블에서 출력 ex) jhone의 국어점수 : 80
select stuname || '의 국어점수 : ' || kor from studata;

-- 문자열 채우기 
-- lpad(값, 총문자길이, 채울문자)
-- rpad(값, 총문자길이, 채울문자) 
select lpad(id,10,'*') from member;
select rpad(id,10,'*') from member;

-- 날짜. sysdate : 현재 날짜 
select sysdate as 오늘, sysdate+1 as 내일, sysdate-1 as 어제 from dual; 

-- months_between : 두 날짜사이가 몇개월인지 반환해준다. 
select sysdate, '24/01/01', months_between(sysdate, to_date('24/01/01')) from dual;

insert into member values('bbb','2222','유관순','010-2222-2222','22/01/01');
commit;
select * from member;
select sysdate, cdate, months_between(sysdate, cdate) from member; 

-- add_months() : 특정 날짜 개월수를 더한다. 
select sysdate, add_months( sysdate, 6) from dual;

-- to_char() 문자형으로 반환하는 함수 
select sysdate, 
        to_char(sysdate, 'YY'),
        to_char(sysdate,'YYYY'),
        to_char(sysdate,'MM'),
        to_char(sysdate,'MON'),
        to_char(sysdate, 'YYYYMMDD'), to_char(sysdate, 'YYYY/MM/DD'),to_char(sysdate, 'YYYY-MM-DD'),
        to_char(sysdate, 'HH-MI-SS'),
        to_char(to_date('20170126'), 'YYYYMMDD')
from dual;
-- to_date() 문자형을 날짜형으로 변환하는 함수 
select to_date('20170126','YYMMDD') from dual;

-- to_number() :문자를 숫자로 바꿔줌
select to_number('123') from dual;

-- 수학 함수들 
-- abs : 절대값 
select -10, abs(-10) from dual; 
-- floor : 버림 
select floor(10.2345) from dual;
-- round : 반올림 
select round(10.72345) from dual;
select round(10.789 , 2) from dual;
select round(19.9876, -1) from dual; -- 마이너스 경우에는 정수 첫째자리에서 반올림 
select round(total/3, 4), avg from studata;

-- trunc : 특정자리수에서 버림 
select trunc(34.5678, 2) from dual ;
select total/3 ,trunc(total/3, 4), avg from studata;

-- mod : 입력받은수를 나눈 나머지값을 반환 
select mod(27,2) from dual;   -- 27을 2로 나눈 나머지가 1이기 때문에 1을 반환해줌 

-- 국어점수가 짝수인 학생을 출력 
select * from studata where mod(kor,2) = 0 ;

-- Q1. 학생번호가 홀수인 학생들만 검색해보세요
select * from studata where mod(stuid, 2) = 1;
-- Q2. 학생번호가 5의 배수인 학생들만 검색해보세요 
select * from studata where mod(stuid, 5) = 0 ;

-- 순위 함수 . 
-- rank() : 공통순위를 출력하되, 공통순위만큼 건너뛰어 다음 순위를 출력해줌 
-- dense_rank() : 공통순위를 출력하되, 건너뛰지 않고 다음 순위를 출력해줌
-- row_number() : 공통순위 없이 출력 
/*
rank() over(  [  partition by 열이름b  ] over by 열이름a  )
열이름b : 그룹으로 순위를 묶어서 순위를 매겨야 할 때 사용
열이름a : 순위를 매길 열 
*/
select stuid, stuname, total, 
         rank() over (order by total desc) as "rank()함수 사용",
         dense_rank() over (order by total desc) as "dense_rank()함수 사용",
         row_number() over (order by total desc) as "row_number()함수 사용"
from studata ; 



