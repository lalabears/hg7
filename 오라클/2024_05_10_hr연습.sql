/*
select [distinct] 열이름 [as 별명]
from 테이블이름
[where 조건식]
[order by 열이름 [asc or desc] ] ; 

 [  ] : 생략가능 선택사항 
 distinct : 중복행제거 
 * : 모든열 출력 
 별명 : 원칙적으로 as 뒤에 쌍따옴표안에 사용함.
         띄어쓰기, 특수기호는 쌍따옴표안에 사용해야함
where : 조건을 만족하는 행들만 검색
조건식 : 조건문으로  and or 로여러개 사용할 수 있음 
order by : 결과정렬을위한 옵션 desc : 내림차순 asc: 오름차순 (생략가능)
*/

select employee_id, department_id 
from employees 
order by department_id;

select * from employees 
where salary > 7000
order by salary desc; 

select * from employees 
where salary > 7000
order by salary desc,  hire_date ; 

select * from employees where department_id in (10, 50, 90)
order by department_id, salary desc; 

select * from employees 
where department_id = 10 or department_id = 50 or department_id = 90
order by department_id, salary desc; 

select * from employees 
where salary between 5000 and 8000
order by salary desc, first_name; 

-- not :  not, !=, ^= , <>
select * from employees 
where not department_id=50 order by department_id;
select * from employees 
where department_id !=50 order by department_id;

select * from employees where department_id not in (80,90,100)
order by department_id desc;

select * from employees where salary not between 5000 and 8000
order by salary; 

-- SQL에서는 문자열이나 날짜는 단일따옴표안에 표기해야한다. 
-- 따옴표안에 문자는 대소문자를 구별합니다. 
select * from employees where first_name = 'john' ;
select * from employees where first_name = 'John' ;

-- lower() > 소문자로, upper() > 대문자로 , initcap()>첫글자만대문자 함수를 사용
select * from employees where lower(first_name) = 'john' ;
select * from employees where upper(first_name) = 'JOHN' ;
select * from employees where initcap(first_name) = 'John' ;

select email, lower(email), initcap(email) from employees; 

-- 포함된 글자를 찾을때는 like를 사용한다. 
-- 이름에 s가 포함된 사람을 찾는다면 .. 
select * from employees where lower(first_name) like 's%'; 
select * from employees where lower(first_name) like '%s'; 
select * from employees where lower(first_name) like '%s%';

-- 언더바는 문자수를 나타낸다. 
select * from employees where email like '_A___';

--이름에 두번째 글자가 e인 사원을 찾는다면. 
select * from employees where lower(first_name) like '_e%';

-- 이름에 e가 포함되지 않는사원을 찾는다면 .. 
select * from employees where lower(first_name) not like '%e%';

-- 이름에 두번째 글자가 e가 아닌 사원을 찾는다면 ... 
select * from employees where lower(first_name) not like '_e%';

-- null 가지는 열들만 출력 
select * from employees where manager_id is null; 
-- null 가지지 않는 열들만 출력 
select * from employees where manager_id is not null;

-- length : 컬럼의 문자열 길이를 반환, 공백을 포함함. 
select email, length(email) from employees; 

-- substr : 문자열을 추출해주는 함수 
-- substr('john',2) > 문자열의 두번째 위치 o부터 끝까지 자른다 
-- substr('john',1,2) > 문자열의 첫번째위치부터 두글자 jo 자른다. 
select email, substr(email, 2) from employees;
select email, substr(email, 1,3) from employees;

-- instr : 특정문자의 위치를 찾아주는 함수 
select instr( 'h01.html' ,  '.' ) from dual; 

select 'h01.html', instr('h01.html','.'), 
substr('h01.html', instr('h01.html','.')+1)  from dual;

-- replace : 문자를 바꿔준다. 
select '   aa     bb    ' , replace('   aa     bb    ', 'a','c') from dual; 
select '   aa     bb    ' , replace('   aa     bb    ', ' ','') from dual; 

-- trim(), rtrim(), ltrim()
select '   aa     bb    ' , trim('   aa     bb    ') ,
rtrim('   aa     bb    ') ,ltrim('   aa     bb    ') 
from dual; 


-- 현재 날짜 sysdate 
select sysdate, sysdate+1, sysdate-1 from dual; 

