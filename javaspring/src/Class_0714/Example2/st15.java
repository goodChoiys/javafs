package Class_0714.Example2;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class st15 {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("넷", "둘", "하나", "셋");

        List<String> list = stream.collect(Collectors.toList());
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}

/* 스트림 요소의 수집 용도별 사용할 수 있는 Collectors 메소드는 다음과 같습니다.

1. 스트림을 배열이나 컬렉션으로 변환 : toArray(), toCollection(), toList(), toSet(), toMap()

2. 요소의 통계와 연산 메소드와 같은 동작을 수행 : counting(), maxBy(), minBy(), summingInt(), averagingInt() 등

3. 요소의 소모와 같은 동작을 수행 : reducing(), joining()

4. 요소의 그룹화와 분할 : groupingBy(), partitioningBy() */