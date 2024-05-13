-- 상황에따라 다른데이터를 반환하는 decode, case문 
-- decode(열이름, 조건값, 값1, 값2)
-- decode(열이름, 조건값1, 값1, 조건값2, 값2, 값3)
/*
case    
    when 조건1 then 출력1
    when 조건2 then 출력2
    else 출력n 
end as 별명
*/
-- decode 함수는 맨 마지막 데이터를 지정하지 않으면 널값을 반환함 
select employee_id, job_id, decode(job_id, 'AD_PRES', '사장', '직원')
from employees;
select employee_id, job_id, decode(job_id, 'AD_PRES', '사장')
from employees;
select employee_id, job_id, decode(job_id,'AD_PRES','사장','AD_VP','부사장', '직원')
from employees; 
-- Q. 이름, 부서번호 출력. 부서번호가 20: 승진대상 나머지 승진보류 
-- 컬럼명은 승진확인으로 출력해보세요 
select first_name, department_id, 
            decode( department_id, 20, '승진대상', 30, '승진보류',   40, '승진보류',       
            50, '승진보류' )  as "승진확인"
from employees;

--Q. job_id SH_CLERK 일때 salary * 2% , AD_ASST  5%, IT_PROG 3%, PU_CLERK 4%
-- 월급인상을 출력해보세요 
-- employee_id, first_name, salary, job_id, 월급인상현황 컬럼 출력
select employee_id, first_name, salary, job_id, 
        decode( job_id , 'SH_CLERK', salary*0.02, 
                               'AD_ASST', salary*0.05,
                               'IT_PROG', salary *0.03,
                               'PU_CLERK', salary * 0.04
        )as 월급인상현황
from employees;

select distinct (job_id) from employees; 

select employee_id, first_name, job_id, salary, 
        decode( substr(job_id,4),  'CLERK' , salary*0.05,
                                           'MAN' , salary*0.07, 
                                           'REP', salary*0.04,
                                           'ACCOUNT', salary *0.06
        ) as 월급인상현황
from employees; 

-- case문같은경우는 각 조건식의 true, false만 검사함 
select employee_id, job_id, 
    case
        when job_id = 'AD_PRES' then '사장'
        when job_id = 'AD_VP' then '부사장'
        else '직원'
    end as 타이틀
from employees;

-- Q. 커미션이 있으면 수당컬럼에 커미션있음 아니면 없음을 case문을 사용해서 출력해보세요 
select employee_id, first_name, commission_pct, 
        case
            when commission_pct is not null then '커미션있음'
            else '커미션없음'
        end as 커미션여부
from employees; 
select employee_id, first_name, job_id, salary, 
        case 
            when substr(job_id,4) = 'CLERK' then salary*0.05
            when substr(job_id,4) = 'MAN' then salary*0.07
            when substr(job_id,4) = 'REP' then salary*0.04
            when substr(job_id,4) = 'ACCOUNT' then salary *0.06
        end as 월급인상현황
from employees; 

select * from employees where lower(email) like '%a%'; 
-- Q. job_id에 it가 들어 있으면 it 부서, sa가 들어있으면 세일즈 부서 라고 직종 컬럼에 출력해보세요 (case)
-- like , lower(), upper() 사용해서 출력해보기
select job_id, 
        case 
            when lower(job_id) like '%it%' then 'it부서'
            when lower(job_id) like '%sa%' then '세일즈부서' 
        end as 직종
from employees; 

-- Q. 직종상관 사원번호(manager_id) 가 존재하지 않을 경우 상관 컬럼에 '0000'출력
--     직종상관 사원번호 앞 두자리가 10일 경우 AAAA
--     직종상관 사원번호 앞 두자리가 11일 경우 BBBB
--     직종상관 사원번호 앞 두자리가 12일 경우 CCCC 
--     그외는 DDDD 를 출력해보세요 (case 사용)

select  job_id, manager_id, 
        case 
            when manager_id is null then '0000'
            when substr(manager_id,1,2) = 10 then 'AAAA'
            when substr(manager_id,1,2) = 11 then 'BBBB'
            when substr(manager_id,1,2) = 12 then 'CCCC'
            else 'DDDD'
        end as 상관
from employees ;


