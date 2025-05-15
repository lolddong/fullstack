-- 다음을 처리하는 쿼리문을 작성하세요. (p.2)
-- 현재 서버에 존재하는 DB 확인
SHOW DATABASES;
-- 현재 DB를 emplayees로 설정
USE employees;
-- employees DB의 테이블 목록 보기
SHOW TABLE STATUS;
-- employees 테이블의 열 목록 출력
DESC employees;

-- employees 테이블에서 다음 쿼리를 작성하세요. (p.3)
-- titles 테이블의 데이터 출력하기
SELECT * FROM titles;
-- employees 테이블에서 first_name 컬럼만 출력하기
SELECT first_name FROM employees;
-- employees 테이블에서 first_name 컬럼, last_name 컬럼, gender 컬럼 출력하기
SELECT first_name, last_name, gender FROM employees;

-- employees 테이블 출력 시 다음과 같이 나오도록 쿼리를 작성하세요. (p.4)
SELECT first_name AS 이름, gender 성별, hire_date '회사 입사일';

-- 배포된 sqldb.sql 파일을 이용하여 sqldb 데이터베이스를 구축하세요. (p.5)
-- - 이후 작업은 sqldb 데이터베이스로 작업함
-- 문제_캡쳐본.png 참조

-- (p.6)
-- usertbl 테이블에서 이름이 '김경호'인 행을 출력하세요.
SELECT * FROM usertbl WHERE name = '김경호';
-- usertbl 테이블에서 생년이 1970 이상이고 키가 182이상인 데이터를 출력하세요.
SELECT * FROM usertbl WHERE birthYear >= 1970 AND height >= 182;


-- (p.7)
-- usertbl 테이블에서 키가 180~183 범위인 데이터를 출력하세요.
SELECT * FROM usertbl WHERE height BETWEEN 180 AND 183;
-- usertbl 테이블에서 주소가 '경남' 또는 '전남' 또는 '경북'인 데이터를 출력하세요.
SELECT * FROM usertbl WHERE height BETWEEN 180 AND 183;
-- usertbl 테이블에서 이름이 '김'으로 시작하는 데이터를 출력하세요.
SELECT * FROM usertbl WHERE height BETWEEN 180 AND 183;

-- (p.8)
-- usertbl에서 김경호보다 큰 사람들의 이름과 키를 출력하세요.
-- - 서브쿼리를 이용하여 쿼리를 작성하세요.
SELECT name, height 
FROM usertbl 
WHERE height > (
    SELECT height
    FROM usertbl
    WHERE name = '김경호'
);

-- (p.9)
-- usertbl을 mdate(오타?)의 오름차순으로 정렬하여 출력하세요.
SELECT * FROM usertbl ORDER BY mdate;
-- usertbl을 mdate(오타?)의 내림차순으로 정렬하여 출력하세요.
SELECT * FROM usertbl ORDER BY mdate DESC;
-- usertbl을 height의 내림차순으로 정렬하고, 동률인 경우 name의 내림차순으로 정렬하여 출력하세요.
SELECT * FROM usertbl ORDER BY height DESC, name DESC;

-- (p.10)
-- usertbl의 주소지를 중복없이 오름차순으로 출력하세요.
SELECT DISTINCT addr FROM usertbl ORDER BY addr;

-- World DB에서 다음 질문을 처리하세요. (p.11)
-- World DB 자료 못 찾았어요.