package Class_0704;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P4_Ex6_100_13_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("실수 값을 입력하세요.");
        float num = scanner.nextFloat();// 1.23579
        DecimalFormat df = new DecimalFormat("#.##");
        String rounded = df.format(num);
        System.out.println(rounded);// 1.24

    }
}