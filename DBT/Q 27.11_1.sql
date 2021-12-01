use cdacmumbai;
create table emp11
(
empno int,
ename varchar(20),
sal int,
depno int
);

insert into emp11 values
(5,'A',5000,1),
(4,'A',6000,1),
(1,'C',7000,1),
(2,'D',9000,2),
(3,'E',8000,2);

select * from emp11;

create index ind_empno on emp11(empno);
show indexes from emp11;

create index ind_deptno_ename on emp11(depno,empno);