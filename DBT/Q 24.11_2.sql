use cdacmumbai;

create table emp6
(
HIREDATE DATE
);
 insert INTO EMP6 VALUES
 ('2019-10-15'),
 ('2019-12-31'),
 ('2020-01-15');
 
 SELECT * FROM EMP6;
 
 SELECT SYSDATE() FROM DUAL;
SELECT NOW();
SELECT SYSDATE(), NOW(),sleep(10), sysdate(),NOW();

select adddate(sysdate(),1);
select adddate(sysdate(),2);
select adddate(sysdate(),-1);

select datediff(sysdate(), hiredate) from emp6;
select date_add(hiredate, interval 2 month) from emp6;
select date_add(hiredate, interval -2 month) from emp6;
select date_add(hiredate, interval 1 year) from emp6;
select dayname(sysdate());
select upper(dayname(sysdate()));
select substr(dayname(sysdate()),1,3) from dual;

select addtime('11:00:00:','00:00:01');
select addtime('11:00:00:','00:01:01');
select addtime('11:00:00:','02:30:45');
select addtime('2020-10-12 11:00:00:','15:30:45');



 