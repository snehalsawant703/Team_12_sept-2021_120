show databases;
create table emp1
(
EMPNO int(4),
ENAME varchar(20),
SAL float,
CITY VARCHAR(15),
DEPTNO INT(4)
);
SELECT * FROM EMP1;
INSERT INTO EMP1 
VALUES (1,'ADAMS',1000,'MUMBAI',10),
(2,'BLAKE',2000,'DELHI',10),
(3,'ALLEN',2500,'MUMBAI',20),
(4,'KING',3000,'DELHI',25),
(5,'FORD',4000,'KOLHAPUR',30);

SELECT * FROM EMP1;
SHOW databases;
USE CDACMUMBAI;

SELECT * FROM EMP1
WHERE ENAME>'A' AND ENAME<'B';

SELECT * FROM EMP1
WHERE ENAME>='A' AND ENAME<'B';

SELECT * FROM EMP1
WHERE ENAME LIKE 'A%';

SELECT * FROM EMP1
WHERE ENAME LIKE '%A%';

SELECT * FROM EMP1
WHERE ENAME LIKE '%A';

SELECT * FROM EMP1
WHERE ENAME LIKE '__A%';

SELECT * FROM EMP1
WHERE ENAME LIKE '_____';

SELECT * FROM EMP1
WHERE ENAME LIKE '_I__';

SELECT * FROM EMP1
WHERE ENAME NOT LIKE 'A%';

SELECT * FROM EMP1
WHERE ENAME NOT LIKE '%A%';

SELECT *FROM EMP1
WHERE SAL>= 2000 AND SAL<=3000;

SELECT *FROM EMP1
WHERE SAL BETWEEN 2000 AND 3000;

SELECT *FROM EMP1
WHERE SAL NOT BETWEEN 2000 AND 3000;

SELECT * FROM EMP1
WHERE DEPTNO=10 OR DEPTNO=20 OR DEPTNO=30;

SELECT * FROM EMP1
WHERE DEPTNO IN (10,20,30);

SELECT * FROM EMP1
WHERE CITY IN('MUMBAI','DELHI');

SELECT * FROM EMP1
WHERE CITY NOT IN('MUMBAI','DELHI');

update emp 
set sal = 10000
where empno=1;

update emp1
set sal = sal + sal*0.4
where empno = 1;

update emp1
set sal = 10000
where CITY ='MUMBAI';

select * from emp;

insert into emp1 
value (6, 'shailesh',5000,'pune',20);
commit;
insert into emp1 
value (7, 'snehal',7000,'Nashik',30);
savepoint abc;
insert into emp1 
value (8, 'siddhesh',8000,'mumbai',30);
savepoint abc;
insert into emp1 
value (9, 'shubham',6000,'pune',20);
select * from emp1;
rollback to abc;
select * from emp1;
rollback;
select * from emp1;


