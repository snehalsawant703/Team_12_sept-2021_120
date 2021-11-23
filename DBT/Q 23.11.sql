show databases;
use cdacmumbai;
create table EMP2 
(
FNAME VARCHAR(20),
LNAME VARCHAR(20)
);
INSERT INTO EMP2 VALUES
('Arun','Purun'),
('Turun','Arun'),
('Sirun','Kirun'),
('Nutan','Purun');

select * from emp2;

select concat(fname,lname) from emp2;
select concat(concat(fname,' '),lname) from emp2;
select concat(fname,lname) from emp2;
select concat(fname,' ',lname) from emp2;
select concat(fname,'*',lname) from emp2;
select concat('Mr. ',fname,' ',lname) from emp2;
select upper(fname) from emp2;

update emp2 set fname = upper(fname);

select * from emp2 
where upper(fname)='ARUN';

select * from emp2 
where upper(fname)='arun';

select * from emp2 
where lower(fname)='arun';

