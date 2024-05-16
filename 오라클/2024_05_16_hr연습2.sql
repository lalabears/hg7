/*서브쿼리  
- select 문 안에 다시 select문이 기술된 형태의 쿼리. 
- 서브쿼리의 결과는 메인쿼리의 조건으로 사용됨.
- 단일 select문으로 조건식을 만들기 조건이 너무 복잡할때
- 완전히 다른 테이블에서 데이터값을 조회해서 메인 쿼리의 조건으로 사용할 경우 유용함
- 서브쿼리는 ( ) 로 묶에서 사용. 
- 메인쿼리의 연산자는 왼쪽에 기술함. 서브쿼리의 연산자는 오른쪽에 기술 
- 서브쿼리의 서브쿼리 형태로 중첩해서 사용할 수 있다. 
select 열이름1, 열이름2, .. 
from 테이블명
where 조건식  연산자   
                                 ( select 열이름1, 열이름2,..
                                   from 테이블명
                                   where 조건식)  ;

 서브쿼리와 메인쿼리는 연산자로 연결됨.  */
 -- shelley 보다 높은 급여를 받는 사람을 검색 
 -- 1. Shelley 급여를 검색한다.
 select first_name , salary from employees where lower(first_name) = 'shelley';
 -- 2. 12008 보다 높은 급여를 받는 사람들을 검색한다. 
 select * from employees where salary > 12008 ; 
 -- 총 두개의 쿼리문을 사용해야한다.
 -- 서브쿼리를 사용하면 where문에 조건식으로 들어 갈 수 있다. 
 -- 기준이 되는 급여를 구하는 부분이 select문의 서브쿼리가된다. 
 -- 그리고 사원을 조회하는 부분을 메인쿼리로 사용한다. 
SELECT     *    FROM    employees
WHERE      salary  > 
            ( SELECT   salary    FROM   employees        WHERE            lower(first_name) = 'shelley' );

/*
단일행 서브쿼리 : 실행의 결과가 하나의 행으로 나오는 서브쿼리. 
서브쿼리에서 출력되는 결과가 하나이므로 메인쿼리와 서브쿼리 결과는 단일행 연산자를 사용해서 비교한다. 
 =  같다,  != 같지않다 , > 크다 , >= 크거나 같다 , <작다, <= 작거나 같다
- 서브쿼리 select문에서 얻는 한개의 행의 결과를 메인쿼리로 전달. 
-조건식인 where절에 기술되는 열의 개수와 데이터타입은 메인쿼리와 서브쿼리가 같아야함. 
*/
-- De Haan 과 급여가 같은 사람을 출력해보면 
-- De Haan의 급여를 찾고 > 그 값을 이용해서 전체테이블에서 검색한다. 
select * from employees where salary = 
                (select salary from employees where last_name = 'De Haan'); -- 급여가 17000인사람
-- De Hann 이라는 라스트네임을 가지는 사람이 하나이기때문에 단일행 서브쿼리라고 한다. 
-- 그런데 검색 조건에서 이름을 사용하는것은 같은 이름이 있을 수 있기 때문에
-- 단일행  서브쿼리로 사용할때는 주의해야한다. 

-- Q. email이 LOZER인 사람의 연봉보다 높은 연봉을 받는 사람의 정보를 출력 
select * from employees where salary > 
                        ( select salary from employees where lower(email) = 'lozer');  --11500
-- Q. neena 보다 빨리 입사한 사원의 목록을 조회 (first_name)
-- 단일행 서브쿼리에서 날짜를 사용할 수 있다. 
select * from employees where hire_date < 
                ( select hire_date from employees where lower(first_name) ='neena'); 
                
-- Q. 20번 부서에 속한 사람 중 전체사원의 평균 급여보다 높은 급여를 받는 사람을 조회 
select * from employees where department_id = 20 and 
                                            salary >  ( select avg(salary) from employees   ) ;    
--   ++ 20번 부서에 속한 사람 중 전체사원의 평균 급여보다 높은 급여를 받는 사람의 
--            first_name, hire_date, salary, department_id, department_name 을 조회
select e.first_name, e.hire_date, e.salary, e.department_id, d.department_name
from employees e, departments d 
where e.department_id = d.department_id
        and e.department_id = 20 
        and salary > (select avg(salary) from employees);
