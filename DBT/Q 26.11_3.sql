use cdacmumbai;
create table PROJECTS 
(
projectno char(4),
clientname varchar(20),
projdtls varchar(20)
);

insert into projects values
('P1','Deloitte','CGS'),
('P2','MorganStanly','AMS'),
('P3','BNPDarilsos','Macrospeb'),
('P4','ICICIBank','PPS'),
('P5','AMFI','WebsiteDep');

create table PROJECTS_EMP
(
projectno char(4),
empno int
);

insert into projects_emp values
('P1',1),
('P1',2),
('p1',4),
('P2',1),
('P2',3),
('P2',4),
('P3',2),
('P3',5);

select * from projects_emp;

select clientname,projdtls,ename
from projects_emp,emp9,projects
where projects.projectno=projects_emp.projectno
and emp9.empno=projects_emp.empno
order by 1,2,3;