show databases;
use cdacmumbai;
create table EMP3
(
ENAME VARCHAR(30)
);
INSERT INTO EMP3 VALUES
('Arun Purun'),
('Turun Arun'),
('Sirun Kirun'),
('Nutan Purun');

select lpad(ename,25,' ')from emp3;
select lpad(ename,25,'*')from emp3;
select rpad(ename,25,' ')from emp3;
select rpad(ename,25,'=')from emp3;

select ltrim(ename) from emp3;
select rtrim(ename) from emp3;
select trim(ename) from emp3;

select substr(ename , 3) from emp3;
select substr(ename , 3,2) from emp3;
select substr(ename , -3) from emp3;
select substr(ename , -3, 2) from emp3;

select replace(ename,'un','xy') from emp3;
select replace(ename,'un','x') from emp3;
select replace(ename,'un','xyz') from emp3;
select replace(ename,'un','') from emp3;
select replace(ename,'un',' ') from emp3;




