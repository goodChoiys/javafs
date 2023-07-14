package Class_0714.Example2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream12 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple","banana","carrot","banana","eggplant");
        List<String> uniqueSortedString = strings.stream()
        .distinct()
        .sorted()
        .collect(Collectors.toList());

        System.out.println(uniqueSortedString);

    }
}