-- floor : 버림 , round 반올림 , trunc : 특정자리수에서 버림 
select round(10.789) from dual;
select floor(10.789) from dual;
select round(10.789, 2) from dual;
select trunc(10.789, 2) from dual;
-- mod : 입력받은수를 나눈 나머지 값을 반환 
select mod(27,2) from dual;
-- 사원번호가 홀수인사람을 출력
select * from employees where mod(employee_id,2)=1 order by employee_id;

-- 순위함수 
-- rank()                   : 공통순위는 출력하고, 공통순위만큼 건너뛰어 다음순위 출력 
-- dense_rank()         : 공통순위는 출력하고, 공통순위를 건너뛰지 않고 다음순위 출력 
-- row_number()       : 공통순위 없이 출력
/*
rank() over( [partition by 열이름1] order by 열이름2)
열이름2 : 순위를 매길 열 
열이름1 : 그룹으로 묶었을때 사용을 할예정.. 
*/
select employee_id, salary, 
         rank() over(order by salary desc) as "rank함수 급여" ,
         dense_rank() over(order by salary desc) as "dense rank함수 급여" ,
         row_number() over(order by salary desc) as "row num함수 급여" 
from employees;

-- decode (열이름, 조건값, 값1, 값2) 
-- 만약에 열이름이 조건값과 같다면 값1, 아니면 값2
-- decode(열이름, 조건값1, 값1, 조건값2, 값2, 값3)
-- 만약에 열이름이 조건값1과 같으면 값1, 조건값2와 같으면 값2, 그외 값3)
select first_name, salary,  department_id,
        decode( department_id, 50, salary*1.1, salary) as 새로운급여
from employees;

select first_name, department_id, 
        decode(department_id,100, 'IT', 90,'HR','그외') as 부서명
from employees;

-- case  다양한 조건이 주어질때 . 
/*
    case 
            when 조건1 then 출력1
            when 조건2 then 출력2...
            when 조건n then 출력n
            else 출력x
    end as 별명
*/
select employee_id, first_name, 
    case
        when salary >= 9000 then '상위'
        when salary between 6000 and 8999 then '중위'
        else '하위'
    end as 급여등급
from employees; 

-- 그룹함수 : 열에대한 계산을 해줌 
-- count() 개수를 세줌 count(*) null 값도 세준다. 

select count(*) from employees;

select count(*), count(employee_id), count(manager_id) from employees; 

select count(*), count(manager_id), count(commission_pct) from employees;

select count(*) 전체 , count(commission_pct) 커미션, count(*)-count(commission_pct) 노커미션 
from employees; 

select count(*) from employees where commission_pct is null; 

-- sum() 합계 
select sum(salary) from employees; 
select sum(salary) as 총월급여,
        sum(salary)*0.1 as 인상분, 
        sum(salary)*1.1 as "변경후 총급여"
from employees; 

select sum(salary) as 총월급여, 
        trunc(sum(salary)*0.1) as 인상분,
        round(sum(salary)*1.1) as "변경후 총급여"
from employees;

-- avg() 평균 함수 
select avg(salary) from employees;
select round(avg(salary), 2) from employees;

-- min(), max()
select max(salary) from employees; 
select min(salary) from employees; 

-- where 도 select문을 사용할 수 있다. 
select first_name, salary from employees
where salary < ( select avg(salary) from employees );

-- Q. department_id 가 10인 사람들 중에서 커미션(commission_pct)을 받는 사원의 수 (count)
select count(commission_pct) from employees where department_id = 80 ;
select count(*) from employees where department_id = 80  and commission_pct is not null; 

-- Q. department_id가 60인 사람들의 월급의 합 (sum)
select sum(salary) from employees where department_id=60; 
-- Q. 월급이 평균이상인 사람들의 수 (count)
select count(*) from employees 
where salary >= (select avg(salary) from employees);

-- group by : 합계, 평균, 최대값, 최소값 등 어떠한 컬럼을 기준으로 그 컬럼별 값을 보고자 할때
--                 group by 절 뒤에 해당 컬럼을 기술 
-- group by 뒤에는 반드시 컬럼명을 기술해야함(별칭은사용할 수 없음)
/*
select 컬럼명, 그룹함수(컬럼명)
from 테이블명
[where 조건식]
group by 컬럼명
[order by 컬럼명]
*/
-- 그룹함수의 종류 : sum, avg, count, count(*), min, max 등이 있다. 
select job_id, salary from employees; 
select avg(salary) from employees; 
select job_id, avg(salary) from employees group by job_id; 

