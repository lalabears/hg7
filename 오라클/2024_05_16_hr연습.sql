/*
조인 : 여러테이블을 하나의 테이블처럼 사용 
단일 테이블을 조회하기보다는 여러테이블을 조합해서 출력해야하는 경우, 
이를 가능하게 해주는 것이 조인이다. 
즉, 두개 이상의 테이블을 가로로 연결한 것. 
*/

-- 1. cross join : 조건이 없는 테이블의 연결
-- 모든행을 조합해준다. 조인한 테이블을 가로로 연결. 
-- 연결기준이 없기때문에 필요없는데이터가 많이 포함되어있음
select * from employees, departments;

-- 2. inner join : 가장 대표적인 조인 방법 (등가조인, 단순조인, 이너조인, 동등조인)
-- where절을 사용해서 출력하고자하는 기준을 두고, 두 테이블에서 일치하는 데이터만 출력하도록 조건을 줌
select * from employees, departments
where employees.department_id = departments.department_id; 

-- 별칭을 사용할 수 있다.  별칭은 from절에 테이블 이름을 쓰고 빈공백을 한칸두고 그 뒤에 지정해줌 
select * from employees e, departments d 
where e.department_id = d.department_id; 
-- 원하는 컬럼을 출력하려면 어느 테이블에서 가지고 올 것인지 명시해 주는것이 좋다. 
-- 특히 공통된컬럼을 가지고 있을 경우, 어느테이블에서 가지고 올지 명시하지 않으면 오류가 생긴다. 
-- 이름이 겹치지 않는 컬럼을 사용할때는 테이블명을 명시하지 않아도 됨. 
select e.first_name || ' ' || e.last_name, salary, d.department_id, department_name
from employees e, departments d
where e.department_id = d.department_id; 
-- where 절에 조건을 추가해서 출력범위를 지정할 수 있다. 행을 제한하고싶을때 사용.
-- 예를들어 위의 결과에서 급여가 5000이상인 사원만 출력하고 싶을때. 
select e.first_name || ' ' || e.last_name, salary, d.department_id, department_name
from employees e, departments d
where e.department_id = d.department_id and salary >= 5000; 
-- Q. 급여가 5000 이하이고, 사원번호가 150 이상인 사원의 이름과 부서 정보를 출력
select employee_id, first_name|| ' ' || last_name as name, salary, d.department_id, department_name
from employees e, departments d
where e.department_id = d.department_id 
and salary <=5000 and employee_id>=150;

-- 3. non-equal join 비등가조인, 비동등조인  : inner join이와의 방식을 의미함
-- 급여 등급으로 나누어서 출력해 볼 수 있다. 
select * from salary_grade; 
select e.employee_id, e.first_name, e.salary, s.grade  from employees e, salary_grade s
where e.salary between low_salary and high_salary  order by e.employee_id; 
-- 샐러리 등급 테이블은 각 급여의 기준이 되는 최소금액 최대금액을 지정하고 있음.
-- 각 사원의 정보와 급여 등급을 함께 출력하고자 할때 두 테이블을 조인해야함. 
-- 그러나 연결해줄 공통된 컬럼이 없는 두 테이블을 연결할 경우 inner join은 부적합함.
-- 급여등급을 맞춰주려면 급여액이 일치하는것이아니라 범위안에 잇어야 하기때문. 
-- 이럴때 사용하는것이 비동등조인. between and 연산자를 사용해 조인할 수있다.
-- 자주사용하는 방식은 아님.

