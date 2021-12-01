use cdacmumbai;
create table emp12
(
empno int,
ename char(5),
sal int,
deptno int
);

insert into emp12 values
(1,'A',5000,1),
(2,'B',6000,1),
(3,'C',7000,1),
(4,'D',9000,2),
(5,'E',8000,2);

select * from emp12;

alter table emp12 add primary key(empno);
show indexes from emp12;
show indexes from dept;
select * from dept;

alter table emp12 drop primary key;

alter table dept add primary key(deptno);

alter table emp12
add constraint fk_emp12_deptno
 foreign key(deptno)
references dept(deptno);

delete from emp12
where deptno = 2;

insert into emp12 
values (4,'D',9000,2),
(5,'E',8000,2);

delete from dept 
where deptno=1;

update dept set deptno = 4 where deptno = 3;
update dept set deptno = 3 where deptno = 4;