select job_id 직무, 
        sum(salary) 직무별_총급여, 
        avg(salary) 직무별_평균급여
from employees
where employee_id >= 150
group by job_id
order by 직무별_총급여 desc, 직무별_평균급여; 

select department_id, sum(salary), count(*)
from employees
group by department_id
order by department_id;

-- Q. 부서별(department_id)로 사원의 수와 커미션을 받는 사원의 수 
select department_id, count(*), count(commission_pct) 
from employees
group by department_id; 

-- Q. 부서별 최대급여와 최소급여 
select  department_id, min(salary), max(salary)
from employees
group by department_id
order by department_id; 


CREATE TABLE students (
    stuid   NUMBER(4),
    stuname VARCHAR2(20),
    grade NUMBER(2),
    kor     NUMBER(3),
    eng     NUMBER(3),
    math    NUMBER(3),
    total   NUMBER(3),
    avg     NUMBER(5, 2),
    rank    NUMBER(3)
);

select * from students;

-- update 를 사용해서 총점, 평균 넣어주세요 
-- update 테이블명 set 컬럼=값 ;
-- 총점
update students set total = kor+eng+math ; 
commit;
-- 평균 
update students set avg = total/3 ; 
commit;
-- rank는 다 0으로 넣어주세요 
update students set rank = 0 ; 
commit;
-- 전체 학생의 국어점수의 평균 
select avg(kor) from students;
select * from students where kor >= (select avg(kor) from students) order by kor; 
-- 전체 학생의 수학점수의 합
select sum(math) from students;
-- 전체 학생의 수 출력 
select count(*) from students;

-- 총점이 가장 낮은 학생의 총점 total
select min(total) from students;
select * from students where total = (select min(total) from students);
-- 총점이 가장 높은 학생의 총점 
select max(total) from students;
select * from students where total = (select max(total) from students);

-- 3학년 학생의 수 
select count(*) from students where grade = 3;
-- 2학년 학생의 영어점수의 평균 
select avg(eng) from students where grade=2; 
-- 1학년 한생의 국어점수의 합계
select sum(kor) from students where grade = 1; 

-- 학년 별 학생의 수 
select grade, count(*) 
from students
group by grade; 
-- 학년 별 국어점수의 평균 
select grade, round(avg(kor),2)  from students  group by grade; 
-- 학년 별 총점의 평균 
select grade, round(avg(total),2)  from students  group by grade;
-- 학년 별 영어점수의 최소값과 최대값 
select grade 학년, min(eng) 낮은영어점수, max(eng) 높은영어점수 from students group by grade;
-- having 
-- select절 조건을 사용하여 결과를 제한할때는 where절을 사용하지만
-- 그룹의 결과를 제한할때는 having절을 사용합니다. 
-- 즉, 그룹으로 묶여진 결과값에 대해 다시 조건을 주는 경우. 
-- group by의 결과가 적용된 절에 having 조건을 주는 것. 
/* select 컬럼명, 그룹함수(컬럼명)
   from 테이블명
   [where 조건식]
   group by 컬럼명
   [having 조건식]
   [order by 컬럼명]
*/ -- 부서별로 그룹을 만든 후, 그룹지어진 부서별 평균 급여가 5000 이상인 부서번호와 평균급여
select department_id, round(avg(salary),2) from employees group by department_id 
having avg(salary) >= 5000 
order by department_id;

select job_id 직무, sum(salary) 직무별_총급여, round(avg(salary)) 직무별_평균급여
from employees 
where employee_id > 150
group by job_id
having sum(salary) > 5000
order by 직무별_총급여 desc;

--Q. 부서별 급여의 최대값과 최소값을 구하되, 최대급여가 2900 이상인 부서만 출력 
select department_id, max(salary), min(salary) 
from employees 
group by department_id
having max(salary) >= 10000
order by department_id;


select department_id, max(salary), min(salary) 
from employees 
group by department_id
having max(salary) >= 10000
order by department_id;


