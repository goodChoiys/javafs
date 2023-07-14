package Class_0714.Example2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> distinctNumbers = numbers.stream()
                //distinct는 중복제거임
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctNumbers); // [1,2,3,4,5]
    }
}
