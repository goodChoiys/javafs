package Class_0714.Example2;

import java.util.Random;
import java.util.stream.IntStream;

public class st4 {
    public static void main(String[] args) {
        // 지정된 범위의 연속된 정수에서 스트림생성
        IntStream stream1 = new Random().ints(4);
        stream1.forEach(System.out::println);
    }
}
/* 다음 예제는 iterate() 메소드를 이용하여 홀수만으로 이루어진 무한 스트림을 생성하는 예제입니다.

예제
IntStream stream = Stream.iterate(2, n -> n + 2); // 2, 4, 6, 8, 10, ...

파일
파일의 한 행(line)을 요소로 하는 스트림을 생성하기 위해 java.nio.file.Files 클래스에는 lines() 메소드가 정의되어 있습니다.

또한, java.io.BufferedReader 클래스의 lines() 메소드를 사용하면 파일뿐만 아니라 다른 입력으로부터도 데이터를 행(line) 단위로 읽어 올 수 있습니다.

예제
String<String> stream = Files.lines(Path path);

빈 스트림
아무 요소도 가지지 않는 빈 스트림은 Stream 클래스의 empty() 메소드를 사용하여 생성할 수 있습니다.

예제
// 빈 스트림 생성

Stream<Object> stream = Stream.empty();

System.out.println(stream.count()); // 스트림의 요소의 총 개수를 출력함. */