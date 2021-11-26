use cdacmumbai;
select dname,ename from emp9,dept;
select dname,ename from dept,emp9;

select a.ENAME,b.ename from emp9 b,emp9 a
where a.mgr=b.empno;

select * from emp9;