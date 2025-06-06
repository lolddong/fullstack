package ch14.sec07.exam03;

import java.sql.SQLOutput;

public class PrintThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("실행 중");
            // interrupt() 메소드가 호출되었다면 while 문 빠져나감
            if (Thread.interrupted()) {
                break;
            }
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
