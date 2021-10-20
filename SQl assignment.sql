SELECT e.ename, job
FROM EMP e
WHERE (job = 'clerk');

SELECT e.ename,job
FROM EMP e
WHERE job = 'clerk' OR job ='manager';

SELECT 
GETDATE() AS todaydate
FROM EMP;


SELECT ename,sal
FROM EMP e
WHERE sal between 500 AND 1000;

SELECT ENAME,HIREDATE
FROM EMP
WHERE MONTH(HIREDATE)=12;


SELECT ename,sal
FROM emp e
WHERE sal NOT BETWEEN 1000 AND 2000;

SELECT ENAME,SAL
FROM EMP
WHERE SAL IN(800,950,3000,5000);


SELECT ENAME
FROM EMP
WHERE ENAME LIKE '_L%';


SELECT ENAME
FROM EMP
WHERE ENAME LIKE '_D%';

SELECT ENAME
FROM EMP
WHERE LEN(ENAME)=5;

SELECT ENAME
FROM EMP
WHERE ENAME LIKE'T%R';


SELECT ENAME
FROM EMP
WHERE ENAME LIKE 'A%';

SELECT ENAME,HIREDATE
FROM EMP
WHERE DAY(HIREDATE)<19;


SELECT ENAME,EMPNO
FROM EMP 
WHERE ENAME='JAMES';


SELECT ENAME,SAL
FROM EMP
WHERE ENAME='KING';

SELECT ENAME,DNAME,JOB
FROM EMP,DEPT
WHERE JOB = 'PRESIDENT';

SELECT ENAME,DNAME,JOB
FROM EMP,DEPT
WHERE JOB = 'MANAGER';

SELECT ENAME,EMPNO
FROM EMP
WHERE comm is not null
UNION
SELECT 'NA',EMPNO
FROM JOBHIST
WHERE enddate is not null;

SELECT ENAME,HIREDATE
FROM EMP
WHERE HIREDATE < '1-apr-1981';

sELECT ENAME,SAL
FROM EMP
WHERE ENAME IN('KING','BLAKE','FORD','SMITH');

SELECT ENAME,SAL
FROM EMP
WHERE ENAME IN('KING','BLAKE','FORD','SMITH');

SELECT ENAME,JOB,SAL 
FROM EMP
WHERE SAL<3500;

SELECT *
FROM EMP
WHERE JOB='CLERK';

SELECT ENAME,SAL,SAL*12 AS anualsal
FROM EMP;


SELECT (sal*12)*0.2 as annualsal 
 from emp
where ename = 'ford'


select deptno, sum (sal) AS TOTAL
from emp 
group by deptno;

SELECT ename,sal
FROM emp
WHERE deptno=10 AND sal <1400;


select ename,empno,job,avg (sal) AS average
from EMP e
where job='MANAGER'
GROUP BY ename,empno,job;

select ename,empno,job,sum (sal) AS total
from EMP e
where job='SALESMAN'
GROUP BY ename,empno,job;

SELECT deptno,avg (sal) AS 'low avg salary'
FROM emp
GROUP BY deptno
HAVING avg (sal)< (select avg (sal) from emp);


SELECT JOB,COUNT(JOB) AS NUMBER
FROM EMP
GROUP BY JOB;

select max(sal) as 'maxsal',job
from emp
where job='analyst'
group by job;

SELECT 
MAX(COMM) AS COMMISSION
FROM EMP;

SELECT deptno,
COUNT (deptno) AS count
FROM EMP
GROUP BY deptno;

SELECT ENAME
FROM EMP
WHERE ENAME LIKE'__l%';