-- Q. hire_date를 기준으로 입사연도가 
-- 08년도일 경우 08입사, 07년도일경우 07입사, 06입사, 05입사, 그전입사 라고 표현하고싶습니다. 
-- employees 테이블과 hdate 테이블을 조인해서 출력해보세요 . 
create table hdate
(   
    years varchar(30),   -- '08입사'
    l_date date,           --  to_date('20080101','yyyymmdd') 
    h_date date           --  to_date('20080101','yyyymmdd') 
); 
insert into hdate values ('08입사', to_date('20080101','yyyymmdd') ,to_date('20081231','yyyymmdd') );
insert into hdate values ('07입사', to_date('20070101','yyyymmdd') ,to_date('20071231','yyyymmdd') );
insert into hdate values ('06입사', to_date('20060101','yyyymmdd') ,to_date('20061231','yyyymmdd') );
insert into hdate values ('05입사', to_date('20050101','yyyymmdd') ,to_date('20051231','yyyymmdd') );
insert into hdate values ('그전입사', to_date('19700101','yyyymmdd') ,to_date('20041231','yyyymmdd') );
commit;
select * from hdate; 
select e.employee_id, e.first_name, e.hire_date, h.years as 입사년도
from employees e, hdate h
where e.hire_date between h.l_date and h.h_date ; 

-- 4. self join : 자체조인 
-- 한개의 테이블을 자기자신과 조인해야만 얻을 수 잇는 정보가 있을 때 사용. 
-- 직속상관의 이름을 알고자 한다면, 직속상관의 아이디를 사용해서 직원번호 내 이름을 검색해야함. 
-- 임플로이테이블을 복제해서 두개의 임플로이 테이블을 만들어 inner 조인을 해야 알 수 있지만
-- 물리적 낭비 등이 심하다. 
-- 때문에 자체 조인을 사용한다. 사용방법은 별칭을 다르게 부여해서 사용하면된다. 
select e1.employee_id 사원번호, e1.first_name  사원이름, e1.manager_id 상사번호,
         e2.employee_id 상사사원번호 , e2.first_name 상사이름
from employees e1, employees e2
where e1.manager_id = e2.employee_id ; 
-- 일치하는 데이터를 기준으로 정렬되기 때문에 이너조인과 같다고 생각하면된다. 

-- Q. 이메일주소가  NGREENBE 인 사람의 부서이름을 출력해보세요 >>  inner join 사용
select e.email, d.department_name  from employees e, departments d
where e.department_id = d.department_id and e.email = 'NGREENBE';  
-- Q. 이메일주소가  NGREENBE 인 사람과 동일한 부서(department_id)에서 근무하는 사원의 이름을 출력
select department_id from employees where email ='NGREENBE'; -- 100 번부서 
select first_name from employees where department_id = 100 ; 
select e1.first_name, e1.department_id, e1.email
from employees e1, employees e2
where e1.department_id = e2.department_id and  e2.email ='NGREENBE';

-- 5. outer join 외부조인 : 조인조건에 충족하지 않아 최종출력에서 제외된 결과를 포함하고자 할때 사용 
-- 즉, 한쪽 결과가 null임에도 결과를 출력할때 포함시켜야 할 경우 사용 
-- (+) 기호를 사용함. 
select e1.employee_id 사원번호, e1.first_name  사원이름, e1.manager_id 상사번호,
         e2.employee_id 상사사원번호 , e2.first_name 상사이름
from employees e1, employees e2
where e1.manager_id = e2.employee_id(+)
--     steven king의 manager_id = null    = > employee_id가 null 인사람은 존재하지 않음. 
order by e1.employee_id; 
select e1.employee_id 사원번호, e1.first_name  사원이름, e1.manager_id 상사번호,
         e2.employee_id 상사사원번호 , e2.first_name 상사이름
from employees e1, employees e2
where e1.manager_id(+)  = e2.employee_id
order by e1.employee_id; 

-- ansi조인 - 표준문법을 사용. 
-- inner join , outer join 
-- 오라클문법
select * from employees e , departments d
where e.department_id = d.department_id and e.department_id =20; 
-- ansi 이너조인  on 을 사용  :  from table1 join table2 on (조인조건식)
select *
from employees e inner join departments d
on e.department_id = d.department_id 
where e.department_id = 20 ;
-- ansi 이너조인 using  : from table1 join table2 using(조인에사용하는컬럼)
select * from employees e inner join departments d
using (department_id)
where department_id = 20 ; 

