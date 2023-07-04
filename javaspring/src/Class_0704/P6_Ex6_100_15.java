package Class_0704;

import java.util.Scanner;

public class P6_Ex6_100_15 {
    public static void main(String[] args) {

        int Year = 0;
        int Month = 0;
        int Day = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("년도를 입력하세요.");
        Year = scanner.nextInt();
        System.out.println("월을 입력하세요.");
        Month = scanner.nextInt();
        System.out.println("일을 입력하세요.");
        Day = scanner.nextInt();

        System.out.printf("%04d.%02d.%02d", Year, Month, Day);

    }
}
