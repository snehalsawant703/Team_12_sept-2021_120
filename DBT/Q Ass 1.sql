select length('Snehal')from dual;

select concat(lpad('',37,'*'), rpad('snehal',40,'*'));

use cdacmumbai;
select * from emp4;
insert into emp4
value('SNEHAL');

select concat(
substr(ename,1,1) ,
char(ascii(substr(ename,2,1))+32 using utf8),
char(ascii(substr(ename,3,1))+32 using utf8),
char(ascii(substr(ename,4,1))+32 using utf8),
char(ascii(substr(ename,5,1))+32 using utf8),
char(ascii(substr(ename,6,1))+32 using utf8)
) from emp4 where ename='SNEHAL';


select lpad('Snehal',80,'*');







select substr(ename,1,1) from emp4
where ename='SNEHAL';
select substr(ename,2,1) from emp4
where ename='SNEHAL';
select substr(ename,3,1) from emp4
where ename='SNEHAL';
select substr(ename,4,1) from emp4
where ename='SNEHAL';
select substr(ename,5,1) from emp4
where ename='SNEHAL';
select substr(ename,6,1) from emp4
where ename='SNEHAL';





/*select concat('S',char(ascii('N')+32 using utf8));*/