-- outer join 
-- 오라클 문법 (+) 기호를 사용해서 아우터 조인 
select e1.employee_id 사원번호, e1.first_name  사원이름, e1.manager_id 상사번호,
         e2.employee_id 상사사원번호 , e2.first_name 상사이름
from employees e1, employees e2
where e1.manager_id = e2.employee_id(+) 
order by e1.employee_id;
-- ansi outer join : left outer join, right outer join, full outer join 
select e1.employee_id 사원번호, e1.first_name  사원이름, e1.manager_id 상사번호, e2.employee_id 상사사원번호 , e2.first_name 상사이름
from employees e1 left outer join employees e2
on e1.manager_id = e2.employee_id
order by e1.employee_id;
-- full outer join = left outer join + right outer join  
select e1.employee_id 사원번호, e1.first_name  사원이름, e1.manager_id 상사번호, e2.employee_id 상사사원번호 , e2.first_name 상사이름
from employees e1 full outer join employees e2
on e1.manager_id = e2.employee_id
order by e1.employee_id;

-- Q1. 급여가 5000을 초과하는 사원의 부서정보, 사원의 정보를 출력해보세요  > join을 해야겟구나 
-- department_id, department_name, LOCATION_ID, employee_id, first_name, salary 
select e.employee_id, first_name, salary , e.department_id, department_name, LOCATION_ID
from employees e, departments d 
where e.department_id = d.department_id and salary > 5000; 
-- Q2. 각 부서별(department_id, department_name) 평균급여, 최대급여, 최소급여, 사원수를 출력하세요 
/*  select  컬럼명, 그룹함수(컬럼명)
     from 테이블명
     [where 조건식]
     group by 컬럼명 (한개일 필요는없음)
     [having 조건식]
     [order by 컬럼명]    */
     
-- join 없이 employee 테이블에서 .. 
select department_id,job_id, round(avg(salary),2) 평균급여, min(salary) 최소급여, max(salary) 최대급여
        , count(*) 사원수
from employees 
group by department_id, job_id
order by department_id;

-- department_name이 employees 테이블에 존재하지 않기 때문에 조인을 해주어야함. 
select e.department_id, department_name,  round(avg(salary),2) 평균급여, 
        min(salary) 최소급여, max(salary) 최대급여 , count(*) 사원수
from employees e, departments d  
where e.department_id = d.department_id
group by e.department_id, department_name
order by e.department_id;

-- Q3. 모든부서의 정보와 사원의 정보를 부서순, 급여의 역순으로 정렬해서 출력해보세요 
-- employees, departments  order by 컬럼1 asc, 컬럼2 desc 
select *                                                    -- 출력되는 컬럼. * : 모든테이블을 의미. 
from employees e, departments d              --가지고 올 테이블 
where e.department_id = d.department_id    -- 조건절, join을 할때 기준이되는컬럼명시  
order by e.department_id asc, e.salary desc; 

-- Q4. 모든부서의 정보, 사원의 정보, 급여등급의 정보를 출력해보세요
--     출력 컬럼 :  department_id, department_name, employee_id, first_name, salary, grade
--   employees, departments, salary_grade 
--   부서순, 사원순으로 정렬
select  a.department_id, b.department_name, a.employee_id, a.first_name, a.salary, c.grade    -- 출력할컬럼. 
from employees a, departments b, salary_grade c   -- 가져올 테이블
where a.department_id = b.department_id            -- inner join                                                        
          and 
          a.salary between c.low_salary and c.high_salary    -- 비동등조인
