/* 테이블이름 mem
id 숫자 4자리
name 문자열 20 자리
email  문자열의 50자리
gender 문자열의 20자리
age 숫자의 3자리 
jdate date  */
create table mem
(
    id number(4),
    name varchar2(20),
    email varchar2(50),
    gender varchar2(20),
    age number(3),
    jdate date
);
-- 가지고있는 테이블의 정보를 보여줌 
select * from tab;
-- 테이블의 구조를 볼 수 있음 desc 테이블이름
desc mem;
select * from mem;
-- Q. 101, 'gildong', 'hong@aa.com','male', '24/01/01' 정보를 입력하세요
-- insert into 테이블이름(컬럼명) values(값들);
insert into mem(id, name, email, gender, jdate) values( 101, 'gildong', 'hong@aa.com','male', '24/01/01' );
-- Q. 아이디가 5인 사람의 나이를 30으로 변경하세요 
-- update 테이블이름 set 변경할값 where 조건절; 
update mem set age = 30 where id = 5 ; 
-- Q. 아이디가 101인 사람의 정보를 삭제하세요 
-- delete from 테이블이름 where 조건절 ;
delete from mem where id = 101; 
-- Q. 가입한 날짜순 정렬하세요 (최근 > 과거)
select * from mem order by jdate desc;
-- Q. 나이가 30이상 40 이하인 사람들을 출력하세요
select * from mem where age between 30 and 40 order by age;
-- Q. 나이의 역순, 이름 순으로 정렬하세요 
select * from mem order by age desc, name;
-- Q. 남성(male) 중에서 20대인 사람을 나이순, 가입일의 역순으로 출력하세요
select * from mem where gender= 'Male' and age between 20 and 29 
order by age, jdate desc;
-- Q. 여성(female) 남성(male)이 아닌 사람을 출력하세요 not in, 
select * from mem where gender not in( 'Male' ,'Female'); 
-- Q. 이름에 on이 들어간 사람을 검색하세요  like
select * from mem where lower(name) like '%on%';
-- Q. 이름이 a로 끝나는 사람을 검색하세요  like
select * from mem where lower(name) like '%a';
-- Q. 이름의 두번째 글자가 o인 사람을 출력하세요 like 
select * from mem where lower(name) like '_o%';
-- Q. 이메일에 com을 포함하지 않는 사람을 출력하세요 not like 
select * from mem where lower(email) not like '%com%';
-- Q. 이름의길이, 이메일의 길이를 출력하세요  length()
select name, length(name), email, length(email) from mem;
-- Q. 이메일의 @ 이하의 뒷부분을 잘라서 출력해보세요 instr, substr
select email, instr(email, '@') from mem;
select email, substr(email, instr(email, '@')+1) from mem;

-- Q. 아이디가 짝수인 사람들만 검색해보세요 mod()
select * from mem where mod(id,2) = 0;
-- Q. 나이가 가장어린 사람을 1등으로하는 랭크를 출력해보세요 (중복 순위는 건너뛰는) 
select  id, name, age, rank() over(order by age ) as "나이순위" 
from mem; -- 나이가 어린->높은 
-- Q. 나이가 가장많은 사람을 1등으로하는 랭크를 출력해보세요 (중복 순위는 건너뛰지않는)
select id, name , age,
        dense_rank() over( order by age desc ) as "나이순위"
from mem;

-- Q. decode를 사용해서 성별이 female이면여성, male이면 남성 그외 로 출력
select id, name, gender,  
        decode(gender,'Female', '여성', 'Male','남성','그외') as 성별
from mem;
-- Q. case를 사용해서 10대 20대 30대 40 대 50대  출력
select id, name, age, gender,
    case
        when age between 10 and 19  and gender='Female' then '10대 여성'
        when age between 10 and 19  and gender='Male' then '10대 남성'
        when age between 20 and 29 then '20대'
        when age between 30 and 39 then '30대'
        when age between 40 and 49 then '40대'
        when age between 50 and 59 then '50대'
        else '60대'
    end as 나이   
    from mem  order by age; 

select * from reservation;
select * from tab;

create sequence test_seq
increment by 1
start with 1
maxvalue 1000000
minvalue 1 ;

select test_seq.nextval from dual;  -- 
select test_seq.currval from dual;  -- 현재의 시퀀스를 보는 방법 

select * from reservation;
-- delete from reservation; 
commit;
insert into reservation values( r_seq.nextval , '이순신' , sysdate, 1003);
select r_seq.currval from dual; --- 현재의 시퀀스 확인
select r_seq.nextval from dual; 
insert into reservation values( r_seq.nextval , '김구' , sysdate, 1004);


-- drop table studata;
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
select * from studata;
-- stu_seq 를 만드시고 
-- 시퀀스 테이블을 201번부터 생성이 되게 만들어보세요
-- 그리고 그 시퀀스 테이블을 사용해서 
-- 201 홍길동 100,100,100 을 insert 해보세요
-- 202 유관순 90, 90, 90 
-- 203 고길동 95,100, 80 
insert into studata (stuid, stuname, kor, eng, math)
values (stu_seq.nextval, '홍길동',100,100,100); 
insert into studata (stuid, stuname, kor, eng, math)
values (stu_seq.nextval, '유관순',90,90,90); 
insert into studata (stuid, stuname, kor, eng, math)
values (stu_seq.nextval, '고길동',95,100,80); 
select * from studata order by stuid desc;
commit;

-- drop sequence 시퀀스이름;


/*
create sequence 시퀀스테이블이름 
increment by n    > n씩 증가시키겟다 
start with n         > 시퀀스의 시작값이 n이다 
minvalue  n         > 시퀀스의 최소값
maxvalue  n         > 시퀀스의 최대값
nocycle(or cycle)  >최대값 도달시 최소값부터 시작할지 여부 
nocache(or cache) > 캐시를 사용할지여부 캐시를 사용해 미리 값을 할당할지..

시퀀스이름.nextval   > 다음시퀀스를 출력 
시퀀스이름.currval   > 현재시퀀스값을 출력 (한번도 안부르면 오류)
*/




