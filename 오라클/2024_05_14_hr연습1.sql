/*
제약조건 
not null           -   빈공백을 허용하지 않음. null도 입력할 수 없음. 
unique            -  유일해야함
primary key     - not null + unique , 테이블당1개만 존재할 수 잇음. 
foreign key      - 다른테이블의 열을 참조하기때문에 부모테이블에 존재하는 값만 입력할 수 있음. 
check              - 설정한 조건을 만족하는데이터만 입력이 가능 
default             - 입력을 하지 않았을때 디폴트로 입력되는 값 
*/
-- 제약조건을 확인하는 방법 
select * from user_constraints;
-- constraint_name, constraint_type, table_name 
-- 조건을 사용해서 원하는 테이블 검색 where table_name='테이블이름' ;
select * from user_constraints where lower(table_name)='employees';
-- constraint_type >   C : not null, check      P: primary key     U: unique      R: foreign key

-- 부모테이블, 즉 참조가 될 테이블 생성
create table parentTable 
(
    parentID  number(3) primary key
);
-- 자식 테이블, 외래키를 가지고 있는 테이블 생성 
create table childTable
(
    cid number(3) constraint child_cid_p primary key, 
    cname varchar2(20),
    cpw varchar2(20),
    parentID number(3),
    constraint ct_pid_fk foreign key(parentID) references parentTable(parentID) on delete set null
    --                                                                                                      on delete cascade
);
/*방법1. 
create table 테이블이름
(
    이름 자료형 constratint 제약조건이름 references 참조테이블(참조할열)
); 
방법2.
create table 테이블이름
(
    이름 자료형, 
    constraint 제약조건이름 foreign key (열이름) references 참조테이블 참조열 
);*/

insert into childTable (cid, cname) values( c_seq.nextval, '홍길동');
commit;
select * from childtable;
select c_seq.currval from dual;   -- 시퀀스의 현재 값 확인하는 방법 

-- 제약조건 추가하기. 
alter table childTable modify (cname unique, cpw not null);
-- 기존에 데이터가 존재할때, 
-- 제약조건을 추가하려면, 모든 열의값이 제약조건을 만족해야함
update childTable set cpw='1234' where cid=1;
commit;
-- 값을 넣어주고 다시 제약조건을 추가해주면 성공. 
alter table childTable modify (cname unique, cpw not null);
-- 제약조건확인
select constraint_name, constraint_type from user_constraints 
where lower(table_name) = 'childtable';
--  SYS_C007472 : c(not null)   , SYS_C007473 : u(unique)

-- 제약조건 삭제하기 unique로 설정된 제약조건을 삭제해 보자. 
alter table childTable drop constraint SYS_C007473;
-- 제약조건확인
select constraint_name, constraint_type from user_constraints 
where lower(table_name) = 'childtable';
--이미생성된 제약조건의 이름을 변경해보자 . 
alter table childTable rename constraint SYS_C007472 to ct_cpw_nn; 
-- 제약조건확인
select constraint_name, constraint_type from user_constraints 
where lower(table_name) = 'childtable';

/*
foreign key 
외래키, 외부키, 참조키, 외부식별자로 불리며 흔히 FK라고 한다. 
FK가 정의된 테이블을 자식테이블이라고 칭한다. 
참조되는 테이블, 즉 PK가 있는 테이블을 부모테이블이라고한다. 
부모테이블의 PK컬럼에 존재하는데이터만 자식테이블에 입력할 수 있다. 
부모테이블은 자식테이블에서 데이터가 삭제 수정이 되어도 영향을 받지 않는다.
참조하는 데이터 컬럼은 데이터 타입이 반드시 일치해야한다. 
참조할 수 있는 컬럼은 PK(기본키)나 unique만 가능. 보통 PK를 사용함. 
constraint [제약조건명] foreign key (컬럼명) references 참조할테이블명(참조컬럼)
  [ on delete cascade   /   on delete set null ]
*/
desc childTable; -- CID, CNAME, CPW, PARENTID
-- 부모테이블에 1이라는 데이터가 없는 상태임. 
insert into childTable values(c_seq.nextval, '유관순','1111' , 1);
-- 때문에 무결성 제약조건 위배로 데이터를 입력할 수 없음. 

