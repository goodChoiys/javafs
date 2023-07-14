package Class_0714.Example2;

import java.util.Arrays;
import java.util.stream.Stream;

public class st2 {
    public static void main(String[] args) {
        // 가변 매개변수에서 스트림 생성
        Stream<Double> stream1 = Stream.of(4.2, 2.5, 3.1, 1.9, 99.0);
        stream1.forEach(System.out::println);

    }
}
