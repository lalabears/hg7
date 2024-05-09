/*
select [distinct] 열이름 [ or 별명]
from 테이블이름 
[where 조건식]
[order by 열이름 [asc or desc]] ;

[   ]       : 선택사항 
;           : sql이 끝났음을 의미 
distinct : 중복행 제거 
*          : 모든열 출력을 의미 
별명     : 별칭을 부여할 수 있음
where   : 조건을 만족하는 행들만 검색 
조건식   : 열, 표현식, 상수 및 비교연산자 등 출력을 위한 조건문 
order by : 결과정렬을 위한 옵션 (asc: 오름차순 desc: 내림차순)
*/

-- 모든 열을 조회 
SELECT     *   FROM     employees;
-- 특정 컬럼만 출력하고자 할 때는 열이름1, 열이름2, .. 으로 기술 
SELECT     salary,    hire_date FROM     employees;

-- as 로 별칭선언이 가능함. 쌍따옴표를 넣을경우 띄어쓰기도 가능함 (특수문자도 사용이가능)
SELECT employee_id  AS id, first_name   AS 성, hire_date    AS "입   사  일 @@@"
FROM    employees;

-- null 값에 대한 부분 
-- null 값이라는것은 0도 아니고 빈공간도 아니고 그냥 알수 없는 값
-- 때문에 연산 불가능 비교도 불가능함. 
-- commission_pct 
-- nvl(commission_pct , 0)
SELECT   employee_id,  salary * 12 + commission_pct, 
salary * 12 + nvl(commission_pct, 0) AS 연봉
FROM    employees;
   
-- 컬럼과 컬럼을 하나의 문장처럼 보이게 함 
-- 컬럼이름1 || ' ' || 컬럼이름2
select first_name || '  ' || last_name as "이름" from employees;

-- where 절은 조건절이다. 
select * from employees where job_id='SA_REP';
select * from employees where employee_id=105;

-- 조건절에 and (모두만족)   or(하나만만족해도) 를 사용 할 수 있음 
select * from employees 
where employee_id = 100 or employee_id =200 or employee_id= 204; 

select * from employees 
where employee_id = 100 and department_id=90;

-- distinct : 중복제거 
select department_id from employees;
select distinct department_id from employees; 

-- order by : 순서로 정렬  asc : 오름차순 desc : 내림차순 
select distinct department_id from employees order by department_id; 
select * from employees  where salary > 8000 order by salary; 
select * from employees  where salary > 8000 order by salary desc; 
-- Q1. 급여가 6000이상 8000 미만인 사람을 연봉순(낮->높)으로 정렬해서 출력
select * from employees where salary >= 6000 and salary <8000 order by salary;

select * from employees where salary between 6000 and 8000  order by salary; 
-- Q2. 급여가 6000 이거나 8000 이거나 10000인 사람을 출력하세요 
select * from employees
where salary = 6000 or salary = 8000 or salary = 10000 order by salary desc;

select * from employees where salary in (6000,8000,10000) order by salary desc;

-- Q1. 사원번호가 176, 158, 102  인 사람들의 사원번호, 급여를 검색하는 쿼리를 작성하세요
select employee_id, salary from employees where employee_id in (176,102,158);
select employee_id, salary from employees 
where employee_id =176 or employee_id = 102 or employee_id =158;


-- 논리연산자  not  : not, != , ^= , <>
select * from employees where not department_id = 20 order by department_id; 
select * from employees where department_id != 20 order by department_id; 
select * from employees where department_id ^= 20 order by department_id; 
select * from employees where department_id <> 20 order by department_id; 


-- SQL에서는 문자열이나 날짜는 단일 따옴표안에 표시해야한다. 
-- 따옴표 안의 문자열의 대소문자는 구별한다. 
select * from employees where email = 'RLADWIG';
select * from employees where email = 'rladwig';

select * from employees where hire_date >= '07/06/21' order by hire_date;

-- Q1. 2000/01/01 이후 입사사원을 입사일 순으로 정렬하세요 (역순)
select * from employees where hire_date >= '00/01/01' order by hire_date desc;


-- 포함된 글자 찾을때는 like 를 사용한다. 
-- 이메일에 첫글자가 v로 시작하는 모든데이터를 출력 
select * from employees where email like 'V%';
select * from employees where email like 'V'||'%';
select * from employees where email like 'v%';

-- 이메일에 s를 포함하는 모든데이터를 출력 
-- s로 시작하는 것 :
select * from employees where email like 'S%';
-- s로 끝나는 것 :
select * from employees where email like '%S';
-- s가 중간에 있는 경우 
select * from employees where email like '%S%';

-- 내가 컬럼이 , 대문자로되어있는지, 소문자되어있는지 섞여잇는지 ???

select email, lower(email) from employees;
select first_name, lower(first_name), upper(first_name) from employees;

select * from employees where lower(email) like '%s%'; 

-- 언더바는 문자수를 나타낸다. 
select * from employees where email like 'B_____';
select * from employees where email like 'B%';

