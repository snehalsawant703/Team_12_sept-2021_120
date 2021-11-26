use cdacmumbai;

update emp9 
set sal=13000
where empno=3;

select * from emp9;

select * from emp9
where sal > all
(select sal from emp9
where job='M');

select * from emp9
where sal > 
(select max(sal) from emp9
where job='M');

update emp9 
set sal=3000
where empno=3;

/* display the dname that is having max(sum(sal))*/

select sum(sal) from emp9
group by deptno;

select max(sum_sal) from 
(select sum(sal) sum_sal from emp9
group by deptno) as temp;

select deptno, sum(sal) from emp9
group by deptno
having sum(sal)=
(select max(sum_sal) from 
(select sum(sal) sum_sal from emp9
group by deptno) as temp);

select dname, sum(sal) from emp9,dept
where dept.deptno=emp9.DEPTNO 
group by dname
having sum(sal)=
(select max(sum_sal) from 
(select sum(sal) sum_sal from emp9
group by deptno) as temp);

