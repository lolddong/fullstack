package ch15.sec06.exam01;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor // 전체 매개변수 생성자 자동 생성
@Getter // value에 대한 Getter 메소드 자동 생성
public class Coin {
    private int value;
}
