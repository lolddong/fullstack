package ch15.sec05.exam01;

import java.util.TreeSet;
import java.util.NavigableSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet 컬렉션 생성
        TreeSet<Integer> treeSet = new TreeSet<>();
        // Integer 객체 저장
        treeSet.add(87);
        treeSet.add(98);
        treeSet.add(75);
        treeSet.add(95);
        treeSet.add(80);
        // 자동 정렬된 Integer 객체 출력
        for (Integer score : treeSet) {
            System.out.print(score + " ");
        }
        System.out.println("\n");
        // 특정 객체 갖고오기
        System.out.println("가장 낮은 점수: " + treeSet.first());
        System.out.println("가장 높은 점수: " + treeSet.last());
        System.out.println("95점 바로 아래 점수: " + treeSet.lower(95));
        System.out.println("95점 바로 위 점수: " + treeSet.higher(95));
        System.out.println("95점 또는 바로 아래 점수: " + treeSet.floor(95));
        System.out.println("85점 또는 바로 위 점수: " + treeSet.ceiling(85));
        System.out.println();
        // 내림차순 정렬
        NavigableSet<Integer> descendingScores = treeSet.descendingSet();
        for (Integer score: descendingScores) {
            System.out.print(score + " ");
        }
        System.out.println("\n");
        // 범위 검색 (80 이상)
        NavigableSet<Integer> rangeSet = treeSet.tailSet(80, true);
        for (Integer score : rangeSet) {
            System.out.print(score + " ");
        }
        System.out.println("\n");
        // 범위 검색 (80 <= score < 90)
        rangeSet = treeSet.subSet(80, true, 90, false);
        for (Integer score : rangeSet) {
            System.out.print(score + " ");
        }
    }
}