/*
 다중행 서브쿼리 : 하나이상의 행을 검색하는 서브쿼리 (결과의 행이 여러개로 나오는 서브쿼리)
 때문에. 단일행연산자를 사용할수 없고 다중행 연산자를 사용해야함. 
 - in : 메인쿼리의 데이터가 서브쿼리의 결과중 하나라도 일치하는 데이터가 있다면 true
            in (같은값) not in (같은값이 아님)
 - any, some : 메인쿼리의 조건식을 만족하는 서브쿼리의 결과가 하나 이상이면 true
            any(최소한 하나라도 만족하는것, or 와같음)
 - all : 메인쿼리의 조건식을 서브쿼리의 결과가 모두 만족하면 true 
            all(모두 만족하는것,  and 와같음)
 - exists : 서브쿼리의 결과가 존재하면. 즉 검색된 행이 한개 이상일 경우 true
             exists(값이 있으면)  */
-- 부서별 최저급여 
select min(salary) from employees group by department_id; -- 2100 6500 8300 10000 .. 
-- 단일행 서브쿼리와 달리 값이 여러개가 나온다. 
select * from employees where salary in (2100, 6500) order by salary desc;
-- 합쳐서 다중행 서브쿼리로 표현할 수 있다. 
select * from employees e1 where e1.salary in 
        (select min(e2.salary) from employees e2 group by e2.department_id)
order by e1.salary ;
-- 각 부서별 최저급여를 출력하는데, 그 급여와 같은 급여를 받는 사원들만 출력 

-- 부서번호 110 사원중 급여를 가장 많이 받는 사원보다 더 많은 급여를 받는 사람의 이름과 급여를 출력
select first_name, salary, department_id from employees where department_id = 110;
-- 12008, 8300
-- any / some 연산자 중 = 를 사용하면 in 과 같은 기능을 수행함. 
select  a.last_name, a.salary from employees a where a.salary =
            any ( select b.salary from employees b where b.department_id = 110 );
