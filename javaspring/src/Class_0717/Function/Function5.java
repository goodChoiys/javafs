package Class_0717.Function;

import java.util.function.BinaryOperator;

public class Function5 {
    public static void main(String[] args) {
        // Calculator mc = (a, b) -> a + b;
        BinaryOperator<Integer> mc = (a, b) -> a + b;
        int result = mc.apply(3, 4);
        System.out.println(result); // 7 출력
    }
}