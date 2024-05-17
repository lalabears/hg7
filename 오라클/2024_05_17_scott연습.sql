/*
트랜잭션 : 하나의 단위로 데이터를 처리함.
a계좌 100만원 
b계좌   0원 
a -> b로 100 만원 이체 

1. a계좌 잔액을 변경 . update account set balance = 0 where ac_no = 'a'
2. b계좌 잔액을 변경 . update account set balance = 100만원 where ac_no = 'b'

-> a, b모두 0원 

1,2 가 모두 이루어지거나 1,2가 모두 안이루어진 상태여야함. 

트랜잭션은 더이상 분해할 수 없는 최소 수행단위. 이는 sql문들로 이루어져있음. 
TCL (transaction control language)  
*/
select * from member;
insert into member values('ccc','3333','김구','010-3333-3333',sysdate);
update member set name = '고길동' where id = 'bbb'; 
delete from member where id ='aaa';
select * from member;
-- 변경사항이 적용된 것을 볼수 있다. 
-- 이러한 트랜잭션을 취소하고 싶을 때 : rollback; 
rollback; 
select * from member; 
-- dml 모두 취소가 되었음을 확인 할 수 있다. 
insert into member values('ccc','3333','김구','010-3333-3333',sysdate);
update member set name = '고길동' where id = 'bbb'; 
delete from member where id ='aaa';
select * from member; 
-- 트랜잭션을 영구히 반영하고 싶을때 commit; 
-- rollback과는 달리 지금까지 수행한 결과를 데이터베이스에 영구 반영
commit; 
-- commit을 한 기점으로 데이터베이스에 영구히 반영된다. 
-- 영구히 반영했기때문에rollback 도 소용없음
rollback;
select * from member;


/*
commit / rollback 데이터상태. 
commit 이나 rollback 이전의 데이터상태. 
- 단지 메모리버퍼에만 영향을 받았기때문에 데이터의 변경 이전 상태로 복구가 가능함.
- 현재 사용자는 select문으로 결과를 확인할 수 있음.
- 다른 사용자는 현재 사용자가 수행한 명령의 결과는 확인 할 수 없음.
- 변경된행은 잠금설정이 되어서 다른사용자가 변경할 수 없음. 
commit 이후 데이터 상태 
- 데이터에 대한 변경사항이 데이터베이스에 반영됨.
- 이전데이터는 영구적으로 사라짐
- 모든사용자가 결과 확인이가능
- 관련행은 잠금이 풀리고 다른사용자도 조작이 가능
rollback 이후 데이터 상태
- 데이터 변경이 취소됨
- 이전데이터 다시복구
- 관련행은 잠금이 풀리고 다른사용자도 조작이가능
commit/rollback 효과
- 데이터 무결성 보장가능
- 데이터를 영구적 변경 전 변경사항을 확인 할 수 있음 */

/*
세션 : 어떤 활동을 위한 시간이나 기간을 뜻함. 
데이터베이스에 접속해서 관련 작업 수행 후 종료 전까지 기간

데이터베이스는 여러사람이 동시에 접근해서 데이터를 관리하고 사용하는 것을 목적으로 하기때문에
수많은 사람들의 세션이 동시에 연결되어 있다. 

트랜잭션은 dml이 모인 하나의 작업단위를 뜻함. 세션내부에는 하나이상의 트랜잭션이 존재함.
접속해서 종료하기까지를 세션이라고 하기때문에 세션의 범위가 트랜잭션보다 크다. 
*/

select * from member;

delete from member where id='bbb';
select * from member;

commit; 

-- 커밋이후에 두개의 결과가 같이 조회되는 것을 확인 할 수 있다.
-- 커밋을 하면 데이터베이스에 데이터가 완전히 반영되기 때문에. 

-- lock : 수정중인 데이터접근을 막는다. 
-- 특정 세션에서 조작중인 데이터는 트랙잭션이 완료(롤백/커밋)
-- 되기 전까지 다른세션을 조작할 수 없음 

select * from member;
update member set name='홍길동' where id='ccc';
select * from member; 

-- 먼저 작업한 세션에서 commit/rollback을 하지않으면
-- lock이되어서 대기하게된다. 
commit;

-- sqldeveloper에서 커밋을 한 순간 cmd에서 작업이 이루어짐을 
-- 확인 할 수 있다.

select * from member; 

