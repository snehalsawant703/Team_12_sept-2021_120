use cdacmumbai;

select ename, dname from dept,emp9
where dept.deptno=emp9.deptno;

select ename, dname from dept,emp9
where dept.deptno!=emp9.deptno;

select dname,ename from emp9 right outer join dept
on (dept.deptno=emp9.deptno);

select dname,ename from emp9 left outer join dept
on (dept.deptno=emp9.deptno);

select dname,ename from emp9 right outer join dept
on (dept.deptno=emp9.deptno)
     union
select dname,ename from emp9 left outer join dept
on (dept.deptno=emp9.deptno);