-- Q. 부서별, 사원의 수, 월급총합, 월급의 평균(소수2자리), 최대급여, 최소급여를 출력하세요.
-- 부서별: department_id
select department_id, count(employee_id), sum(salary), round(avg(salary),2), max(salary), min(salary)
from employees
group by department_id order by department_id;
-- Q. 월급이 5000 이하인 사람의 수를 부서별로 출력하는데 
--    ++ 부서별 사림의 수가 10명이상인 경우만 출력
select department_id, count(*) 
from employees 
where salary <= 5000
group by department_id
having count(*) >= 10;

-- Q. 부서별 최대급여를 출력하는데
-- ++ 최대급여가 4500을 초가하는 경우만 출력
select department_id, max(salary)
from employees 
group by department_id
having max(salary)>4500
order by department_id;

-- rank() over ( [partition by 열이름1] order by 열이름2 )
-- 열이름1 : 그룹으로 순위를 묶어서 순위를 매겨야 할때 사용(파티션을 사용하지 않는다면 하나로..)
-- 열이름2:  순위를 매길때 사용하는 열이름 

-- 연봉순위 
select employee_id, department_id, salary ,
        rank() over( order by salary desc) as 총급여순위,
        rank() over( partition by department_id order by salary desc) 파티션순위
from employees
order by department_id;

-- 학생 순위 전체순위, 학년별순위 출력을 해보세요. 정렬은 학년별로 정렬 
desc students;
-- STUID STUNAME GRADE  TOTAL
select stuid, stuname, grade , total, 
        rank() over(order by total desc ) 전체순위,
        rank() over (partition by grade order by total desc) 학년별순위
from students
order by grade;

-- 오라클에서는 분석함수를 사용할때 partition by를 사용해서 그룹으로 묶어 연산할 수 있다. 

-- group by 
select job_id, avg(salary) from employees
where employee_id between 100 and 110
group by job_id
order by job_id; 
-- partition by  사용
select job_id, avg(salary) over (partition by job_id)  from employees
where employee_id between 100 and 110
order by job_id;

select employee_id, department_id, salary, 
         round(avg(salary) over()) 전체평균,
         round(avg(salary) over(order by employee_id)) 누적평균, 
         round(avg(salary) over(partition by department_id)) 부서별평균, 
         round(avg(salary) over(partition by department_id order by employee_id)) 부서별누적평균
from employees
order by employee_id;
-- 분석함수에서 order by 컬럼을 사용하면 해당 컬럼을 기준으로 쿼리의 결과가 정렬됨 

-- 테이블 전체 복사하기 
create table stu2 as select * from students; 
select * from stu2 order by stuid;
-- 테이블 타입만 복제 하기 
create table stu3 as select * from students where 1=2;
select * from stu3; 
desc stu3;
-- employee 테이블을 emp2 전체내용 복사해서 생성하기. /
create table emp2 as select * from employees; 
select * from emp2 order by employee_id;

-- emp3 껍데기만 복사해서 생성하기 
create table emp3 as select * from employees where 1=2;
select * from emp3;
desc emp3;

-- stu3을 위한 시퀀스 만들기 > min 1 증가도 1 

-- 시퀀스는 중복없이 기본키로 사용하고자 할때 사용한다.
-- 중복없이 자동 증가되는 테이블로 사용할 수 있다. 
-- 시퀀스는 실행할때마다 증가되고 다시 감소시킬 수 는 없다.
-- insert문에서 유용하게 사용할 수 있다. 
-- start with외에는 모두 변경이 가능하다. 
insert into stu3 (stuid, stuname, kor, eng, math) 
values(stu3_seq.nextval, '홍길동',100,100,100); 
commit;
select * from stu3; 
-- 시퀀스의 증가 값을 1 -> 2로 변경하기 
alter sequence stu3_seq increment by 2 ; 
insert into stu3 (stuid, stuname, kor, eng, math) 
values(stu3_seq.nextval, '유관순',100,100,100); 
insert into stu3 (stuid, stuname, kor, eng, math) 
values(stu3_seq.nextval, '김구',100,100,100); 
-- 시퀀스의 최대값 변경 
alter sequence stu3_seq maxvalue 9999999999;
-- 시퀀스 삭제 
drop sequence stu3_seq;

-- DML : 데이터 조작어, 데이터를 직접 삽입, 갱신, 삭제하는 명령어 
-- select, insert, update, delete 

