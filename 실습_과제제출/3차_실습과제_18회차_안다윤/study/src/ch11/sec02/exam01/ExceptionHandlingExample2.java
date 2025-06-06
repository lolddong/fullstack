package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch(NullPointerException e) {
            // 예외 객체 e의 메세지로 출력
            System.out.println(e.getMessage());
            // System.out.println(e.toString());
            
            // 스택 추적 내용을 모두 출력
             e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}
