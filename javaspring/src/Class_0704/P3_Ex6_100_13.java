package Class_0704;

import java.util.Scanner;

public class P3_Ex6_100_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("실수 값을 입력하세요.");
        float num = scanner.nextFloat();

        // 첫번째 방법
        // System.out.printf("%.2f", num);

        // 두번째 방법
        num = (num + 0.005f) * 100; // 124.079
        System.out.println(num);
        int i = (int) num; // 124
        System.out.println(i);
        num = (float) i / 100;
        System.out.println(num); // 1.24

    }
}