package Class_0717.P771;

import java.util.Arrays;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("This is a java book", "Lambda Expressions",
                "Java supports lambda expressions");
        list.stream()
                .filter(a -> a.toLowerCase().contains("java"))
                .forEach(System.out::println);

    }
}
