package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수: " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
//        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}

/* 문제점 설명:
line 5에 result를 int로 선언해서, data가 null일 경우 NullPointerException 예외 발생함
 */