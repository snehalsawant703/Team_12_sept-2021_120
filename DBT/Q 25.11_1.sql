use cdacmumbai;
select * from emp9;

select sum(sal) from emp9;
select sum(sal) from emp9
where deptno=1;

select sum(sal) from emp9
group by deptno;

select deptno,sum(sal) from emp9
group by deptno;

select sum(sal) from emp9
group by deptno;

select sum(sal),deptno from emp9
group by deptno;

select deptno,min(sal) from emp9
group by deptno;

select deptno,max(sal) from emp9
group by deptno;

select deptno,count(*) from emp9
group by deptno;

select deptno, sum(sal) from emp9
where sal>7000
group by DEPTNO;

select deptno,job,sum(sal) from emp9
group by deptno,job;

select job,deptno,sum(sal)from emp9
group by job, deptno;

select deptno,job,sum(sal)from emp9
group by job, deptno;

select deptno,sum(sal) from emp9
group by deptno
having sum(sal)>17000;

select deptno,sum(sal) from emp9
group by deptno
order by sum(sal);

select max(sum_sal) from 
(select sum(sal) sum_sal from emp9
group by deptno) as tempp ;