-- 사용자 관리 
/*
1. 사용자 생성 

create user 사용자이름(필수) identified by 비밀번호(필수)

사옹자 계정생성은 일반적으로 데이터베이스 권한을 가진 사용자가 권한을 가진다. 
오라클은 설치할때 자동적으로 sys, system이 데이터베이스 관리 권한을 갖는 사용자다.
비밀번호는 설치할때 설정하는것. 

- oracle 12 버전 이상부터 계정에 c##을 붙여야함 
alter session set "_oracle_script" = true ; -- c## 생략가능하게 해줌

create user otest identified by 1111 ; 
--             사용자이름              비밀번호 

grant를 사용해서 권한을 부여. 
-- 데이터베이스에 접근할 수 있는 권한. 

grant create session to 사용자. 
-- grant create session to otest ;

-- 사용자 정보조회 
select * from all_users where username='OTEST';
select * from dba_users where username='OTEST';
select * from dba_objects where username='OTEST'; 

-- 사용자의 비밀번호를 변경 (system 으로 해야함. )
alter user otest identified by 1234; 
-- otest의 비밀번호를 1234로 변경함. 

-- 사용자 삭제 
drop user otest; 

*/
/*

-- 권한관리 
grant [시스템권한] to [사용자이름] [with admin option]; 
-- with admin option은 현재 부여받은 권한을 다른 사용자에게 부여할 수 있는 권한을 부여. 
1. resource 는 객제(생성, 수정, 삭제) 데이터(입력, 수정, 조회, 삭제) 권한 
=> 보통 사용자를 생성하면 create session, resource 권한은 부여한다. 
2. dba는 데이터베이스를 관리하는 시스템의 대부분의 권한. 
=>    grant connect, dba, resource to 유저명 ; -- 모든권한 주기. 
-- 권한을 취소 
revoke [시스템권한] from [사용자이름]; 
-- 해보세요 
ostudy 라는 사용자를 생성하고. 
resource, create session 권한을 주세요 . 
    -> ostudy라는애는 테이블을 만들 수 있음.  insert into로 자료도 넣을 수 있음. 

alter session set "_oracle_script" = true ; 


sqlplus system/1234
alter session set "_oracle_script" = true ;
create user scott identified by tiger;
grant connect, resource, dba to scott;
revoke 

*/

-- 오라클 다 까먹어도 이것만은 기억하자. 
-- 1. 멤버십테이블
create table membership
(
    id varchar2(30) primary key ,
    name varchar2(30) not null, 
    pw varchar2(30) constraint mem_pw_ck check ( length(pw)>3 ) ,
    age number(3),
    gender varchar2(30),
    jdate date default sysdate
);
-- 2. 보드테이블 만들기                             b_seq
create table board
(
    bno number(4) primary key, 
    id varchar2(30) not null, 
    title varchar2(100),
    cdate date, 
    hit number(4) default 0, 
    constraint mem_fk_id foreign key(id) references membership(id) on delete cascade
);

alter table membership modify(gender varchar2(30)); 
delete from membership;
commit;
select * from membership;

/*  innis 의 아이디를 aaa   court 의 아이디를 bbb  temp의 아이디를 ccc   */

update membership set id = 'aaa' where name='Innis';
update membership set id = 'bbb' where name='Court';
update membership set id = 'ccc' where name='Temp';
commit; 

select   rownum,   m.*     from membership m ;
select   row_number() over (order by jdate) row_num,    m.*    from membership m;

-- ddd , 홍길동, 1234, 22, Male, sysdate  한명의 데이터를 테이블에 추가해주세요 . 
-- 1. insert . 
insert into membership ( id, name, pw, age, gender, jdate )  values 
                                ('ddd','홍길동','1234',22,'Male',sysdate); 
-- 2. update를 사용해서 aaa의 이름을 유관순으로 변경해보세요 
update membership set name='유관순' where id ='aaa'; 
-- 3. delete를 사용해서 ccc의 정보를 삭제해보세요 
delete from membership where id='ccc'; 


-- 4. 보드테이블에 홍길동이라는 사람이 안녕하세요 반갑습니다 라는 글을 오늘자로 
-- 남긴데이터를 db에 넣어보세요 
 insert into board (bno, id, title, cdate, hit) values 
 ( b_seq.nextval, 'ddd','안녕하세요 반갑습니다' , sysdate, 0) ;
 commit;
 select * from board;
-- bbb 라는 아이디가 다음글로 '처음인사드립니다' 오늘날짜로 남기기. 
 insert into board (bno, id, title, cdate, hit) values 
 ( b_seq.nextval, 'bbb','처음인사드립니다' , sysdate, 0) ;
