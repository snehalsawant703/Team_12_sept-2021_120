show databases;
use cdacmumbai;
create table EMP4
(
ENAME VARCHAR(30)
);
INSERT INTO EMP4 VALUES
('Anjali'),
('Basit'),
('Chetan');

select * from emp4;
select length(ename) from emp4;
select ascii(ename) from emp4;
select ascii(substr(ename,2)) from emp4;
select ascii(substr(ename,-1)) from emp4;

select ascii('z') from emp4;
select distinct ascii('z') from emp4;

select * from emp4
 where soundex(ename) = soundex('Basittttt');
select * from emp4
 where soundex(ename) = soundex('Aaannnnjjjaaallliii');
 
use mysql;

select distinct ascii('z') from user;
select ascii('z') from dual;
select substr('new mumbai',1,3) from dual;
select 3*12 from dual;
select 'Welcome to MySQL' from dual;
select char(65 using utf8) from dual;

show character set;
