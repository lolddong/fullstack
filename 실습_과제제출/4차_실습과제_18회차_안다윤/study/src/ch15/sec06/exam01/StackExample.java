package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Stack 컬렉션 생성
        Stack<Coin> stack = new Stack<>();

        // 동전 넣기
        stack.push(new Coin(10));
        stack.push(new Coin(500));
        stack.push(new Coin(50));
        stack.push(new Coin(100));

        // 하나씩 꺼내서 출력
        while (!stack.isEmpty()) {
            Coin coin = stack.pop();
            // getValue()는 롬복으로 정의한 Getter 메소드
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }
    }
}
