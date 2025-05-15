package ch15.sec05.exam02;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // TreeMap 컬렉션 생성
        TreeMap<String, Integer> map = new TreeMap<>();
        // 엔트리 저장
        map.put("apple", 10);
        map.put("forever", 60);
        map.put("description", 40);
        map.put("ever", 50);
        map.put("zoo", 80);
        map.put("base", 20);
        map.put("guess", 70);
        map.put("cherry", 30);
        // 정렬된 엔트리 하나씩 출력
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println();
        // 특정 키에 대한 값 출력
        Entry<String, Integer> entry = null;
        entry = map.firstEntry();
        System.out.printf("제일 앞 단어: %s - %d\n", entry.getKey(), entry.getValue() );
        entry = map.lastEntry();
        System.out.printf("제일 뒤 단어: %s - %d\n", entry.getKey(), entry.getValue());
        entry = map.lowerEntry("ever");
        System.out.printf("ever 앞 단어: %s - %d\n", entry.getKey(), entry.getValue());
        //내림차순 정렬
        NavigableMap<String, Integer> descendingMap = map.descendingMap();
        Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
        for (Entry<String, Integer> m: descendingEntrySet) {
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        System.out.println();
        // 범위 검색
        System.out.println("[c~h 사이의 단어 검색]");
        NavigableMap<String, Integer> rangeMap = map.subMap("C", true, "h", false);
        for (Entry<String, Integer> e : rangeMap.entrySet()) {
            System.out.printf("%s-%d\n", e.getKey(), e.getValue());

        }
    }
}
