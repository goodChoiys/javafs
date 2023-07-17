package Class_0717;

import java.util.Arrays;
import java.util.Comparator;

public class Stream2 {
    public static void main(String[] args) {
        int[] data={5,6,4,2,3,1,1,2,2,4,8};
        int[] result = Arrays.stream(data) // IntStream을 생성한다.
        .boxed() // InterStream을 Stream<Integer>로 변경한다.
        .filter((a) -> a % 2 == 0) // 짝수만 뽑아낸다.
        .distinct() // 중복을 제거한다.
        .sorted(Comparator.reverseOrder()) // 역순으로 정렬한다.
        .mapToInt(Integer::intValue) // Stream<Integer>를 IntStream 으로 변경한다.
        .toArray(); // int[] 배열로 반환하다.

        // 결과 출력
        System.out.println(Arrays.toString(result));
    }
}


/* 
박싱은 기본 타입인 int를 해당하는 참조 타입인 Integer로 변환하는 과정을 말합니다. 스트림에서 사용하는 distinct() 메소드와 sorted() 메소드는 요소들을 비교하고 정렬하기 위해 Comparable 인터페이스 또는 Comparator 인터페이스를 사용합니다. 이러한 인터페이스는 참조 타입에 대해서만 작동하므로 기본 타입인 int를 바로 사용할 수는 없습니다.

따라서 스트림에서 중복 제거와 정렬을 위해서는 기본 타입인 int를 해당하는 참조 타입인 Integer로 박싱하는 과정이 필요합니다. 박싱을 통해 int 값을 Integer 객체로 감싸고, 이후 정렬이나 중복 제거 작업을 수행할 수 있습니다.

박싱은 자동으로 수행되기도 하지만, 명시적으로 박싱을 수행하는 .boxed() 메소드를 사용하여도 됩니다. 이를 통해 스트림 요소들을 기본 타입에서 해당하는 참조 타입으로 변환하여 다양한 작업을 수행할 수 있습니다.
*/