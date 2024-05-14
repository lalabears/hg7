/*
조인  : 두개이상의 테이블을 연결해서 하나의 테이블처럼 출력할때 사용 

지금까지 테이블은 from절에 하나만 명시했지만 여러개 테이블을 사용할 수 잇음

*/
select * from employees;
select * from departments; 
-- 모든행의 조합을 다 출력하기 때문에 의미있는 데이터는 아니다. 
select * from employees, departments; 

select count(*) from employees;  -- 107 개
select count(*) from departments; -- 27 개
select count(*) from employees, departments; -- 107 * 27 = 2889 개


-- 조인을 사용하는 이유는. 
-- 한개이상의 테이블을 서로 연결하면서 내가 필요한 정보가 하나의 테이블에 존재 하지 않아도
-- 연결 연결해서 마지막에 있는 테이블의 데이터를 가져오기 위해서 . 

select * from employees where employee_id = 124; 
select department_id from employees where employee_id= 124;
select * from departments where department_id=50; 

-- 1. cross join : 조건 없이 모두 매칭한 결과. 
select * from employees, departments; 
-- 결과에서 보면 알듯, 아무 의미가 없다. 결과가 의미를 가지려면 조건이 필요함 

-- INNER JOIN : 동등조인 (equal join)
/*
select 테이블이름1.열이름1 , [테이블이름2.열이름2 , .... ]
from 테이블이름1, 테이블이름2
where 테이블이름1.열이름1 = 테이블이름2.열이름2 

두 테이블의 열이 가지고있는 데이터 값을 논리적으로 연결. 연결하는 기호로는 등호를 사용
열이름은 내가 조인하고자하는 기준이 되는 열 
*/
select * from employees, departments 
where employees.department_id = departments.department_id; 

-- 별칭을 사용함. 
select * from employees A, departments B
where A.department_id = B.department_id; 
-- 컬럼 명을 어느 테이블에서 가져와야 할지 알 수 없어서 오류가 발생함. 
select employee_id, first_name, department_id, department_name
from employees A, departments B
where A.department_id = B.department_id;
--  select절에 테이블 이름을 붙인 컬럼명을 기술해서 조회 해야함.(테이블명대신 별칭사용가능) 
select A.employee_id, A.first_name, A.department_id, B.department_name
from employees A, departments B
where A.department_id = B.department_id;
-- select 절에는 출력한 열 이름을 기술.
-- from 절에는 접근하려는 테이블 이름 기술
-- where 절에는 조인의 조건을 기술
-- from 절 외에는 조회의 명확성을 위해서 열 이름 앞에 테이블 이름을 붙인다
select A.employee_id, A.first_name, A.department_id, B.department_name
from employees A, departments B
where A.department_id = B.department_id and A.employee_id=124;
-- Q. shipping 부서에서 일하는 사원의 이름과 입사일을  출력해보세요 
select A.first_name, A.last_name, A.hire_date
from employees A, departments B
where A.department_id = B.department_id and lower(B.department_name) = 'shipping'; 
-- Q. sales 부서에서 일하는 사원 수 
-- select count(*) from employees where department_id = 50; 
select count(*) 
from employees A, departments B
where A.department_id = B.department_id and lower(B.department_name) = 'sales';
-- Q. location_id 가 1800인 사원의 이름과 급여 
select employees.first_name, employees.last_name, employees.salary
from employees A, departments B
where A.department_id = B.department_id and B.location_id = 1800;
-- Q. 최고 매니져의 이름 부서명, job_id를 출력하세요 - 본인 위에 매니져가 없는 사람이 한사람 존재함. 
-- manager_id는 매니져(상관)의 아이디 넘버를 알려줌 . 
select A.first_name, A.last_name, A.job_id, B.department_name
from employees A, departments B
where A.department_id = B.department_id and A.manager_id is null; 