select * from students;
desc students;
-- Q. strudents 테이블에서
-- case를 사용해서  평균이 90점이상이면 A, 80점이상 B, 70점이상 C, 60점이상 D나머지 F
-- 성적결과 컬럼에 출력해보세요
-- 학번, 이름, 평균, 성적결과 를 출력 + avg 순 높은점수 출력
-- STUID, STUNAME, AVG 
select stuid, stuname, avg, 
        case 
            when avg >=90 then 'A'
            when avg >=80 then 'B'
            when avg >=70 then 'C'
            when avg >= 60 then 'D'
            else 'F'
        end as 성적결과
from students
order by avg desc; 


 -- 날짜 함수 
-- sysdate : 오늘날짜 지금.  
 select sysdate as today, sysdate-1 as yesterday, sysdate+1 as tomorrow from dual;

-- add_months : 몇개월 이후를 출력해준다. 
select sysdate, add_months(sysdate, 3) from dual;
select sysdate, add_months(sysdate, 12) from dual;

-- Q1. employees 테이블에서 입사한지 10주년이 되는 날을 출력해보세요 
select employee_id, first_name, hire_date, add_months(hire_date, 120) as "10주년" from employees;
-- Q2. 입사한지 20년이상인 사원들을 출력해보세요 (오늘날까지 일한다고 가정)
select employee_id, first_name, hire_date, add_months(hire_date, 240) as "20주년" 
from employees 
where add_months(hire_date, 240) < sysdate
order by hire_date;

-- months_bewteen : 두 날짜간 개월수 차이를 구해준다. 
-- 두개의 날짜데이터를 입력하고 개월수 차이를 구하는데 사용함 
select months_between(sysdate, add_months(sysdate,6)) from dual; 
select months_between(sysdate, '24/01/01') from dual;
select * from employees;
-- Q. employee 테이블해서 입사한지 몇개월이 지났는지 반올림을 사용해서 출력해주세요 
-- (오늘까지일하는중)
-- employee_id, name, hire_date, 일한개월수 컬럼을 출력하고. 
-- name = first_name+last_name 
-- ex) . Donald OConnell

select employee_id, first_name || ' ' || last_name as name, hire_date, 
        round(months_between(sysdate, hire_date), 1) as 일한개월수 
from employees order by 일한개월수 desc;

-- next_day : 돌아오는 요일, last_day 달의 마지막날짜를 구함 
select sysdate, next_day(sysdate,'일요일'), last_day(sysdate) from dual; 

-- 날짜도 반올림(round), 버림(trunc)을 할 수 있다. 

select  sysdate, 
          round(sysdate, 'cc'),                     -- 4자리연도끝 두자리 기준반올림(2050년기준)
          round(sysdate,'yyyy'),                   -- 해당연월일의 7월1일을 기준으로 반올림
          round(sysdate,'q'),                       -- 각 분기의 16일을 기준
          round(sysdate,'ddd'),                    -- 해당일의 정오를 기준
          round(sysdate,'hh') from dual;       -- 해당일의 시간을 기준 

select  sysdate, 
          trunc(sysdate, 'cc'),                     -- 4자리연도끝 두자리 기준버림
          trunc(sysdate,'yyyy'),                   -- 해당연월일의 7월1일을 기준으로 버림
          trunc(sysdate,'q'),                       -- 각 분기의 16일을 기준
          trunc(sysdate,'ddd'),                    -- 해당일의 정오를 기준
          trunc(sysdate,'hh') from dual;       -- 해당일의 시간을 기준 


-- 자료형 변환
-- 숫자끼리 더하기 가능 
select employee_id, employee_id+1000 from employees; 

-- 문자 + 숫자는 불가능 
select employee_id, first_name+1000 from employees; 

-- to_char : 숫자 또는 날짜를 문자로 바꿈
-- to_number : 문자데이터를 숫자로 바꿈
-- to_date : 문자데이터를 날짜데이터로 바꿈 
select sysdate, to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS') from dual;

select sysdate, 
        to_char(sysdate, 'HH24:MI:SS'),
        to_char(sysdate, 'HH12:MI:SS'),
        to_char(sysdate, 'HH:MI:SS am') from dual;


select sysdate, 
        to_char(sysdate, 'MM'),                     -- 달
        to_char(sysdate, 'MON'),                   -- 달의 약자 ex) september :SEP
        to_char(sysdate, 'MONTH'),                -- 월 이름 전체 ex) september
        to_char(sysdate, 'DD'),                       -- 일
        to_char(sysdate, 'DY'),                       -- 요일 약자 ex) monday : MON
        to_char(sysdate, 'DAY') from dual;       --요일이름 전체 monday

