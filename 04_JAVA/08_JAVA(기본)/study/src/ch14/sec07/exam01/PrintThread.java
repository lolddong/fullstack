package ch14.sec07.exam01;

public class PrintThread extends Thread{
    private boolean stop;

    // 외부에서 stop 필드값 변경 가능하도록 Setter 선언
    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while(!stop) {
            System.out.println("실행 중");
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