-- 비동등 조인 non-equal join 
-- 조인 조건절에 사용되어지는 컬럼의 값이 같다 같지 않다가 아니라 
-- 특정 범위에 속할때 사용되어지는 조인이다. 
-- 만약, 급여를 등급으로 나눈다면 
select employee_id, first_name, salary,
    case 
        when salary >=10001 then 5
        when salary >=8001 then 4
        when salary >=5001 then 3
        when salary >=3001 then 2
        when salary >=2000 then 1
    end as 등급
from employees order by employee_id;   

create table salary_grade
(   
    grade number(1),
    low_salary number(5),
    high_salary number(5)
);
insert into salary_grade values(1,2000,3000);
insert into salary_grade values(2,3001,5000);
insert into salary_grade values(3,5001,8000);
insert into salary_grade values(4,8001,10000);
insert into salary_grade values(5,10001, 30000);
commit;
select * from salary_grade;

select A.employee_id, A.first_name, A.salary, B.grade
from  employees A, salary_grade B
where A.salary between B.low_salary and B.high_salary
order by A.employee_id;

select * from students;
-- Q. 비동등 조인을 사용해서 평균점수가
-- 100-95 A+ 94-90 A, 89-85 B+, 84-80 B, 0-79 C 학점으로 표현해보세요
-- stu_grade라는 테이블을 만들면되겟죠 .. 
create table stu_grade
(
    grade varchar2(3) ,
    low_score number(5),
    high_score number(5)
);
insert into stu_grade values ('A+', 95, 100);
insert into stu_grade values ('A', 90, 94);
insert into stu_grade values ('B+', 85, 89);
insert into stu_grade values ('B', 80, 84);
insert into stu_grade values ('C', 0, 79);
commit; 
select * from stu_grade; 
-- stu_grade와 students 테이블의 비동등 조인 
select a.stuid, a.stuname, a.avg, b.grade
from students A, stu_grade B
where a.avg between b.low_score and b.high_score
order by a.stuid;


-- self join : 하나의 테이블 내에서 조인을 해야만 원하는 자료를 얻을 수 있는 경우 사용. 
-- 1개의 테이블 x에 가상으로 x1,x2라는 별칭을 부여해서 2개의 테이블로 간주 한 다음 join 
/*  select 별명1.열이름1, [ 별명2.열이름2, ....]
     from 테이블이름 별명1, 테이블이름 별명2 
     where 별명1.열이름1 = 별명2.열이름2  */
select a.last_name || '의 관리자는 ' || b.last_name || '입니다' 
from employees a, employees b
where a.manager_id = b.employee_id; 

-- 124번 직원의 매니져의 이름을 알고싶다. 
select manager_id from employees  where employee_id = 124;   -- 100 이라는 결과 
select first_name || ' ' || last_name from employees where employee_id = 100; 

-- 각 사원을 관리하는 상사의 이름을 검색 
select e1.employee_id 사원번호, e1.first_name 사원이름 ,
         e1.manager_id 상사번호,  e2.employee_id 상사사원번호, e2.first_name 상사이름 
from employees e1, employees e2
where e1.manager_id = e2.employee_id(+)
order by e1.employee_id;
-- where a.department_id = b.department_id -- inner join

-- Q1. 상사가 first_name : Steven인 사원들의 이름과 직급(job_id) 을 출력해보세요 
select e1.employee_id 사원번호, e1.first_name 사원이름 , e1.job_id 직급, e2.first_name 상사이름 
from employees e1, employees e2
where e1.manager_id = e2.employee_id(+) and lower(e2.first_name) = 'steven'
order by e1.employee_id;
-- Q2. Adam 과 동일한 부서(department_id)에서 근무하는 사원의 이름을 출력
-- select department_id from employees where lower(first_name)='adam';  -- 50번부서 
-- select first_name from employees where department_id = 50;
select e1.first_name, e1.last_name, e1.department_id
from employees e1, employees e2
where e1.department_id = e2.department_id and lower(e2.first_name)='adam'
order by e1.employee_id; 