--   9 는 숫자 한자리를 의미 빈자리를 채우지 않음
--   0 은 빈자리를 0으로 채움 
--   $  달라표시 , L로컬단위 
--   .   : 소수표시   ,  : 천단위 구분 

select to_char(100000, '$999,999'), to_char(10000,'L999,999'), to_char(100000,'000,999,999.00') from dual;
        
-- Q. 급여(salary)를 달러와 천단위의 콤마를 사용해서 출력해보세요         
select employee_id, first_name, salary, to_char(salary, '$999,999') from employees;         
        
-- to_number 
-- 오라클은 문자타입의 숫자는 자동으로 숫자로 변해서 연산을 해줌 
select 500 - '20', '200'+ 100 from dual;
select employee_id, employee_id+'1000' from employees;      

select '1,300' - '200' from dual;  -- , 가 있기 때문에 연산할 수 없다         
-- to_number를 사용하면 연산이 가능하다. 
select to_number(   '1,300'   ,    '999,999'     ) - '200' from dual; 

-- to_date 날짜 변환하기 
select to_date('2024/05/05' ,'yyyy-mm-dd'), to_date('20240505','yyyy/mm/dd') from dual;

-- Q. 06년 6월 1일 이후에 입사한 사원들의 정보를 출력해보세요 : to_date()사용
select * from employees
where hire_date > to_date('20060601','yyyy/mm/dd')
order by hire_date; 

-- 그룹함수 
-- 하나의 열에 출력결과를 담는 다중행 함수. 하나의 결과값을 도출 . 
select sum(salary) from employees; 
-- salary 열 값을 모두 더한 값을 반환해줌. 때문에 여러행의 결과로 나올 수 있는 열과 함께 사용불가능 
-- select employee_id, sum(salary) from employees; -- 오류, 사용할 수 없음. 

select sum(salary), sum(all salary), sum(distinct salary) from employees;
-- all은 옵션을 지정하지 않은것과 같다. 
-- distinct는 중복을 제거한것이므로 중복을 제거한 것들의 합을 의미함. 

-- employee테이블에서 행의 수를 출력해줌. 
select count(*) from employees;
-- 80번 부서에서 근무하는 직원의 수를 알고싶다면.. 
select count(*) from employees where department_id=80;
-- 즉, 특정 조건을 만족하는데이터를 셀때 사용할수 있다 .
select count(salary), count(all salary), count(distinct salary) from employees; 

--Q. 커미션을 받는 사람의 수를 출력해보세요 commission_pct 
select count(*) from employees where commission_pct is not null ;   -- 35 
select count(commission_pct) from employees;
-- Q. 커미션을 받지 않는 사람을 출력해보세요 . (가능하다면2가지 방법으로 출력)
select count(*) from employees where commission_pct is null;  -- 72
select count(*) - count(commission_pct) from employees;  -- 72

-- min , max 
-- 숫자 뿐만아니라 날짜, 문자 역시 사용할 수 있습니다. 
select hire_date from employees order by hire_date; 
select min(hire_date) from employees;
select hire_date from employees order by hire_date desc; 
select max(hire_date) from employees;

select first_name from employees order by first_name; 
select min(first_name) from employees;
select first_name from employees order by first_name desc; 
select max(first_name) from employees;

-- avg() 평균 . 
select avg(salary), avg(all salary), avg( distinct salary) from employees;

-- Q1. 부서번호가 80인 사람들의 평균 급여를 출력해보세요 .
select avg(salary) from employees where department_id = 80; 
-- Q2. 평균급여보다 많이 받는 사람들을 출력해보세요 
--     2-2 평균급여보다 많이 받는 사람의 총 수를 출력해보세요 
select * from employees 
where salary >= (select avg(salary) from employees);

select count(*) from employees 
where salary >= (select avg(salary) from employees);


-- 결과 값을 원하는 열로 묶어서 출력 
-- 앞에서 본 그룹함수는 하나의 결과값만 출력함. 
-- 만약에 부서별 평균 급여를 알고자 할때는 .. ? 
select avg(salary) from employees where department_id = 10; 
select avg(salary) from employees where department_id = 20; 
select avg(salary) from employees where department_id = 30; 

