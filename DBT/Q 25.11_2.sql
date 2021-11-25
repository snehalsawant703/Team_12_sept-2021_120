/************      Joins   *************/
use cdacmumbai;

create table DEPT
(
DEPTNO INT,
DNAME VARCHAR(20),
LOC VARCHAR(20)
);

INSERT INTO DEPT VALUES
(1,'TRN','Bby'),
(2,'EXP','Dlh'),
(3,'MKTG','CAl');

select * from DEPT;

select deptno, ename from emp9;

select emp9.deptno, ename, dname from emp9,dept
where dept.deptno=emp9.DEPTNO;

select dept.deptno, ename, dname from emp9,dept
where dept.deptno=emp9.DEPTNO;

select ename, dname from emp9,dept
where dept.deptno=emp9.DEPTNO;

select ename, dname from dept,emp9
where dept.deptno=emp9.DEPTNO;

select ename, dname from emp9,dept
where emp9.deptno=dept.DEPTNO;

select ename, dname from emp9,dept
where emp9.deptno=dept.DEPTNO
order by 1;

select dept.DEPTNO, dname,loc,sal,job from emp9,dept
where emp9.deptno=dept.DEPTNO
order by 1;

select dept.DEPTNO,dept.dname,dept.loc,emp9.sal,emp9.job from emp9,dept
where emp9.deptno=dept.DEPTNO
order by 1;

select dname,sum(sal) from emp9,dept
where dept.deptno=emp9.DEPTNO
group by dname;

select upper(dname), sum(sal) from emp9,dept 
where dept.deptno=emp9.DEPTNO
group by upper(dname)
having sum(sal)>10000
order by 1;
