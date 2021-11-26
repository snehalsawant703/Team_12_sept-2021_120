use cdacmumbai;
create table DEPTHEAD
(
	DEPTNO INT,
    DHEAD VARCHAR(20)
);

INSERT into depthead values
(1, 'Arun'),
(2,'Jack');

select *from depthead;

select dname, ename, dhead from emp,dept,depthead
where depthead.deptno=dept.deptno
and dept.deptno=emp9.deptno;

