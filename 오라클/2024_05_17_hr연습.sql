/*
서브쿼리 : select 문 안에 다시 select 문이 기술된 형태의 쿼리 
1. 서브쿼리는 연산자와 같은 비교 또는 조회대상의 오른쪽에 놓이며 ()로 묶어서 사용함. 
2. 대부분의 서브쿼리는 order by 절을 사용할 수 없음 
3. 서브쿼리의 select절에 명시한 열은 메인 쿼리의 비교대상과 같은 자료형과 같은 개수로 지정. 
4. 서브쿼리에 있는 select문 결과 행수는 함께 사용하는 메인쿼리의 연산자 종류와 호환이 가능해야함. 
   즉, 메인쿼리에 사용한 연산자가 단 하나의 데이터로만 연산이 가능한 연산자라면 
        서브쿼리의 결과행 수 는 반드시 하나여야함. 
*/

-- 단일행 서브쿼리 : 실행의 결과가 하나의 행으로 나오는 쿼리 
--     = , != , > , >= , < , <= 

-- 급여가 가장 높은 사원 조회하기 . 
-- 1. 가장높은급여를 조회. 
select max(salary) from employees; -- 24000
select * from employees where salary = 24000;
select * from employees where salary = (select max(salary) from employees);
-- Q1. 평균급여 이상을 받는 사람 조회하기. 
select avg(salary) from employees;   -- 서브쿼리로 사용할 쿼리
select * from employees where salary > (select avg(salary) from employees) ; 
-- Q2. 부서번호가 10인 부서와 같은 지역에 있는 부서들 조회하기 (departments테이블사용 )
select * from departments;
select location_id from departments where department_id = 10 ; -- 10번부서의 로케이션아이디 출력
select department_id, department_name from departments 
    where location_id = ( select location_id from departments where department_id = 10  )    ;
--    ++  디파트먼트명과 시티명을 같이 출력해보세요 (locations 테이블도 사용)
select * from locations;
-- inner join을 사용해서 departments와 locations테이블을 함께 보기 
select d.location_id, d.department_name, l.city 
from departments d, locations l 
where d.location_id = l.location_id
         and d.location_id = ( select location_id from departments where department_id = 10 ) ;
-- 다중행 서브쿼리 : 하나이상의 행을 검색하는 서브쿼리
-- in (같은값들) , any(최소한 하나라도 만족 or ) , all( 모두만족 and) , exists (데이터가 존재하기만한다면)
-- john(first_name)과 같은 부서에서 근무하는 사람들 조회하기 
select department_id from employees where first_name = 'Shelley'; -- shelley는 한명. 부서번호 1개 .
select department_id from employees where first_name = 'John';  -- john은 총 3명 
select * from employees where department_id in (100,80,50); 
select * from employees where department_id in 
                    (select department_id from employees where first_name = 'John');
-- john 보다 높은 급여를 받는 사람 조회 
select salary from employees where first_name = 'John'; -- 8200, 14000, 2700
-- any 연산자 : 값들 중 한개만 만족하면 true
select * from employees where salary  > any (select salary from employees where first_name = 'John');
-- all 연산자 : 값들 모두를 만족해야 true
select * from employees where salary  >  all (select salary from employees where first_name = 'John');

-- Q. 50번 부서에 근무하는 사람들의 매니져 정보를 출력하세요  
-- 1. 50번부서 매니져 아이디 구하기 (100,124,..)
select manager_id  from employees where department_id = 50 ;  -- (124,100,123,122,121)
-- 2. 1을 이용해서 출력하기 in 사용
select * from employees where employee_id in (100,120,121,122,123,124);
select * from employees where employee_id in
                ( select manager_id  from employees where department_id = 50 );

-- Q. 직책이 'ST_MAN'인 사원의 최소급여보다 많으면서 
-- 부서번호가 90번이 아닌 사원의 이름, 급여 부서번호 출력
-- select * from employees where job_id = 'ST_MAN';  --  (5800,6500,7900,8000,8200)
-- 1. 직책이 st_man인 사원의 급여들. (서브쿼리)
 select salary from employees where job_id = 'ST_MAN';
-- 2. 메인쿼리 : 부서번호가 90번이 아닌 사원의 이름, 급여, 부서번호 출력하는데 조건이 급여가 많은. 
select first_name, salary, department_id from employees 
    where department_id != 90 and 
    salary > any ( select salary from employees where job_id = 'ST_MAN' );   
-- Q. 직책이 'ST_MAN'인 사원의 최대급여보다 많으면서 부서번호가 90번이 아닌 사원의 이름, 급여, 부서번호
select first_name, salary, department_id from employees 
    where department_id != 90 and 
    salary > all ( select salary from employees where job_id = 'ST_MAN' );   
    
-- Q. seattle 에 근무하는 사람들 조회하기 
-- 1. 근무지가 시애틀인 부서아이디 
--  1-1 시티이름이 시애틀인 로케이션 아이디를 locations테이블에서 가지고와서 
select location_id from locations where lower(city) = 'seattle';  -- 1700 인것을 확인.
--  1-2 얘를 사용해서 부서아이디들을 departments테이블에서 출력 
select department_id from departments where location_id = 
            (select location_id from locations where lower(city) = 'seattle');  -- 10,.....207
-- 2. 최종 
select * from employees where department_id in 
        (select department_id from departments where location_id = 
            (select location_id from locations where lower(city) = 'seattle')); 


-- 다중열 서브쿼리 : 하나이상의 열(컬럼)을 검색하는 서브쿼리