-- 여러가지 데이터를 의미있는 하나의 결과를 특정 열 값 별로 묶어 출력할때
-- 그룹화 한다고 표현하며 순서에 맞게 작성해야함. 
/*
select  컬럼명, 그룹함수(컬럼명)
from 테이블명
[where 조건식]
group by 컬럼명 (한개일 필요는없음)
[having 조건식]
[order by 컬럼명]
*/
-- group by: 합계, 평균, 최대, 최소 등 어떠한 컬럼을 기준으로 그 컬럼별 값을 보고자 할때 
--               group by 뒤에 그 컬럼명을 기술 
-- group by 뒤에는 반드시 컬럼명을기술해야함(별칭은 사용할 수 없음)
-- having절은 그룹의 결과를 제한할때 사용함. 마찬가지로 별칭은 사용할 수 없음. 

select department_id, round(avg(salary) )
from employees
group by department_id
order by department_id;

-- 각 부서별, 직책별 평균급여를 알고자 할때는 group by에 두개 컬럼을 사용할 수 있다. 
-- 부서번호로 먼저 그룹을 묶은 뒤, 다시 직책을 기준으로 소그룹으로 묶어 급여 평균을 출력해준다. 
select department_id, job_id, round(avg(salary) )
from employees
group by department_id, job_id
order by department_id;

-- Q. group by를 사용해서 직책별 평균 수당을 출력하세요 
select job_id, round(avg(salary)) 
from employees
group by job_id; 

-- group by를 사용할때는 다중행 함수를 사용하지 않는 일반열을 select에 사용할 수 없다. 
-- select employee_id, job_id, round(avg(salary))  from employees  group by job_id;
-- 오류발생 employee_id는 group by를 사용하지 않기때문에 사용할 수 없다. 

-- having절은 group by절이 존재할때 만 사용가능 . 
-- group by 절을 통해 그룹화된 결과값의 범위를 제한할때 사용함니다. 
-- 각부서의 직책별 평균급여를 출력하는데.. 평균급여가 5000 이상인 부서만 출력한다고 할때 사용. 
select department_id, round(avg(salary)) 평균급여
from employees     group by department_id       order by 평균급여; 

select department_id, round(avg(salary)) 평균급여
from employees    group by department_id    having avg(salary) > 5000     order by 평균급여; 

-- 유의점 : 
--  조건식을 지정한다는점에서 where비슷하지만, where는 대상행을 제한함.
-- having은 그룹화된 대상에서 제한함. 
-- select department_id, avg(salary) from employees where avg(salary) > 5000;
-- where 에 조건을 잘못 사용하게되면 오류가 발생함 .  
select department_id, avg(salary) from employees
group by department_id
having avg(salary)>8000; 
-- where절까지 사용해보자 
select department_id, avg(salary) from employees
where salary <=8000       -- 그룹화 하기 전에 제외된 데이터는 그룹화에 포함되지 않는다.  
group by department_id
having avg(salary)> 5000
order by department_id; 
-- Q1.  부서별 최소, 최대 급여를 출력하세요 
--    1-2 최대급여가 13000 이상인 그룹만 출력 
select department_id, job_id, min(salary), max(salary)
from employees 
group by department_id, job_id
having max(salary)>=13000
order by department_id; 

-- Q2. 부서별 인원이 5명 이상인 부서를 출력하세요 
select department_id , count(*) from employees
group by department_id 
having count(*) >=5 ;
-- Q3. 직책별 평균 급여를 출력하는데 평균 급여가 10000이상만 출력하세요 
select job_id, round(avg(salary),2) from employees 
group by job_id
having avg(salary) >= 10000 ;

-- Q. students 테이블에서 학년별  총점의   최대, 최소, 평균   출력해보세요 
desc students; -- GRADE, TOTAL
select grade, min(total), max(total), avg(total)
from students 
group by grade ;

-- 최대 총점이 250 이상인 학년만 출력해주세요 ->having 
select grade, min(total), max(total), avg(total)
from students 
group by grade
having max(total) >= 250 ;

-- Q. 국어점수가 75점 이상인 학생들 중에서 학년별  총점의   최대, 최소, 평균   출력해보세요
select grade, min(total), max(total), avg(total)
from students 
where kor> 75
group by grade;
-- 그룹화와 관련된 함수들 : rollup, cube, grouping set 
-- group by 절에 사용할 수 있는 특수 함수들이다. 
/*
select 컬럼명
from  테이블명 
where 조건식 
group by  rollup/cube/grouping set (그룹화열 지정, 여러개 가능)
*/

--Q. group by 를 사용해서 department_id별, job_id 별 월급의 평균을 출력해보세요
select department_id, job_id, avg(salary) from employees 
group by department_id, job_id
order by department_id;