-- 부모테이블에 데이터 넣기. 
insert into parenttable values(1);
insert into parenttable values(2);
insert into parenttable values(3);
commit;
select * from parenttable;
-- 다시 자식테이블에 데이터 넣기
insert into childTable values(c_seq.nextval, '유관순','1111' , 1);
select * from childtable;
INSERT INTO childtable VALUES (  c_seq.NEXTVAL, '강감찬',  '1111',   2 );
insert into childTable values(c_seq.nextval, '김구','1111' , 3);
-- 자식테이블 자료 삭제하기.  
delete from childTable where cid=3;
-- 자식테이블은 부모테이블과 상관이 없기 때문에 삭제에 자유롭다. 
commit;
select * from childtable;
-- 부모테이블에서 자료 삭제하기 
delete from parenttable where parentid = 3;
-- 미리 설정해 놓은 on delete set null 이라는 조건때문에 
-- 삭제한 부모키에 해당하는 값(즉, parentid가 3인값) 은 null 로 바뀐다. 

create table c2table
(
    cid number(3) primary key, 
    cname varchar2(20),
    cpw varchar2(20),
    parentID number(3),
    constraint c2_pid_fk foreign key(parentID) references parentTable(parentID) on delete cascade
);
CREATE TABLE c3table (
    cid       NUMBER(3) PRIMARY KEY,
    cname     VARCHAR2(20),
    cpw       VARCHAR2(20),
    parentid  NUMBER(3),
    CONSTRAINT c3_pid_fk FOREIGN KEY ( parentid )
        REFERENCES parenttable ( parentid )
);

-- childTable : on delete set null
-- c2table : on delete cascade
-- c3table 아무런 제약조건이 없음 

select * from parenttable;

insert into parenttable values(3);
insert into parenttable values(4);

insert into c2table values(1, '홍길동','1111' , 1);
insert into c2table values(2, '유관순','2222' , 2);
insert into c2table values(3, '김구','3333' , 3);
insert into c2table values(4, '강감찬','4444' ,4);
commit;
insert into c3table values(1, '홍길동','1111' , 1);
insert into c3table values(2, '유관순','2222' , 2);
insert into c3table values(3, '김구','3333' , 3);

select * from c2table; 
select * from c3table;

-- on delete cascade 조건에 의해서 부모테이블에서 자료를 삭제하면 
-- 자식테이블이 그 값을 가지고 있을때 같이 삭제됨. 
delete from parenttable where parentid = 4;
commit; 
SELECT    *   FROM      parenttable;
SELECT    *   FROM      c2table; 


-- c3table
-- 무결성 제약조건(HR.C3_PID_FK)이 위배되었습니다- 자식 레코드가 발견되었습니다
delete from parenttable where parentid = 3;


-- 데이터의 형태와 범위를 정하는 check 
-- check 제약조건은 열에 저장할 수 있는 값의 범위 또는 패턴을 정의할 때 사용함 
create TABLE ctable
(
    cid number(3) primary key, 
    cname varchar2(20),
    cpw varchar2( 20 ) constraint c_pw_ck check(length(cpw)>3),
    cgender varchar2(1) constraint c_gen_ck check(cgender in ('M','m','F','f')),
    salary number(10) constraint c_sal_ck check(salary between 1000 and 100000),
    cdate date default sysdate
);

insert into ctable (cid, cname, cpw) values (1,'aaa','123');
-- 체크 제약조건(HR.C_PW_CK)이 위배되었습니다
insert into ctable (cid, cname, cpw) values (1,'aaa','1234');
insert into ctable (cid, cname, cgender) values (2,'bbb','male'); --male이라는 단어가 3글자 이상이라 오류
insert into ctable (cid, cname, cgender) values (2,'bbb','a');  -- m,M,f,F 가아니라서 오류
insert into ctable (cid, cname, cgender) values (2,'bbb','m'); 
insert into ctable (cid, cname, salary) values (3,'ccc',500);  -- 체크 제약조건(HR.C_SAL_CK)이 위배되었습니다
insert into ctable (cid, cname, salary) values (3,'ccc',50000); 
-- 기본 값으로 설정하는 default 
-- 특정열에 저장할 값이 입력이 되지 않을경우 디폴트를 사용해서 자동입력이 가능하다. 
-- 디폴트 추가하는 방법 :
alter table ctable add( chit number(3) default 1 ); 
insert into ctable (cid) values(4);
commit;
select * from ctable; 
-- 디폴트 삭제하는 방법 : -> 디폴트되는 값을 null로 변경하면된다. 
alter table ctable modify chit default null; 
insert into ctable (cid) values(5);
commit;
select * from ctable; 
-- 제약 조건의 비 활성화 
/*
제약조건은 데이터의 무결성을 보장하는데 중요한 역할을 함. 
그러나... 신규개발이나 기능테스트를 위해서 걸림돌이됨... 
때문에 제약조건을 비활성화 하고 다시 활성화 시킬 수 있다. 
alter table 테이블명 disable validate/novalidate constraint 제약조건이름;
alter table 테이블명 enable validate/novalidate constraint 제약조건이름;
novalidate 가 기본값. 
validate : 데이터가 변경이 안되게하는 옵션- readonly.. -insert, update, delete작업을 할 수 없음 
*/
select constraint_name, constraint_type from user_constraints where lower(table_name)='ctable';
-- C_GEN_CK, C_PW_CK 
-- gender에 있는 check 조건을 disable 시킨다. 
alter table ctable disable novalidate constraint c_gen_ck;
-- 때문에 m,M,f,F가 아닌 글자가 입력이 가능해진다. 그러나 varchar2(1) 로 지정햇기때문에 1글자만.
insert into ctable(cid, cgender) values (6, 'a'); 
-- Q . pw의 제약조건을비활성화 시키고 cid: 7, cname: 'eee', cpw: '11' 이라는 정보를 입력해보세요
alter table ctable disable constraint C_PW_CK;
insert into ctable(cid, cname, cpw) values(7,'eee','11');
commit;
select * from ctable;

