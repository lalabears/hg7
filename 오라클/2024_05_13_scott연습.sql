-- data manipulation language 
-- dml 데이터 조작어 select, insert, update, delete 
-- commit이 필요함. 
-- 테이블 생성하기 
create table sample_product
(
    product_id number(10),
    product_name varchar2(30),
    manu_date date 
);
-- insert 테이블에 새로운 행 삽입 
-- insert into 테이블이름 [(컬럼명1,..) ] values(데이터값1, ..)
insert into sample_product values (1, 'television', to_date('240401','yymmdd'));
insert into sample_product values (2, 'washer', to_date('230101','yymmdd'));
insert into sample_product values(3, 'cleaner', to_date('240101','yymmdd')); 
commit ; --확정, 저장
-- update : 기존의 데이터를 다른값으로 변경할때 사용 
-- update 테이블명 set 열이름=값, ... where 조건식 
update sample_product set product_name = 'tv' where product_id=1; 
-- Q1. washer의 제조일자를 22년6월1일로 변경해보세요
update sample_product set manu_date = to_date('220601','yymmdd') where product_id=2;
-- Q2. cleaner -> radio로 바꾸고 제조일자를 230101로바꿔보세요 
update sample_product set product_name='radio', manu_date=to_date('230101','yymmdd')
where product_id = 3; 
-- delete from 테이블이름 where 조건식 
-- where절이하를 생략하면 다 삭제가되므로 조심해서 사용해야함. 
delete from sample_product where product_id =1 ; 

-- data definition language 
-- ddl 데이터 정의어 : 테이블과 관련된 열을 생성하고 변경하고 삭제하는 명령어 
-- create, alter, drop, rename, truncate 

-- 테이블에 열 추가하기 
-- alter table 테이블이름 add (열이름1 열타입... ) ; 
-- sample_product 테이블에 factory varchar2(10) 이라는 열을 추가 
alter table sample_product add (factory varchar2(10)); 
-- 테이블에 이미 행들이 존재한다면, 열을 추가했을때 새로운 열의 데이터는 null로 초기화. 

-- 프라이머리키 추가하기 
alter table sample_product add primary key (product_id) ; 
-- 프라이머리키 삭제
alter table sample_product drop primary key;

-- 테이블의 열을 수정하기 
-- alter table 테이블이름 modify(열이름1 데이터타입,...., 열이름n 데이터타입);
-- 데이터타입이랑 자리숫를 수정함. default값도 수정할 수 있음. 

-- factory를 숫자로 변경하기 
alter table sample_product modify (factory number(10)); 

-- 테이블 열 이름 바꾸기 
-- alter table 테이블명 rename column 열이름 to 바꾸려는열이름
alter table sample_product rename column factory to factorynum; 

-- 테이블 열 삭제하기 
-- alter table 테이블이름 drop column 열이름 
alter table sample_product drop column factorynum; 

-- 테이블 내용삭제하기 
-- truncate table 테이블이름;
-- 테이블의 모든데이터가 삭제되지만 구조는삭제되지 않는다. 
truncate table sample_product;

-- 테이블삭제하기
drop table sample_product;

desc sample_product;
select * from sample_product;

/*
제약조건. 
not null - 중복 허용, null은 허용하지 않음 
unique  - 지정한 열은 유일한 값들을 가져야함. 
primary key  - notnull + unique , 테이블당 한개만존재 - seqence테이블을 많이 사용함. 
foreign key - 다른테이블의 열을 참조해 존재하는 값만 입력할 수 있음. 
check - 설정한 조건을 만족하는 데이터만 입력이 가능 

데이터의 무결성 :
데이터베이스에 저장되는 데이터의 정확성과 일관성을 보장해야한다는 의미 
무결성을 지키기 위해서 안전장치로 제약조건을 사용함(insert, update, delete 사용할때 지켜야함)

영역 무결성 : 열에 저장되는 값의 적정 여부를 확인 .즉, null여부나 check범위 만족 
객체 무결성 : 테이블 데이터를 유일하게 식별할 수 잇는 기본키(primarykey)는 반드시 값을 가져야함. 
참조 무결성 : 참조테이블의 외래키(foreignkey) 값은 참조테이블의 기본키로 존재 . 널 가능 
*/

-- 가지고 있는 테이블의 제약조건을 확인할 수 있다. 
select owner, constraint_name, constraint_type, table_name from user_constraints;
-- owner : 소유계정, 
-- constraint_name : 제약조건의 이름 , 만약에 지정하지 않았을 경우 오라클이 자동으로 만들어줌 
-- constraint_type: c (not null, check, foreignkey) , u (unique), p (primary key), f (foreign key) 
-- 알고싶은 테이블의 제약조건을 출력하고자 할때 where table_name='테이블이름'
select * from user_constraints where table_name='ADDRESS';

-- 제약조건에 이름을 지정하기 
create table tuser
(   
    id number(3)         constraint tuser_id_pk  primary key,
    pw varchar2(20)     constraint tuser_pw_p  not null,
    name varchar2(20) 
);
-- select owner, constraint_name, constraint_type, table_name from user_constraints where table_name='TUSER';

insert into tuser(id, pw) values(1,'1234');
commit;
select * from tuser;
-- 테이블에 값들이 들어 있는 상태에서. (이미생성된 테이블에) 제약조건을 지정 
alter table tuser modify (name not null); 
-- 테이블 열중에 널값이 이미 존재하기때문에 실행이 불가능함. 
-- 때문에 널이 존재하는 부분에 다시 값을 넣고 
update tuser set name='홍길동' where id=1;
commit; 
-- 제약조건을 지정하면 실행되는 것을 알 수 있다. 
alter table tuser modify (name not null); 
desc tuser;