-- 다중행 서브쿼리로 부서별 최저급여와 같은 급여를 받는 사람들을 출력
select min(salary) from employees group by department_id;  -- 부서별 최저시급을 출력 
select * from employees where salary in 
            ( select min(salary) from employees group by department_id); 

-- 다중열 서브쿼리의 경우 
select * from employees where ( department_id, salary) in 
            ( select department_id, min(salary) from employees group by department_id);

-- Q. 직책별 최소급여를 받는 사원의 사번, 이름, 직책, 부서번호를 출력. (직책별 정렬)
-- 직책별 최소급여 
select job_id, min(salary) from employees group by job_id;  -- 서브쿼리

select employee_id, first_name, job_id, department_id, salary from employees 
        where (job_id, salary) in 
        ( select job_id, min(salary) from employees group by job_id)
order by job_id;

-- Q. 이름, 부서번호, 급여, commission_pct 를 출력하는데.  (메인쿼리)
--  부서번호는 80번이고 commission_pct를 받는 사원과   급여와 부서가 일치하는 사원들 (서브쿼리)
-- 1. 부서번호가 80번이고 commission_pct를 받는사원의 급여와 부서를 출력 (서브쿼리)
select salary, department_id from employees where department_id = 80 and commission_pct is not null;

-- 2. 메인쿼리 
select first_name, department_id, salary, commission_pct from employees 
    where ( salary, department_id) in 
    (select salary, department_id from employees where department_id = 80 and commission_pct is not null);
/* 인라인 뷰 : from 절에는 테이블 뿐만 아니라 서브쿼리도 사용이 가능함. 
 - 서브쿼리가 from 절에 사용되는 경우 해당 서브쿼리를 인라인 뷰 라고 한다.
 - from 절에서 사용된 서브쿼리의 결과가 하나의 테이블에대한 뷰(view) 처럼 사용이된다. 
 - 인라인뷰는 특정테이블 전체가 아닌 select 문을 통해서 일부 데이터를 추출 후 별칭을 줘 사용함.
 - ( 뷰 : 실제 데이터를 저장하고 잇지 않지만 dml 작업이 가능한 가상의 테이블. )
 - 마치 가상의 테이블(뷰)과 같은 역할을해서 인라인 뷰라고 부름. 
  select 열이름 
 from 테이블명 as 별칭1, (select 열이름2 from 테이블명 where 조건식) as 별칭2
 where 별칭1.열이름1 = 별칭2.열이름2  */    
select * from employees a , (select department_id from departments where department_name='IT') b
where a.department_id = b.department_id  ;

-- select * from employees a, departments b  where a.department_id = b.department_id and b.department_name='IT' ;

select e80.employee_id, e80.first_name, d.department_id, d.department_name
from (select * from employees where department_id =80 ) e80 , 
        (select * from departments) d
where e80.department_id = d.department_id;

-- 부서의 평균 급여 이상을 받는 모든 직원에 대해, 이름, 급여, 부서, 평균급여 출력. 
select a.first_name, a.salary, a.department_id, b.salavg
from  employees a, 
        (select department_id, avg(salary) salavg from employees group by department_id ) b
where a.department_id = b.department_id and a.salary > b.salavg;

-- Q. 인라인 서브쿼리를 사용해서 sales 부서에서 일하는 사원의 정보를 출력 
-- sales부서의 정보 
select department_id, department_name from departments where lower(department_name) = 'sales';  -- 80, Sales 
select *  from employees a,
   (select department_id, department_name from departments where lower(department_name) = 'sales') b
where a.department_id = b.department_id;
-- Q. 인라인 서브쿼리를 사용해서 110 번 부서에서 일하는 사원의 정보를 출력 

select * from employees a, 
    (select department_id, department_name from departments where department_id = 110) b
where a.department_id = b.department_id ; 

select * from employees a, 
    (select employee_id from employees where department_id = 110) b
where a.employee_id = b.employee_id;

-- Q. 부서번호 110의 평균급여보다 급여를 더 많이 받고, 대표가 아니며, 110번 부서에 속하지 않은 사원
--     서브쿼리 안의 서브쿼리 사용

-- 1. 110 번 부서의 평균 급여 
select avg(salary) from employees where department_id = 110; 
   select employee_id from employees 
where salary > ( select avg(salary) from employees where department_id = 110) ;

select * from employees a , 
    (select employee_id from employees where salary > ( select avg(salary) from employees where department_id = 110)) b
where a.employee_id = b.employee_id 
         and manager_id is not null 
         and a.department_id != 110; 
-- from 절에 직접 테이블을 명시하기에 규모가 크거나 많을 경우 with절을 사용함. 
/*
with 
별칭1 as (select 문1), ....
별칭n as (select 문n)
select ... from 별칭1, ..별칭n 
*/
with
e80 as (select * from employees where department_id =80 ) ,
d as  (select * from departments)
select e80.employee_id, e80.first_name, d.department_id, d.department_name
from e80, d
where e80.department_id = d.department_id;

--  scalar subquery 스칼라 서브쿼리 : select절에 사용하는 서브쿼리 
-- 이 서브쿼리는 하나의 결과만 출력을 해야함. 

select  e.employee_id, e.first_name , ( select department_name from departments d where e.department_id = d.department_id  )
from employees e; 

select e.employee_id, e.first_name, e.job_id, e.salary
-- ,(select s.grade from salary_grade s where e.salary between s.low_salary and high_salary ) 급여등급
,e.department_id,
(select department_name from departments d where e.department_id = d.department_id ) 부서이름
from employees e ;

select e.salary, s.grade 
from employees e, salary_grade s
where e.salary between s.low_salary and high_salary;

