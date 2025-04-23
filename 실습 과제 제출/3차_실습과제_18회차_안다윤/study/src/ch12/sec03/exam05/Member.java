package ch12.sec03.exam05;

import lombok.*;

@Data // Getter, Setter, equals(), hashCode(), toString() 메소드
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 전체 필드 초기화하는 생성자
public class Member {
    private String id;
    private String name;
    private int age;
}

// 위의 생성자 및 메소드들 제대로 생성되었는지 확인 방법:
// - View > Tool Windows > Structure > 왼쪽 중간 bar에 Member 클래스가 갖고 있는 생성자 및 메소드들 확인