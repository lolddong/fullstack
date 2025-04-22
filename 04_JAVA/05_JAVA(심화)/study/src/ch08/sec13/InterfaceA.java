package ch08.sec13;

public sealed interface InterfaceA permits InterfaceB {
    // 추상 메소드 정의
    void methodA();
}
