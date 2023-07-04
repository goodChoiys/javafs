package Class_0704;

import java.util.Scanner;

public class P12_Ex6_100_34_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month;

        do {
            System.out.print("원하는 달을 입력하세요> ");
            month = scan.nextInt();

            if (month == 12 || month == 1 || month == 2) {
                System.out.println("겨울 (Winter)");
            } else if (month == 3 || month == 4 || month == 5) {
                System.out.println("봄 (Spring)");
            } else if (month == 9 || month == 10 || month == 11) {
                System.out.println("가을 (Fall)");
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        } while (month < 1 || month > 12);

    }

}
