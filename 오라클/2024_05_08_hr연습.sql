
-- 한줄 주석은 빼기빼기 
/*
    여러줄 주석은 / *   * / 사이에 입력하시면됩니다. 
    control + enter :         현재 명령어만 실행 
    f9 :                           현재 명령어만 실행 
    삼각형 작은 초록버튼 : 현재명령어만 실행 
    
    f5 , 네모안에 초록삼각형버튼 : 스크립트 전체 실행 
  
    contro + /     :  주석처리 단축어 
    
    DESC 테이블이름;    --  테이블 구성요소를 보여준다. 
    
*/
/*
SELECT 필드이름  FROM 테이블이름 [WHERE 조건] ;

SELECT * FROM 테이블이름; 
: 테이블의 모든 필드를 선택해서 보여줘라 . 
*/
DESC JOBS;
DESC EMPLOYEES;
select * from employees; 

SELECT EMPLOYEE_ID, FIRST_NAME,  LAST_NAME FROM EMPLOYEES; 
-- SELECT 필드이름 FROM 테이블이름 ; 

SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID=100; 
-- WHERE 조건절 
-- 조건절에는 여러개의 조건을 명시할 수 있다. AND/OR 연산자를 이용해서 연결함 

SELECT * FROM EMPLOYEES WHERE SALARY >10000 AND EMPLOYEE_ID<200;  

SELECT DISTINCT DEPARTMENT_ID FROM EMPLOYEES;
--만약 필드에 중복되는 값을 가지는 레코드가 있다면  DISTINCT 키워드를 사용해서 
--그 값이 한번만 선택되도록 설정 . 

-- 정렬 
SELECT * FROM EMPLOYEES ORDER BY EMPLOYEE_ID DESC;
/*
ORDER BY 컬럼명 
정렬 ASC (오름차순)
역순정렬 DESC (내림차순)

샐러리(SALARY) 순으로정렬을 해보세요 
높은사람부터 낮은사람으로 출력이되게 .. */


-- EMPLOYEES 테이블에서, 아이디, FIRST_NAME, LAST_NAME, 샐러리를 출력해보세요 
-- SELECT * FROM 테이블이름 -- 모든 컬럼을 출력하는 명령어 
-- SELECT 출력하고자하는컬럼이름들 FROM 테이블이름 ; 
-- SELECT 컬럼1, 컬럼2,... , 컬럼N FROM 테이블이름;  -- 특정필드만 선택해 출력하는 명령어 
DESC EMPLOYEES;  -- 테이블의 구성요소를 보여주는 명령어 
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, SALARY FROM EMPLOYEES; 
-- DEPARTMENTS 테이블에서 모든요소를 출력해보세요
SELECT * FROM DEPARTMENTS; 
--  LOCATIONS 테이블에서 로케이션 아이디, 시티 를 출력해보세요
DESC LOCATIONS;
SELECT LOCATION_ID, CITY FROM LOCATIONS;

-- 추가적으로 WHERE 절 조건문 . 
SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID=100;
-- 아이디가 100인사람의 모든 정보를 임플로이즈 테이블에서 가져와라 

SELECT * FROM EMPLOYEES;
--1. 샐러리가 5000 이하인 사람들의 모든 필드 가져오기
SELECT * FROM EMPLOYEES WHERE SALARY <= 5000; 
-- 2. 아이디가 200 이상인 사람들의 아이디, FIRST_NAME, LAST_NAME, 가져오기
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME FROM EMPLOYEES WHERE EMPLOYEE_ID >= 200;
-- 3. 매니져 아이디가 108 인 사람의 전체 정보를 가져오기 
SELECT * FROM EMPLOYEES WHERE MANAGER_ID = 108;
-- 4. JOB_ID 가 PU_CLERK  이고 샐러리가 3000 이상인 사람 가져오기  '문자열' , 1234
SELECT * FROM EMPLOYEES WHERE JOB_ID='PU_CLERK' AND SALARY >=3000;

-- 중복제거 DISTINCT 
SELECT DISTINCT DEPARTMENT_ID FROM EMPLOYEES;
-- 매니져 아이디의 중복을 제거 해서 출력해보세요 
SELECT DISTINCT MANAGER_ID FROM EMPLOYEES;

--SELECT 필드명 FROM 테이블명 WHERE 조건절 ORDER BY 필드명 
SELECT * FROM EMPLOYEES WHERE SALARY <= 5000 ORDER BY SALARY; 
-- 샐러리가 낮은것부터 높은 순으로 보여줌 

SELECT * FROM EMPLOYEES WHERE SALARY <= 5000 ORDER BY SALARY DESC; 
-- 샐러리가 높은순에서 낮은순으로 보여준다. 

