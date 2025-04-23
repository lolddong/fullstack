package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("1-1000000의 합: " + sum);
        System.out.println("총 소요된 시간: " + totalTime);
    }
}