-- Outer join  : 데이터가 일치하지 않아도 데이터를 출력해야할때 사용 
/*
select 테이블이름1.열이름1, [테이블이름2.열이름2......]
from 테이블이름1, 테이블이름2
where 테이블이름1.열이름1 = 테이블이름2.열이름2(+) ; 
      (+) : 외부조인. 데이터가 부족한 테이블 끝에 기술함. 
이너조인 조건을 만족하지 못해 누락되는 행을 출력하기위해 사용. (+) 기호를 사용함.
(+) 기호는 조인할 행이 없는, 즉. 데이터값이 부족한 테이블의 열 이름뒤에 기술함. 
(+) 기호는 한쪽에만 기술 할 수 있음. 
(+) 를 붙이면 부족한 테이블에 null 값을 갖는 행이 생성됨. 
(+) 기호가 왼쪽에 있으면 left outer join 
(+) 기호가 오른쪽에 있으면 right outer join */
select * from employees where employee_id = 178; -- department_id 가 null인 사람. 
-- 이너조인을 할 경우 
select * from employees A, departments B 
where A.department_id=B.department_id and employee_id = 178;
-- 결과가 출력되지 않는다
-- 아우터 조인(+) 을 하게된다면 null이 생성되면서 결과를 출력하는 것을 확인할 수 있다. 
select * from employees A, departments B 
where A.department_id=B.department_id(+) and employee_id = 178;

-- Q. 매니저가 없는 사람을 아웃터조인으로 정보 전체를 출력해보세요 .
-- id=100 인사람을 아웃터 조인해서 보여주세요.  self join (employee)  outer버전 . 
-- manager_id = emp_id self 조인 한것을 그냥 출력을해보고 >  id=100
select * 
from employees A, employees B 
where A.manager_id = B.employee_id(+)  and a.employee_id = 100;

-------------------------------------------------------------------------------------
-- ANSI join 국제표준 조인 방법 

-- 기존 조인 
SELECT     e.employee_id,     d.department_name
FROM      employees    e,     departments  d
WHERE    e.department_id = d.department_id;
-- ansi 조인은 from 다음에 inner join 이라는 단어를 사용해 조인할 테이블을 명시하고
-- on 절을 사용해서 조인조건을 명시한다.
SELECT     e.employee_id,     d.department_name
FROM      employees e    INNER JOIN   departments d 
ON          e.department_id = d.department_id;

SELECT     e.employee_id,     d.department_name
FROM      employees    e,     departments  d
WHERE    e.department_id = d.department_id and e.employee_id =127;

SELECT     e.employee_id,     d.department_name
FROM      employees e    INNER JOIN   departments d 
ON          e.department_id = d.department_id
where      e.employee_id =127;

-- using을 이용해 조인조건 지정. using 안에 공통 컬럼을 넣으면됨. 
SELECT     e.employee_id,     d.department_name
FROM      employees e    INNER JOIN   departments d 
USING     ( department_id ) 
where      e.employee_id =127;


-- Natural join  - 두테이블이 가지는 공통된 컬럼에 대해 inner join은 별개의 컬럼으로 나타나지만
-- natural join은 하나의 컬럼으로 나타남 
SELECT   *  from  employees e, departments d 
where e.department_id = d.department_id;
select * from employees natural join departments;

-- Outer join - left, right, full ( full = left+right )
select e.employee_id, e.first_name, d.department_name
from employees e right outer join departments d
using (department_id); 

select e.employee_id, e.first_name, d.department_name
from employees e left outer join departments d
using (department_id)
where employee_id=178; 


select * 
from employees A, departments B 
where A.department_id = B.department_id(+)  and employee_id = 178;
--             null                    ? 없음 


select e1.employee_id 사원번호, e1.first_name 사원이름 ,
         e1.manager_id 상사번호,  e2.employee_id 상사사원번호, e2.first_name 상사이름 
from employees e1, employees e2
where e1.manager_id       =         e2.employee_id(+)
-- steven의 manager_id = null          employee_id가 null인사람은 존재하지 않음. 
order by e1.employee_id;

