package ch15.sec05.exam03;

import java.util.TreeSet;
public class ComparableExample {
    public static void main(String[] args) {
        // TreeSet 컬렉션 생성
        TreeSet<Person> people = new TreeSet<>();
        // 객체 저장
        people.add(new Person("홍길동", 45));
        people.add(new Person("홍감자바", 25));
        people.add(new Person("박지원", 31));
        // 객체 하나씩 출력
        for(Person person: people) {
            System.out.println(person.name + ": " + person.age);
        }
    }
}
