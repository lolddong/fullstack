package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.printf("array[%d]: %d\n",i , value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.printf("array[%d]번째:\n", i);
                System.out.println("- 배열 인덱스가 초과됨: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.printf("array[%d]번째:\n", i);
                System.out.println("- 숫자로 변환할 수 없음: " + e.getMessage());
            }
        }
    }
}
