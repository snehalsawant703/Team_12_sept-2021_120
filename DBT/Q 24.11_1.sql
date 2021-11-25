use cdacmumbai;
create table emp5
(
SAL FLOAT
);

INSERT INTO EMP5 values
(1234.567),
(1852.019),
(1375.825),
(1748.616);

select * from emp5;
select round(sal) from emp5;
select round(sal,1) from emp5;
select round(sal,-1)from emp5;

select truncate(sal,0) from emp5;
select truncate(sal,-1) from emp5;
select truncate(sal,1) from emp5;

select ceil(sal) from emp5;
select floor(sal) from emp5;

select truncate(3.6,0), floor(3.6), truncate(-3.6,0), floor(-3.6);

select sign(-15) from dual;
select sign(15) from dual;
select sign(0) from dual;

select mod(9,5);
select mod(8.43,3.45);
select sqrt(144);
select power(10,3);
select power(1000,1/3);

select abs(-10);
select sin(30);
select cos(60);
select tan(45);
select log(10);