-- 활성화 시키기. 
alter table ctable enable novalidate constraint C_PW_CK;
insert into ctable(cid, cname, cpw) values(8,'kkk','11');  
-- 제약조건에 위배가되어서 입력할 수 없음. 

-- 테이블 삭제 : emp2, emp3, stu2 지우기 
-- drop table stu2;
-- 테이블 복제하기. 
-- 1. 데이터 타입만 복제하기 
create table e1 as select * from employees where 1=2; 
select * from e1;
desc e1;
-- 2. 데이터까지 전체 복사하기 
create table e2 as select * from employees; 
select * from e2; 
-- 제약조건은 복사가되지 않는다. 

-- 3. 테이블을 복사해 오는데 내가 원하는 컬럼만 가지고 오고싶을 경우는 .. ?? 
create table emp as 
select employee_id, first_name || ' ' || last_name as name, 
        hire_date, department_id, salary, job_id 
from employees; 
select * from emp;

select * from students;
-- Q1. 아이디, 이름, 학년, 총점 을 복제 , 홀수 번호를 가진학생만 복제해서 stu라는 테이블 생성
--     mod(  m  ,  n   ) 은    m을n으로 나누었을때 나머지를 반환한다.
create table stu as 
select stuid, stuname, grade, total from students where mod(stuid,2)=1 order by stuid;

select * from stu; 
-- Q2. 아이디, 이름, 총점을 복제.  1학년 학생만 복제해서 stu1이라는 테이블을 생성하세요
create table stu1 as
select stuid, stuname, total from students where grade=1; 
select * from stu1;
-- 복제해온 테이블은 제약조건은 복제하지 않는다. 
select * from emp;
desc emp;
-- hint는. 없는 컬럼을 제약조건을 추가하면서 넣고싶으면 alter table 테이블명 add ()
--           있는 컬럼에서 제약조건을 추가하고싶으면 alter table 테이블이름 modify ()
-- Q1. employee_id를 기본키(프라이머리키)로 만들기 
alter table emp modify(EMPLOYEE_ID  primary key );
-- Q2. name을 not null 제약조건 추가하기   NAME
alter table emp modify ( name not null);
-- Q3. hire_date 에 디폴트로 sysdate 추가하기   HIRE_DATE
alter table emp modify (HIRE_DATE default sysdate);
-- Q4. 급여가 1000이상만 입력이 가능하게 조건 추가하기. SALARY
alter table emp modify ( SALARY constraint emp_sal_ck check (salary >1000) );
-- Q5. department_id에 fk조건 추가해보기 DEPARTMENT_ID
alter table emp modify( DEPARTMENT_ID constraint emp_dep_fk 
    references departments(department_id) ); 
select * from user_constraints where lower(table_name) = 'emp'; -- 전체제약조건 확인 
-- job_id default값넣기 SH_CLERK 넣기 . 
alter table emp modify (job_id default 'SH_CLERK');
insert into emp (employee_id, name) values (300,null); -- name은 not null 조건이 있어서 오류. 
insert into emp (employee_id, name, salary) values (300,'홍길동', 2000 ); 
insert into emp (employee_id, name, department_id) values (301,'유관순', 10 ); 
select * from emp order by employee_id desc;
commit;