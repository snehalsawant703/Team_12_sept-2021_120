use cdacmumbai;
select * from emp9;

/* display all the rows that are receiving a sal equal to any of manager */

select * from emp9
where sal=any
(select sal from emp9
where job = 'M');

select * from emp9
where sal in 
(select sal from emp9
where job = 'M');

/* exclude manager */

select * from emp9
where sal in
(select sal from emp9
where job != 'M');

select * from emp9
where sal in
(select min(sal) from emp9
where job = 'M');

select * from emp9
where sal <
(select min(sal) from emp9
where job = 'M');
