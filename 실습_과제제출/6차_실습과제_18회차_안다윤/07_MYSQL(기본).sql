-- 1. 다음과 같은 데이터베이스를 준비하세요. (p.2)
--      데이터베이스명: jdbc_ex
--      사용자: scoula
--      비밀번호: 1234
--      jdbc_ex 데이터베이스에 대한 모든 사용권한 부여
CREATE DATABASE jdbc_ex;

drop user 'scoula'@'localhost';
CREATE USER 'scoula'@'%' IDENTIFIED BY '1234';
GRANT ALL PRIVILEGES ON jdbc_ex.* TO 'scoula'@'%';
FLUSH PRIVILEGES; // 8버전 이후는 FLUST PRIVILEGES 안 해도 됨
SELECT * FROM mysql.user;


-- 2. 자바 프로젝트를 생성하세요. (p.3)
-- 생성함.


-- 3. IntelliJ에서 다음과 같은 users테이블을 정의하세요. (p.4)
USE jdbc_ex;

CREATE TABLE USERS (
	ID VARCHAR(12) NOT NULL PRIMARY KEY,
	PASSWORD VARCHAR(12) NOT NULL,
	NAME VARCHAR(30) NOT NULL,
	ROLE VARCHAR(6) NOT NULL
);


-- 4. 다음과 같은 테스트 데이터를 추가하세요. (p.4)
INSERT INTO USERS(ID, PASSWORD, NAME, ROLE)
	VALUES('guest', 'guest123', '방문자', 'USER');
INSERT INTO USERS(ID, PASSWORD, NAME, ROLE)
	VALUES('admin', 'admin123', '관리자', 'ADMIN');
INSERT INTO USERS(ID, PASSWORD, NAME, ROLE)
	VALUES('member', 'member123', '일반회원', 'USER');
SELECT * FROM USERS;


-- 5. JUnit5를 이용하여 데이터베이스에 접속하는 JDBC 코드를 테스트하세요. (p.5)
--   test 폴더에서 작업함
--   패키지명: org.scoula.jdbc_ex.test
--   테스트 클래스명: ConnectionTest, 테스트 메소드: testConnection()
-- 생성함.

-- 6. resource 폴더에 application.properties 파일을 생성하고 다음 내용을 작성하세요. (p.6)
-- 생성함.

-- 7. org.scoula.jdbc_ex.common 패키지에 JDBCUtil 클래스를 작성하세요. (p.7)
-- 작성함.

-- 8. ConnectionTest 클래스의 testConnection2 메서드에서 JDBCUtil 클래스의 기능을 테스트하세요. (p.8)
-- 테스트함.