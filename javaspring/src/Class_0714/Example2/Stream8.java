package Class_0714.Example2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> squareEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squareEvenNumbers);

    }
}
