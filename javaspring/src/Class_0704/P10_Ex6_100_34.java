package Class_0704;

import java.util.Scanner;

public class P10_Ex6_100_34 {
    public static void main(String[] args) {

        /*
         * 월을 나타내는 정수 한개(1~12)가 입력될 때 계절이 출력되도록 해보자.
         * 예
         * 월 : 계절
         * 12, 1, 2 : winter
         * 3, 4, 5 : spring
         * 6, 7, 8 : summer
         * 9, 10, 11 : fall
         * 
         * 입력
         * 월을 의미하는 한 개의 정수가 입력된다.
         * (1 ~ 12)
         * 출력
         * 계절을 출력한다.
         * 입력 예시
         * 12
         * 출력 예시
         * winter
         * 도움말
         * swtich( ).. case ... break; 제어문에서 break;를 제거하면
         * 멈추지 않고 다음 명령이 실행되는 특성을 이용할 수 있다.
         * switch(a)
         * {
         * ...
         * case 3:
         * case 4:
         * case 5:
         * printf("spring");
         * break;
         * ...
         * }
         * 
         * 로 작성하면, 3, 4, 5가 입력되었을 때 모두 "spring"이 출력된다.
         * 12, 1, 2 는 어떻게 처리해야할지 여러 가지로 생각해 보아야 한다. ^^
         * 
         */

        // if문
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~12 사이의 정수를 입력하시면 해당하는 계절이 나옵니다.");
        int a = scanner.nextInt();
        if (a == 12 && a < 3) {
            System.out.println("입력하신 달의 계절은 겨울(winter) 입니다.");
        } else if (a >= 3 && a <= 6) {
            System.out.println("입력하신 달의 계절은 봄(spring) 입니다.");
        } else if (a >= 7 && a <= 10) {
            System.out.println("입력하신 달의 계절은 여름(summer) 입니다.");
        } else {
            System.out.println("입력하신 달의 계절은 가을(autumn) 입니다.");
        }

        // switch case문
        System.out.println("1~12 사이의 정수를 입력하시면 해당하는 계절이 나옵니다.");
        int month = scanner.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("입력하신 달의 계절은 겨울(winter) 입니다.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("입력하신 달의 계절은 봄(spring) 입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("입력하신 달의 계절은 여름(summer) 입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("입력하신 달의 계절은 가을(autumn) 입니다.");
                break;

        }

    }
}
