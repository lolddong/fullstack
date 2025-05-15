package ch15.sec03.exam03;

import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception{
        // Properties 컬렉션 생성
        Properties props = new Properties();
        // PropertiesExample.class와 동일한 ClassPath에 있는 database.properties 파일 로드
        props.load(PropertiesExample.class.getResourceAsStream("database.properties"));
        // 주어진 키에 대한 값 읽기
        String driver = props.getProperty("driver");
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = props.getProperty("password");
        String admin = props.getProperty("admin");
        // 값 출력
        System.out.println("driver: " + driver);
        System.out.println("url: " + url);
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("admin: " + admin);
    }
}