-- aaa 라는 아이디를 가진 사람도 '반가워요' 오늘 날짜로 남기기. 
 insert into board (bno, id, title, cdate, hit) values 
 ( b_seq.nextval, 'aaa', '반가워요' , sysdate, 0) ;

-- ddd 라는 멤버가 탈퇴를 했습니다. 정보를 삭제해 주세요 
delete from membership where id = 'ddd';
commit;
--  보드를 조회해보세욤
select * from board;

-- dml :   insert, update, delete   + create table, drop table. 
-- 제약조건들, primary key, foreign key  

-- select 
-- Q. 가입한 날짜순으로 정렬해보세요 (최신 > 오래된순)  membership
select * from membership order by jdate desc;
-- Q. 남성 중 30대 사람들을 나이순(어린> 많은), 가입일순( 최신>오래된순) 으로 정렬 
select * from membership 
where gender='Male' and age between 30 and 39 
order by  age asc, jdate desc; 
-- Q. 이름에 a 가 들어간 사람을 검색해보세요 
select * from membership where name like '%a%'; 
-- Q. 평균 나이를 출력해보세요 
select round( avg(age), 1)  from membership;
-- Q. 이름이 n으로 끝나는 사람을 출력
select * from membership where name like '%n';
-- Q. 여성, 남성이 아닌 사람들 출력 
select * from membership where gender != 'Male' and gender !='Female';
select * from membership where gender not in ('Male','Female');
-- Q. 두번째글자가 m인 사람 출력
select * from membership where name like '_m%';
select * from studata;
-- total 에 값 넣기
update studata set total = kor+eng+math ; 
select * from studata;
commit;
-- avg 에 값 넣기
update studata set avg = total/3; 
-- rank 출력이 가능하면 한번 출력 해보세요 . 
select stuid, rank() over (order by total desc ) as  ranks   from studata; 
-- rank 에 값 넣기 
update studata a set rank =  
(  select ranks  from  ( select stuid, rank() over (order by total desc ) as  ranks   from studata ) b
where a.stuid= b.stuid    );
select * from studata order by rank;

---------------------------------------------------------------------------------------------------
select * from reservation; 
select * from order_info; 
-- Q. 공통 컬럼을 찾아, 예약 번호, 예약일, 아이템아이디, 판매가를 출력해보세요 
select a.reserv_no 예약번호, a.reserv_date 예약일 , b.item_id 아이템, b.sales 판매가
from  reservation a, order_info b
where a.reserv_no = b.reserv_no;
-- Q. 예약이 취소되지 않은것 (cancel N인것) + 예약날짜가 20170101에서 20171231인것을 출력.
select a.reserv_no 예약번호, a.reserv_date 예약일 , b.item_id 아이템, b.sales 판매가
from  reservation a, order_info b
where a.reserv_no = b.reserv_no
and a.cancel = 'N'
and a.reserv_date between '20170101' and '20171231' ;
-- Q. 월별 추이를 보고싶으므로 날짜를 잘라서 출력해보세요 
--    (reserv_no,  날짜 201701로 출력되게 (년월), item_id, sales  정보 출력 )
select a.reserv_no 예약번호, substr(a.reserv_date,1,6) 년월 , b.item_id 아이템, b.sales 판매가
from  reservation a, order_info b
where a.reserv_no = b.reserv_no
and a.cancel = 'N'
and a.reserv_date between '20170101' and '20171231'
order by a.reserv_date;
-- Q.월별로 그룹해서 월별 총 판매가를 출력  년월 별 총 판매가 출력  

select   substr(a.reserv_date,1,6) 년월 , sum( b.sales ) 총판매가
from  reservation a, order_info b
where a.reserv_no = b.reserv_no
and a.cancel = 'N'
and a.reserv_date between '20170101' and '20171231'
group by  substr ( a.reserv_date,1,6)
order by   substr ( a.reserv_date,1,6)  ;
-- 고객51이 사는 구를 출력해보세요  address customer테이블을 사용  >zipcode 
select a.ADDRESS_DETAIL from address a, customer c where a.zip_code = c.zip_code
and c.customer_name='고객51';

select CUSTOMER_ID, CUSTOMER_NAME from  customer 
where CUSTOMER_ID in
(select CUSTOMER_ID from reservation where VISITOR_CNT > 10) ;
-- 학생(job)이 방문한 브랜치 이름도 한번 출력해보세요 
select distinct(BRANCH) from reservation where CUSTOMER_ID in 
(select CUSTOMER_ID from customer where job = '학생');