select owner, constraint_name, constraint_type, table_name from user_constraints 
where table_name='TUSER';
-- 제약조건의 이름을 변경하고싶은 경우 
-- 1. 이름 조회 후 삭제 > alter table테이블명 modify로 다시만들기
alter table tuser drop constraint SYS_C007447; 
alter table tuser modify (name constraint tuser_name_nn not null); 
-- 2. 이름을 조회후 이름 변경.  TUSER_PW_P 
alter table tuser rename constraint tuser_pw_p to tuser_pw_nn; 

-- foreign key : 다른테이블과 관계를 맺는 키 (외래키, 외부키) 
-- 특정 테이블에서 pk 제약조건으로 지정한 열을 다른테이블의 특정 열에서 참조하겠다는 의미 
-- 예)
-- employees 테이블 - departments 테이블이 서로 관계를 가지고 있음. 
-- department_id(fk)    -   department_id (pk)
-- employee테이블과 department테이블이  외래키로 연결이 되어있다는 것을 알 수 있다
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
-- tuser테이블에서 fk사용을 위해 만든테이블. 
create table tuser_fk 
(   
    depno number(3) constraint tuser_fk_dno_pk primary key,
    depname varchar2(20)
);
desc tuser;  --id, pw, name 
-- depno : 컬럼을 추가하면서 얘를 fk만들어보자 . 
alter table tuser add (depno CONSTRAINT tuser_depfk REFERENCES tuser_fk(depno));

desc tuser;

select * from user_constraints where table_name='TUSER';
-- fk로지정된 테이블에 데이터가 없는 상태에서 ( tuser_fk 라는 테이블은 데이터가없음)
select * from tuser;
-- 참조되는 값이 없기때문에 오류를 생성한다. 
-- insert into tuser values(2, '1111','유관순', 1);

-- 참조되는 테이블에 데이터 넣기. 
insert into tuser_fk values(1,'admin');
insert into tuser_fk values(2,'hr'); 
insert into tuser_fk values(3, 'it');
commit;

select * from tuser_fk;

insert into tuser values(2, '1111','유관순', 1);
-- insert into tuser values(3, '2222','김구', 7);
select * from tuser;
-- 참조행 데이터 삭제하기. 
delete from tuser_fk where depno=1; 
--참조되어있는 데이터가 존재하기 때문에 삭제시 오류가 생긴다. 
/*
데이터를 삭제하려면
1. 현재 삭제하려는 열 값을 참조하는 데이터를 먼저 삭제한다. 
    tuser에 있는 depno가 1인 값을 먼저 삭제한다. 
2.  현재 삭제하려는 열값을 참조하는 데이터를 수정한다. 
    tuser에 있는 depno값을 null로 변경하거나 다른부서로 변경 후 삭제한다. 
3. 제약조건을 없앤다. 
4. 제약조건을 지정할때 삭제하는 방법에 대해서도 지정한다. 
    a. 열 데이터를 삭제할때 이를 참조하는 데이터도 모두 삭제한다 : 
        constraint 제약조건이름 references 참조테이블 참조열 on delete cascade
    b. 열 데이터를 삭제할때 데이터를 참조하는 데이터를 null로 수정한다. 
        constraint 제약조건 이름 references 참조테이블 참조열 on delete set null
*/
insert into tuser values(3, '1111','김구',    2);
insert into tuser values(4, '1111','고길동', 1);
insert into tuser values(5, '1111','강감찬', 3);
select * from tuser;
-- 1번 방법 
-- 만약에 depno = 2인것을 삭제하고싶다. 
delete from tuser where id=3;  -- 2번 디파트먼트에 소속한 회원을 먼저 삭제하고
delete from tuser_fk where depno=2;  -- 디파트먼트를 삭제 
-- 2번 방법 
-- depno = 3인것을 삭제하고싶다. 
update tuser set depno = null where id=5;  -- 기존 3인 값을 null이나 다른값으로 변경을하고
delete from tuser_fk where depno=3;  -- 디파트먼트를 삭제 

drop table tuser;
-- 테이블 생성
create table tuser2
(   
    id number(3)         constraint tuser2_id_pk  primary key,
    pw varchar2(20)     constraint tuser2_pw_nn  not null,
    name varchar2(20), 
    depno constraint tuser2_depfk  references tuser_fk(depno) on delete cascade
);

insert into tuser_fk values(1,'admin');
insert into tuser_fk values(2,'hr'); 
insert into tuser_fk values(3, 'it');
commit;

insert into tuser2 values(2, '1111','유관순', 1);
insert into tuser2 values(3, '1111','김구',    2);
insert into tuser2 values(4, '1111','고길동', 1);
insert into tuser2 values(5, '1111','강감찬', 3);
select * from tuser2;

delete from tuser_fk where depno=2;

drop table tuser2;
-- 테이블 생성
create table tuser2
(   
    id number(3)         constraint tuser2_id_pk  primary key,
    pw varchar2(20)     constraint tuser2_pw_nn  not null,
    name varchar2(20), 
    depno constraint tuser2_depfk  references tuser_fk(depno) on delete set null
);

delete from tuser_fk where depno=1;

select * from tuser_fk;
select * from tuser2;
update tuser_fk set depno=4 where depname='it';

-- 데이터의 형태와 범위를 정하는 check 
create table tuser3 
(
    id number(3)         constraint tuser3_id_pk  primary key,
    pw varchar2(20)     constraint tuser3_pw_ck check( length(pw)>3 ),
    name varchar2(20)
);

insert into tuser3 values(1,'1234', '홍길동');