-- insert : 테이블에 새로운 행을 삽입할때 사용 
insert into stu3 
values (6, '고길동',3, 100,100,100,300,100,0);

-- update : 기존의 데이터값을 다른데이터로 변경 
-- where 이하 조건절을 입력하지 않으면 전체 변경
update stu3 set grade = 1 where stuid=1;
update stu3 set rank = 0 ; 
-- delete : 삭제. where이하의 조건절을 입력하지 않으면 전체 삭제
delete from stu3 where stuid=3; 

-- 김구를 삭제하는데 
-- where절이하를 select 문을 사용해서 김구라는 학생의 학번을 검색을해서 
-- where stuid = (select) ;
select stuid from stu3 where stuname='김구';
delete from stu3 where stuid = (select stuid from stu3 where stuname='김구');
commit;
select * from stu3;

-- DDL : 데이터 정의어( 테이블과 관련된 열을 생성하고 변경하고 삭제하는 명령어) 
-- create, alter, drop, rename, truncate 이있음
-- 따로 커밋하지 않아도 데이터베이스에 즉각 반영이됨. 

-- 테이블에 컬럼 추가하기 
/*
alter table 테이블명
       add ( 컬럼명1 데이터타입, 
                컬럼명2 데이터타입, ....
); 
 
*/
desc stu3;
-- gender 컬럼 추가하기 
alter table stu3 add ( gender varchar2(20)); 
-- 기존에 이미 열들이 존재한다면 새로운 컬럼을 추가했을때 값들은 다 null로 들어가게 됨 
alter table stu3 add ( email varchar2(50), cdate date);  
-- alter table stu3 add(kor number(3)); -- 기존에 있는 경우 알려준다 
select * from stu3;
-- 제약조건 추가
alter table stu3 add primary key(stuid); 
alter table stu3 add unique(stuname);
-- 제약조건 삭제
alter table stu3 drop unique(stuname);
-- 프라이머리키 삭제 
alter table stu3 drop primary key;

insert into stu3 
values (7, '고길동',3, 100,100,100,300,100,0,'male','aa@aa.com',sysdate);
commit;
select * from stu3;

-- 테이블 컬럼 수정하기 
/*
alter table 테이블명
      modify(열이름1 데이터타입, ...) ;
데이터 타입과 자리수 를 수정함. 
*/
desc stu3;
alter table stu3 modify(email varchar2(20));

-- 테이블의 컬럼명 바꾸기 
/*
alter table 테이블이름 rename column  컬럼명1 to 바꾸려는컬럼명1 ; 
*/
alter table stu3 rename column stuname to name;
alter table stu3 rename column gender to gen;

-- 테이블 이름 바꾸기 
/*
 rename 테이블명 to 새로운테이블명 
*/
rename stu3 to student3 ; 
desc student3;

-- 테이블 컬럼 삭제하기 
/*
alter table 테이블이름 drop column 컬럼명 ; 
*/
alter table student3 drop column cdate;
desc student3;
-- 테이블 내용 삭제하기 : 모든데이터가 삭제되고 구조는 남는다 
/*
truncate table 테이블이름 ;
*/
select * from student3;
truncate table student3;

-- 테이블 삭제하기 
drop table student3;

-- 테이블 생성하기 : create table : 
-- member 테이블, id 문자열20 프라이머리키, pw 문자열20, name 문자열20 
CREATE TABLE member (
    id    VARCHAR2(20) PRIMARY KEY,
    pw    VARCHAR2(20),
    name  VARCHAR2(20)
);
-- 이메일 컬럼 추가하기 문자열 30   >     alter table add 
alter table member add(email varchar2(30));
-- 이메일 컬럼의 문자열30을 문자열 50으로 변경하기  >   alter table modify
alter table member modify (email varchar2(50));
-- pw컬럼을 not null로 변경하기   >  alter table modify 
alter table member modify (pw not null);
-- pw컬럼을 pwd로 이름변경하기  >  alter table rename
alter table member rename column pw to pwd;
-- email 컬럼지우기   > alter table drop column
alter table member drop column email;
-- member 테이블이름을 newmem으로 바꾸기    > rename 
rename member to newmem;
-- newmem 테이블 삭제하기   > drop table 
drop table newmem;
desc newmem;



