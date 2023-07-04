package Class_0704;

import java.util.Scanner;

public class P11_Ex6_100_34_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1~12 사이의 정수를 입력하시면 해당하는 계절이 나옵니다.");
        int month = scanner.nextInt();

        // if문
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("입력하신 달의 계절은 겨울(winter) 입니다.");

        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("입력하신 달의 계절은 봄(spring) 입니다.");

        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("입력하신 달의 계절은 여름(summer) 입니다.");
        } else if (month > 8 && month < 12) {
            System.out.println("입력하신 달의 계절은 가을(autumn) 입니다.");
        } else {
            System.out.println("잘못된 값을 입력하였습니다.");
            
        }

    }
}