-- 매니져 아이디가 108 인 사람의 전체 정보를 가져오는데 샐러리가 높은애부터 낮은애로 출력을 해보세요
SELECT * FROM EMPLOYEES WHERE MANAGER_ID = 108 ORDER BY SALARY DESC;

-- 샐러리가 3000부터 8000인 사람을 가져오는데 매니져 아이디 순으로 정렬해서 가져오세요
SELECT * FROM EMPLOYEES WHERE  3000<=SALARY AND SALARY<=8000 ORDER BY MANAGER_ID;
-- BETWEEN A AND B을 사용할 수 있다. (A와 B 사이의 값)
SELECT * FROM EMPLOYEES WHERE  SALARY BETWEEN 3000 AND 8000 ORDER BY MANAGER_ID;


SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, PHONE_NUMBER FROM EMPLOYEES;

-- 별칭을 부여할 수 있다. AS 로 부여함. 필드 이름을 좀더 읽기 쉽도록 만들어준다. 
SELECT EMPLOYEE_ID AS ID , FIRST_NAME, LAST_NAME, PHONE_NUMBER AS PHONE FROM EMPLOYEES;

SELECT EMPLOYEE_ID AS ID , CONCAT(FIRST_NAME, LAST_NAME)  AS NAME , PHONE_NUMBER AS PHONE FROM EMPLOYEES;

SELECT * FROM EMPLOYEES;




select * from tab;  -- 사용자가 소유한 테이블의 정보를 알려줌

-- empolyees table 
desc employees;
--사원의 급여(salary)와 입사일자만을 출력하는 sql문작성 
-- SALARY, HIRE_DATE
select SALARY, HIRE_DATE from employees;

--사원아이디, 이름(first_name), 입사일자, salary(월급), 월급/4(주급), 월급*12(연봉)을 출력하는 sql문을 작성해보세요 
-- EMPLOYEE_ID,  FIRST_NAME, HIRE_DATE, SALARY

select EMPLOYEE_ID,  FIRST_NAME, HIRE_DATE, SALARY, SALARY/4 , SALARY*12
from employees;

-- 사원아이디, 이름, 월급*12, commission_pct, 월급*12+commission_pct을 출력하는 sql문을 작성해보세요 
select EMPLOYEE_ID, FIRST_NAME, SALARY*12, commission_pct, SALARY*12+commission_pct
from employees;

-- nvl (값, 지정값)  null 값이 들어있을때, 어떻게 할지

select EMPLOYEE_ID, nvl(commission_pct,0)
from employees;

select EMPLOYEE_ID, FIRST_NAME, SALARY*12, commission_pct, SALARY*12+nvl(commission_pct,0)
from employees;

--1. 사번, 이름 (first_name), 이메일, 전화번호, 입사일을  별칭을 사용해서 출력해보세요 
desc employees;
select EMPLOYEE_ID as "사번", FIRST_NAME as 이름, EMAIL as 이메일
, PHONE_NUMBER as 전화번호, HIRE_DATE as 입사일
from employees; 

-- 2. 부서번호, 부서명 별칭을 사용해서 출력하세요 
desc departments;
select DEPARTMENT_ID as 부서번호, DEPARTMENT_NAME as 부서명
from departments; 
-- 3. 급여가 6000인 경우를 출력 
select * from employees where salary = 6000; 
-- 4. 급여가 4000 이상만 출력    - 입사순 정렬 
select * from employees where salary >= 4000 order by hire_date ;
-- 5. 급여가 4000 이하인 사원의 사원번호, 사원이름,  급여를 출력하는 sql문을 작성하세요 ++ 별칭 사용해서 출력
-- 급여순 정렬
select EMPLOYEE_ID as "사번", FIRST_NAME as 이름, salary as  급여
from employees where salary >= 4000 order by 급여 desc;

-- first_name 의 직급은 job_id 
-- 컬럼과 컬럼을 하나의 문장처럼 보이게 해줌
select first_name || '의 직급 : ' || job_id  as 이름직급 from employees;
select concat(first_name, job_id) from employees;


-- 사번, first_name last_name을 합쳐서 이름이라는 별칭 , 샐러리 를 출력 
select EMPLOYEE_ID ,  first_name || '  ' || last_name as 이름, salary
from employees;
-- 사원 아이디 이름, 급여를 출력하는 sql문 아이디가 100 이상이며 급여가 4000 이상인 
-- 급여가 높은순에서 낮은순으로 출력
select EMPLOYEE_ID , salary from employees
where EMPLOYEE_ID >=100 and salary >=4000;

-- 급여가 8000이며 job_id가 SA_REP 인 사람 출력
select * from employees 
where job_id='SA_REP' and salary = 8000;
-- 급여가 8000 이거나 6000 인사람들 출력 
select * from employees 
where salary = 8000 or salary = 6000;

