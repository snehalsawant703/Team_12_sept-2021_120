use cdacmumbai;

select * from emp9;

select ename,sal from emp9
where sal=
(select min(sal) from emp9);

select ename, max(sal) from emp9
where sal<
(select max(sal) from emp9);
 
 /*display the row who belongs to the same dept no as thomas */
select * from emp9  
where DEPTNO=   
(select DEPTNO from emp9
where ename='Thomas');

/* display all rows who are doing same job as kirun  */

select * from emp9
where job=
(select job from emp9
where ename='Kiran');


