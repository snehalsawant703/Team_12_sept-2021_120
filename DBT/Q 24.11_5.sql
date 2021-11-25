use cdacmumbai;
create table emp9
(
EMPNO INT,
ENAME VARCHAR(20),
SAL INT,
DEPTNO INT,
JOB CHAR,
MGR INT
);
 insert INTO EMP9 VALUES
 (1, 'Arun',8000,1,'C',4),
 (2, 'Ali',7000,1,'C',1),
 (3, 'kiran',3000,1,'C',1);
 
 insert INTO EMP9(EMPNO,ENAME,SAL,DEPTNO,JOB) VALUES
 (4, 'Jack',9000,2,'M');
  insert INTO EMP9 value
  (5, 'Thomas',8000,2,'C',4);
  
  select * from emp9;
  
  select 
  case
  when job='M' then 'Manager'
  when job='C' then 'Clerk'
  end "JOB"
  from emp9;
  
  select 
  case
  when DEPTNO=1 then 'training'
  when DEPTNO=2 then 'sales'
  end "DEPTNAME"
  from emp9;
 
 select sum(sal) from emp9;
 
 update emp9
 set sal=null 
 where Empno=5;
 
 select sum(sal) from emp9;
 select sum(ifnull(sal,0))from emp9;
 select avg(sal)from emp9;
 select avg(ifnull(sal,0))from emp9;
 select min(sal) from emp9;
select min(ifnull(sal,0)) from emp9;
select max(sal) from emp9;
select count(sal) from emp9;
select count(*) from emp9;
select sum(sal) from emp9
where job='c';
select sum(sal) from emp9
where deptno=2;

select count(*) from emp9
where sal>7000;

select max(sal)/min(sal) from emp9;
select sum(sal)/count(*) from emp9;

 update emp9
 set sal=8000 
 where Empno=5;
 
 select * from emp9;
 
 /* SUMMARY REPORT */
  select count(*),min(sal),max(sal),sum(sal),avg(sal) from emp9;