-- Q1. 두번째 글자가 a인 사원(first_name)을 찾으세요 
select first_name from employees where first_name like '_a%';
-- Q2. 네번째 글자가 a인 사원을 찾으세요 
select first_name from employees where first_name like '___a%';
-- Q3. 이름이 s로 시작하는 사원을 찾으세요 
select first_name from employees where lower(first_name) like 's%';

-- lower, upper, initcap -> 첫글자 대문자고 나머지는 소문자 
select * from employees 
where lower(first_name)='susan' or upper(first_name)='SUSAN' or initcap(first_name)='Susan';


-- 이름에 a를 포함하지 않은 사람  포함하지 않은 경우는 not like를 사용하면됨
select first_name from employees where lower(first_name) not like '%a%'; 

-- 두번째 글자에 a를 포함하지 않은사람을 찾을경우 
select first_name from employees where lower(first_name) not like '_a%'; 

-- null 값을 가지는 행들만 출력 
select * from employees where manager_id is null; 
-- null 값을 가지는 행들을 제외하고 출력 
select * from employees where manager_id is not null; 

-- Q1. commission_pct 에 널이 있는 경우만 출력
select * from employees where commission_pct is null; 
-- Q2. commission_pct 널이 아닌 경우만 출력
select * from employees where commission_pct is not null; 
-- Q1. id, 이름, 월급을 출력 (월급은 4000 이하이며 department_id 가 30인) 월급높->낮 순정렬
select employee_id, first_name, salary from employees
where salary <= 4000 and department_id =30 order by salary desc ;
-- Q2. last_name에 a와 e가 모두 포함된 사원을 출력 
select last_name from employees
where lower(last_name) like '%a%' and lower(last_name) like '%e%' ;

-- Q3. job_id가 'SA_REP' 이거나 'ST_CLERK' 이면서 급여가 2000,3500,7000이 아닌 
--      모든사원의 last_name, job_id, salary를 출력 
select last_name, job_id, salary from employees
where job_id in( 'SA_REP', 'ST_CLERK') and salary not in(2000,3500,7000);
-- Q4. employee_id가 130보다 크며 월급이 3000-5000 사이인 사원을 월급 높->낮 순 출력
select * from employees
where employee_id>=130 and salary between 3000 and 5000
order by salary desc ;
-- Q5. 이름에 su글자를 포함하는 사람(first_name) 을 입사일 순으로 정렬 
select first_name from employees 
where lower(first_name) like '%su%'   order by hire_date ;

-- Q6. 이메일이 pfay인 사람 출력
select * from employees where lower(email) ='pfay';

-- 날짜도 정렬이 가능하다 (크다, 작다 between 다 사용이 가능)
-- 입사일이 95/01/01 부터 02/12/31 사람을 출력 
select * from employees where hire_date between '95/01/01' and '02/12/31' order by hire_date;
-- 날짜도 덧셈뺄셈 사용이 가능하다. 
select hire_date, hire_date-10, hire_date+10 from employees;

-- 정렬 asc : 숫자는 작은것부터, 문자는 사전순서대로, 날짜 빠른순서로, .. null은 가장마지막에
-- desc 

select * from employees order by salary;
select * from employees order by salary desc;

-- 부서번호는 순차정렬, 부서번호가 같을경우 급여의 역순으로 정렬 
select department_id, salary from employees 
order by department_id, salary desc; 

select employee_id, hire_date from employees
order by hire_date, employee_id desc; 


-- 문자 길이 :
-- length   : 컬럼의 문자열 길이를 반환, 공백 포함. 
-- lengthb : 컬럼의 문자열 바이트수를 반환 영문자1바이트, 공백1바이트, 한글3바이트
select first_name, length(first_name), lengthb(first_name) from employees; 
-- lower () : 소문자로 변환
-- upper() : 대문자로 변환 
select first_name, lower(first_name), upper(first_name) from employees; 

-- substr : 문자열 추출 
-- substr('jones',2) 문자열의 두번째 위치 즉 o부터 끝까지 자른다.
-- substr('jones',2,3) 문자열의 두번째 위치부터 3자리 즉 one을 자른다. 
select substr('jones',2) from dual; 
select substr('jones',2,3) from dual; 

-- dual은 오라클 자체 제공테이블로 한개의 열을 가진 임시의 테이블입니다.
-- 주로 사용자가 계산(함수사용)할때 임시로 사용합니다.. 
select 1+2 from dual;
-- 원래는 문자끼리더하는 것은 불가능하나 오라클에서는 가능하게해줌
select '1'+'12' from dual;  
select sysdate from dual;

-- 이름의 첫글자부터 네글자를 잘라서 가져옴
select first_name, substr(first_name, 1,4) from employees; 
-- 이름의 세번째 글자부터 끝가지 잘라서 가져옴
select first_name, substr(first_name, 3) from employees; 
-- -1은 마지막 글자를 가지고온다. 
select first_name, substr(first_name, -1) from employees; 