order by a.department_id, a.employee_id;
-- 집합 연산자 (set operator)
-- select 문을 여러개 연결해서 작성. 각 select문의 조회 결과를 하나로 합치거나 분리. 
-- 집합연산자는 합집합, 교집합, 차집합의 논리와 같음. 
-- 1. 두 집합의 select절에 오는 컬럼의 개수가 동일해야함. 
-- 2. 두 집합의 select절에 오는 컬럼의 데이터형이 동일해야함. 
-- 3. 두 집합의 컬럼명은 달라도 상관없다. 
/*   select 열이름1, 열이름2, 열이름3 , ... 
      from 테이블명1
      집합연산자
      select 열이름1, 열이름2, 열이름3 , ... 
      from 테이블명2
      [order by 열이름[asc/desc]]
*/
select department_id from employees order by department_id;     -- 107명의 부서아이디 
select department_id from departments order by department_id;   -- 부서 27개 

-- union (합집합) : 두개의 집합을 더해서 결과를 출력하는데 중복되는 행은 한번만 출력 
select department_id from employees 
union 
select department_id from departments;
-- 중복되는행을 한번만 출력하기때문에 departments테이블에 있는 27개의 행 
--  + employees  테이블에 있는 null이라는 부서를 출력해서 총 28개가 출력되는 것을 볼 수 있다. 

select employee_id, job_id from employees           -- 107개의 행이 있음 
union 
select employee_id, job_id from job_history;           -- 10개의 행이 있음
-- 중복된 행을 제거하고 115개의 행이 출력이 되는것을 확인할 수 있다. 

-- union all (합집합) : 중복된행도 그대로 출력을 해줌. 
-- 두개의 집합을 더해서 결과를 출력해줌. (중복값 제거안함, 정렬안함)
select department_id from employees    -- 107개
union all 
select department_id from departments; -- 27 개
-- 134개의 열이 출력. 
select employee_id, job_id from employees           -- 107개의 행이 있음 
union all 
select employee_id, job_id from job_history;           -- 10개의 행이 있음
-- 117개가 출력이 되는것을 볼 수 있음. 

-- interscet(교집합) : 중복되는 행만 출력. 정렬해줌. 
select department_id from employees
intersect
select department_id from departments;  
-- departments테이블에 department_id가 27개 존재하나, 
-- employees에서 사용하는 id는 11개 여서 11개 출력
select employee_id, job_id from employees 
intersect
select employee_id, job_id from job_history;
-- job_history테이블에 존재하는 사원 2명만 출력됨. 
-- 즉, 양쪽에서 공통된 결과만 검색해줌

-- minus(차집합) : 첫번째 select문 결과에서 두번째 select문 결과를 뺀다. 즉, 쿼리의 순서가 중요함. 
select department_id from employees 
minus 
select department_id from departments
order by department_id; 

select department_id from departments
minus 
select department_id from employees 
order by department_id; 

select employee_id, job_id from employees 
minus
select employee_id, job_id from job_history;
-- union 연산을 통해서 모든사원의 department_id, location_id, hire_date를 검색을 하고싶을때.
select  department_id,   to_number(null)  location   ,hire_date     from employees
union 
select  department_id,   location_id,            to_date(null) from departments; 
-- 집한 연산을할때 select문의 컬럼개수와 타입이 일치해야한다. 
-- to_number(null)은 타입과 개수를 맞추어 주기위해서 사용함. 
-- 검색의 결과의 컬럼이름은 앞쪽 select문에 의해서 결정이 된다. 

-- Q. 라스트네임이 k로 시작하면서 job_id가 SA_REP가 아닌 사람을 조건절로 출력 
select * from employees 
where lower(last_name) like 'k%' and job_id != 'SA_REP'; -- 4명출력

-- Q. 같은 문제를 집합연산자를 사용해서 출력 
-- 라스트네임이 k로시작하는 사람 - 직책이 SA_REP 인사람. 
select last_name, job_id from employees where lower(last_name) like 'k%' 
minus 
select last_name, job_id from employees where job_id = 'SA_REP'; 



