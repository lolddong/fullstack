package ch13.sec04;

public class GenericExample {
    // 제한된 타입 파라미터를 갖는 제네릭 메소드
    public static <T extends Number> boolean compare(T t1, T t2) { // 타입 파라미터 T를 대체할 타입을 Number로 제한
        // T의 타입 출력
        System.out.printf("compare(%s, %s}\n", t1.getClass().getSimpleName(), t2.getClass().getSimpleName());
        // Number 메소드 사용
        double v1 = t1.doubleValue(); // Number 타입의 doubleValue() 메소드 호출
        double v2 = t2.doubleValue(); // Number 타입의 doubleValue() 메소드 호출
        return (v1 == v2);
    }
    public static void main(String[] args) {
        // 제네릭 메소드 호출
        boolean result1 = compare(10, 20); // T를 Integer 타입으로 대체
        System.out.println(result1);
        System.out.println();
        // 제네릭 메소드 호출
        boolean result2 = compare(4.5, 4.5); // T를 Double 타입으로 대체
        System.out.println(result2);
    }
}