-- rollup 함수는 소그룹간의 합계를 계산하는 함수. 
-- rollup을 사용하면 group by로 묶은 각각의 소그룹 합계와 전체 합계를 모두 구할 수 있음
-- 맨 처음 명시된 컬럼에 대한 소그룹 합계를 구해줌 
select department_id, job_id, avg(salary) from employees 
group by rollup(department_id, job_id)
order by department_id;

select job_id, department_id, avg(salary) from employees
group by rollup(job_id, department_id)
order by job_id;

-- 소그룹부터 대그룹 순서로 각 그룹별 결과를 출력해주고 마지막에 총 데이터 결과를 출력해준다 
-- 롤업 함수에 명시된 열에 한에 결과가 출력됨. 롤업함수는 그룹함수를 지정할 수 없다. 

select department_id, job_id, count(*) from employees
group by department_id, rollup(job_id) ;
select department_id, job_id, count(*) from employees
group by rollup(department_id, job_id);

select department_id, job_id, count(*) from employees
group by job_id, rollup(department_id);
select department_id, job_id, count(*) from employees
group by rollup( job_id, department_id);

-- Q. rollup을 사용해서 부서별, 직책별 인원수, 최대급여, 최소급여, 평균급여를 출력
--                      department_id , job_id

select department_id, job_id, count(*), max(salary), min(salary), avg(salary)
from employees 
group by rollup(department_id, job_id); 


-- cube 함수는 항목간 다차원적 소계를 계산
-- rollup과 달리 group by 절에 명시한 모든 컬럼에 대해 소그룹 합계를 계산. 
-- rollup을 사용했을 때보다 좀 더 많은 결과가 나옴. 

-- 부서상관없이 직책별 결과가 함께 출력됨. 
select department_id, job_id, avg(salary) from employees
group by cube(department_id, job_id) 
order by department_id; 

-- Q. cube를 사용해서 부서별, 직책별, 인원수, 최대급여 최소 급여 평균급여(round사용) 출력해보세요 
select department_id, job_id, count(*), max(salary), min(salary), round(avg(salary))
from employees 
group by cube(department_id, job_id)
order by department_id;

-- grouping sets는 특정 항목에 대한 소계를 계산하는 함수 
-- 같은 수준의 그룹화열이 여러개 일때 각 열별 그룹화를 통해 결과를 출력하는데 사용 
select department_id, job_id, avg(salary) from employees
group by grouping sets (department_id, job_id) 
order by department_id; 

-- 롤업, 큐브는 특정부서내 직책별 인원수 처럼 열을 대그룹 소그룹으로 그룹핑해서 데이터를 집계
-- 그루핑셋은 모든부서별인원수, 직책별 인원수의 결과값을 하나의 결과로 출력해줌. 
-- 지정한 열의 각각이 대그룹으로 처리되서 출력됨. 

-- Q. grouping set을 사용해서 부서별 , 직책별, 인원수, 최대급여, 최소급여, 평균급여를 출력해보세요 
select department_id, job_id, count(*), max(salary), min(salary), avg(salary) from employees
group by grouping sets(department_id, job_id)
order by department_id; 

-- 그룹화 함수 : 데이터 자체 가공이나 특별 연산을 수행하지는 않지만
-- 그룹화 데이터의 식별이 쉽고 가독성을 높이기 위한 목적으로 사용 . 
-- 즉, grouping 은 직접적으로 그룹별 집계를 구하는 함수는 아니지만 위 집계함수를 지원하는 함수.
-- 집계가 계산된 결과에 대해서는 0 그렇지 않은 결과에 대해서는 1 
/*
select 컬럼명 
    grouping 그룹화할 열이름
from 테이블명
where 조건식
group by rollup/cube/grouping sets(그룹화할 열)
*/
select department_id, job_id, count(*), max(salary), min(salary),round( avg(salary)), 
    grouping(department_id), grouping(job_id) from employees
group by grouping sets(department_id, job_id) order by department_id;

select 
    case grouping(department_id)
        when 1 then '모든부서' 
        else to_char(department_id)
    end as 부서, 
    case grouping(job_id)
        when 1 then '모든직책' 
        else job_id
    end as 직책, 
    round(avg(salary)) as 평균급여
from employees group by rollup(department_id, job_id); 



select owner, constraint_name, constraint_type, table_name from user_constraints 
where lower(table_name)='employees';

select * from departments;
select employee_id, department_id from employees;
-- 만약에 employees 테이블에 직원을 한명 추가한다면. 
select * from employees;