package Class_0704;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class P5_Ex6_100_13_2 {
    public static void main(String[] args) {


BigDecimal number = new BigDecimal("2.45678");
BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
System.out.println(rounded);  // 출력: 2.46

    }
}