-- instr : 특정 문자위치를 찾아줌 
-- 문자열에서 문자를 찾으면 문자 시작위치를 반환하고 못찾으면 0을 반환함. 

select 'hello.txt', instr('hello.txt','.'), substr('hello.txt', instr('hello.txt','.')+1 )from dual;

-- Q1. studata.sql에서 sql을 추출해보세요 
select 'studata.sql' ,  instr('studata.sql','.'), substr ('studata.sql',9 ) ,
substr ('studata.sql',  instr('studata.sql','.')+1 ) from dual;
-- .이 8번째위치에 있으니까.. substr ('studata.sql',9 ) 

-- Q2. <img src="images/im01.jpg"> 에서 im01.jpg (8글자) 를 추출해보세요 
select substr('<img src="images/im01.jpg">', 
instr('<img src="images/im01.jpg">','/')+1,length('im01.jpg'))
from dual;

-- Q2.  http://localhost:8080/HOME/h_0509.html    >>   h_0509.html 를 추출하기
select instr('http://localhost:8080/HOME/h_0509.html','HOME/')  from dual;
select substr('http://localhost:8080/HOME/h_0509.html' ,
instr('http://localhost:8080/HOME/h_0509.html','HOME/') + 5) from dual;


-- months_between 함수 써보기 
select first_name, sysdate, hire_date, months_between(sysdate, hire_date) from employees;


-- Q1. 연봉 순으로 순위를 매겨서 출력해보세요 제일높은사람이 1등
select employee_id, department_id, salary,  
         rank() over (order by salary desc) as "rank 급여",
         dense_rank() over (order by salary desc) as "dense_rank 급여",
         row_number() over (order by salary desc) as "row_number 급여"
from employees; 

-- nvl (입력값, 대체값) 널값 치환함수 
select commission_pct,   salary,  salary * nvl(commission_pct,1)
from employees
where employee_id between 130 and 150
order by commission_pct;
-- nvl2(입력값, notnull대체값, null대체값)
-- nvl2( 컬럼값, 값1, 값2) : 컬럼에 있는 값이 널 일경우에는 값2로, 널이 아닐경우 값1로 바꿔라. 
select employee_id, commission_pct, nvl(commission_pct,1) ,nvl2(commission_pct, 0, 1)
from employees
where employee_id between 143 and 148;
-- nullif(값1, 값2)  만약에 값1이 값2면 null로 바꿔라 
select employee_id, salary, nullif(salary, 2600) 
from employees
where employee_id between 143 and 148;
-- decode(열이름, 조건값, 치환값, 기본값)
-- 어떤 열 이름에 대해 조건값일때 조건에 해당하는 어떤 값을 치환한다. 
-- decode(열이름, 조건값, 값1, 값2)
-- if문과 같다고 생각하시면됩니다. 만약에 열이름이 조건값이라면 값1, 아니면(else) 값2 
select first_name, last_name, department_id, salary 원래급여,
decode(department_id, 60, salary*1.1, salary) 조정된급여,
decode(department_id, 60, '10%인상','미인상') 인상여부
from employees;

-- Q. department_id가 100 일때  'IT' 그외에는 '다른 부서' 라고 표현해 보세요 
select first_name, last_name, department_id, 
decode(department_id, 100, 'IT', '다른 부서') 부서명 
from employees;


-- decode(열이름, 조건값1, 값1, 조건값2, 값2, 값3 )
-- decode ( a,        b,         x,      c,        y,       z)
-- if- else if - else 문과 같다고 생각하면됨. 
-- 만약에 a가 b와 같다면 x, a가 c와 같다면 y, 그외에는 z값 

-- Q. department_id가 100 일때  'IT' 그외에는 90번은 'HR' 부서,
-- 그외  '다른 부서' 라고 표현해 보세요 
select first_name, last_name, department_id, 
decode(department_id,
                         100, 'IT',
                          90 ,'HR',
                         '다른 부서') 부서명 
from employees;


-- case : 다양한 조건이 주어질 때 
/* case
             when 조건1 then 출력1
             when 조건2 then 출력2
             .....
             else 출력n
    end as 별명 

*/
SELECT    employee_id, first_name,  last_name, salary,
    CASE
        WHEN salary >= 9000                 THEN           '상위급여'
        WHEN salary BETWEEN 6000 AND 8999  THEN  '중위급여'
        ELSE          '하위급여'
    END AS 급여등급
FROM    employees    WHERE     job_id = 'IT_PROG';

-- Q. department_id 가 10일때 'admin' 40일때 'hr' 60일때 'it' 그외는 'N/A'로 출력해보세요
-- 별명 job_title
select employee_id, first_name, last_name, department_id,
    case
        when department_id = 10 and manger_id = 101 then 'admin'
        when department_id = 40 then 'hr'
        when department_id = 60 then 'it'
        else 'n/a'
    end as job_title
from employees;
-- and or 절도 함께 사용할 수 있다. 