-- 검색한 값 중 가장 작은 값보다 크기만 해도 참 ( 하나만 만족해도 참(
select a.last_name, a.salary from employees a where a.salary >
           any ( select b.salary from employees b where b.department_id = 110 );
-- 즉 급여가 8300 보다 크기만하다면 다 출력해줌. 
select a.last_name, a.salary from employees a where a.salary >
            (select min(b.salary) from employees b where b.department_id = 110 );
--- 
select a.last_name, a.salary from employees a where a.salary <
           any ( select b.salary from employees b where b.department_id = 110 );
select a.last_name, a.salary from employees a where a.salary <
            ( select max(b.salary) from employees b where b.department_id = 110 )
order by a.salary desc;  -- 12008

-- all : 검색한 값 모두를 만족해야함. 
select a.last_name, a.salary from employees a where a.salary >
           all ( select b.salary from employees b where b.department_id = 110 ); -- 12008 and 8300
           
-- exists : 서브쿼리의 값이 하나이상만 존재하면 조건식이 모두 참. 아님 거짓이 된다. 
-- 서브쿼리의 결과가 하나라도 존재하면 메인쿼리 전체 출력
select * from employees where exists 
                (select department_name from departments where department_id = 50); 
select count(*) from employees where exists 
                (select department_name from departments where department_id = 50); 
-- 서브쿼리의 결과가 존재하지 않으면 아무행도 출력이 되지 않는다.                 
select * from employees where exists 
                (select department_name from departments where department_id = 300); 

-- 직원중. department_id가 존재하지 않는 사원의 수 ? 
select count(*) from employees e where not exists 
                ( select * from departments d where e.department_id = d.department_id);      
select count(*) from employees e1 where not exists 
                ( select * from employees e2 where e1.manager_id = e2.employee_id);          
                
-- Q1. h로 시작하는 직원(last_name)과 같은 부서의 직원을 출력 
select department_id from employees where lower(last_name) like 'h%'; -- 20,30,60,80,110
select * from employees a where a.department_id in 
                            ( select department_id from employees where lower(last_name) like 'h%' ); 
-- Q2. 20번 부서에 속한 모든 사원들보다 일찍 입사한 사원의 정보를 출력 
select hire_date from employees where department_id = 20; -- 04/02/17, 05/08/17
select * from employees e where e.hire_date < 
            all (select hire_date from employees where department_id = 20);
            
/*
 다중열 서브쿼리 : 하나이상의 열을 검색하는 서브쿼리(여러개의 컬럼)
 메인쿼리와 서브쿼리를 비교하는 where 조건식에서 비교되는 열이 여러개 일때 사용. 
 열이름의 개수와 데이터타입은 동일해야한다. 
*/
-- job_id 별 최저시급을 받는 사원의 정보 
select job_id, min(salary) from employees group by job_id;
-- 다중열 서브쿼리를 사용해서 job_id별 최저시급을 받는 사람들 출력 
select * from employees a where (a.job_id, a.salary) in 
                                    ( select job_id, min(salary) from employees group by job_id )
order by a.salary desc;
-- 다중행 서브쿼리를 사용해서 최저급여와 같은 급여를 받는 사람들을 출력 : 
select * from employees a where a.salary in (select min(salary) from employees group by job_id);

-- Q. 부서별(department_id) 최대 급여를 받는 사람들을 출력해보세요 (다중열서브쿼리사용)
select * from employees a where (a.department_id, a.salary) in 
                            ( select department_id, max(salary) from employees group by department_id)
order by a.department_id; 

--------------------------------------------------------------
-- 둘다 group by 사용해보세욤
-- Q1. 사원테이블(employees)에서 사원의 급여(salary)가 
--   40번 부서(department_id) 의 최소급여보다 많이 받는 부서(department_id)를 출력 
select min(salary) from employees where department_id = 40 ;  -- 6500
select department_id, min(salary) from employees 
group by department_id
having min(salary) > (select min(salary) from employees where department_id = 40 ) ;
-- Q2. 사원테이블의 사원급여가 70번 부서의 평균급여보다 많이 받는  
-- 직책 (job_id) 과 평균 급여를 출력  ( 직책별 평균급여 ) 
-- 1. 70번 부서의 평균급여 
select avg(salary) from employees where department_id = 70;   -- 10000
-- 2. 직책 별 평균 급여 
select job_id, avg(salary) from employees   group by job_id; 
-- 3. 직책별 평균급여가 10000 이상인 직책들만 출력 
select job_id , avg(salary) from employees  group by job_id   having avg(salary) >= 10000;
-- 4. 서브쿼리로 표현하기 
select job_id , avg(salary) from employees  group by job_id 
having avg(salary) >= (select avg(salary) from employees where department_id = 70) ;

-- in 연산자를 사용해서 . 
-- Q3. first_name => Oliver, Daniel과 같은 직책(job_id)을 가지는 사원들의 
--    이름, 입사일, 직책, 부서번호 출력
-- 1.올리버의 직책을 출력하는 쿼리  'A'
select job_id from employees where lower(first_name) = 'oliver'; -- SA_REP
-- 2. 다니엘의 직책을 출력하는 쿼리 'B'
select job_id from employees where lower(first_name) = 'daniel'; -- FI_ACCOUNT
-- 3. in 연산자를 사용해서 in ('A','B')
select first_name, hire_date, job_id, department_id from employees 
where job_id in ('SA_REP', 'FI_ACCOUNT');
-- 4. 합치면 
select first_name, hire_date, job_id, department_id from employees 
where job_id in (
        (select job_id from employees where lower(first_name) = 'oliver')     ,
        (select job_id from employees where lower(first_name) = 'daniel')   
);
-- Q. 부서별 급여를 가장 많이 받는 사원과 급여가 같은 사원번호, 급여, 부서아이디를 출력 (in 사용) 
-- 1. 부서별 최대급여 출력 후
select max(salary) from employees group by department_id;
-- 2. in 연산자 사용해서 출력 
select employee_id, salary, department_id from employees 
where salary in (select max(salary) from employees group by department_id);

-- Q. 사원테이블의 사원 중 TJ (first_name) 이 속한 부서의 사원보다 늦게 입사한 사원들의
-- 사원명, 직책(job_id), 급여, 입사일 출력 - any 사용 
-- 1. TJ 가 속한 부서의 부서명
select department_id from employees where first_name='TJ';  -- 50 번부서 
-- 2. 그 부서명을 사용해서 hire_date 들을 출력 
select hire_date from employees where department_id = 
                (select department_id from employees where first_name='TJ'); 
-- 3. any로 입사일을 비교해서 출력  - or 결과중에 하나만 만족을 하더라도 됨. 
select first_name, job_id, salary, hire_date  from employees   
where hire_date > any (select hire_date from employees where department_id = 
                (select department_id from employees where first_name='TJ') ) ;
-- 3. all 입사일을 비교해서 출력   - and 모든 결과를 만족을 해야함.
select first_name, job_id, salary, hire_date  from employees   
where hire_date > all (select hire_date from employees where department_id = 
                (select department_id from employees where first_name='TJ') );
                

            






