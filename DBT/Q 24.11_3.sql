use cdacmumbai;
create table emp7
(
ENAME CHAR,
SAL INT,
COMM INT
);
 insert INTO EMP7 VALUES
 ('A',5000,5000),
 ('B',6000,NULL),
 ('C',NULL,700);
 
 select *FROM EMP7;
 
 SELECT *FROM EMP7
 WHERE COMM=NULL;
 
 SELECT *FROM EMP7
 WHERE COMM IS NULL;
 
 SELECT *FROM EMP7
 WHERE COMM != NULL;
 
 SELECT *FROM EMP7
 WHERE COMM IS NOT NULL;
 
 SELECT SAL+COMM FROM EMP7;
SELECT SAL+ifnull(COMM,0) FROM EMP7;
SELECT IFNULL(SAL,0) + IFNULL(COMM,0) FROM EMP7;
SELECT IFNULL(SAL,'CDAC') + IFNULL(COMM,'MUMBAI') FROM EMP7;  


   