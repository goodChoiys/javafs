package Class_0704;

import java.util.Scanner;

public class P9_Ex6_100_20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력하세요");
        int a = scanner.nextInt();
        System.out.println("두번째 정수를 입력하세요");
        int b = scanner.nextInt();

        int c = (a > b) ?  a : b;

        System.out.println(c + "가 더 큰 값입니다.");

    }
}
