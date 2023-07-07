package Class_0707.Q;

import java.util.Scanner;

public class Lotte {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean choose = true;
        int a1;
        int b1;

        while (choose) {
            System.out.print("선택할 음식 번호를 입력하세요\n");
            int a = sc.nextInt();

            if ((a == 1)) {
                a1 = 400;
            } else if (a == 2) {
                a1 = 340;
            } else if (a == 3) {
                a1 = 170;
            } else if (a == 4) {
                a1 = 100;
            } else if (a == 5) {
                a1 = 70;
            } else {
                return;
            }

            a = sc.nextInt();

            if ((a == 1)) {
                b1 = 400;
            } else if (a == 2) {
                b1 = 340;
            } else if (a == 3) {
                b1 = 170;
            } else if (a == 4) {
                b1 = 100;
            } else if (a == 5) {
                b1 = 70;
            } else {
                return;
            }

            int sum = a1 + b1;

            System.out.println("선택한 메뉴의 칼로리값은 : " + sum + "이므로\n");
            if (sum < 500) {
                System.out.println("엄마의 반응\no angry");
            } else {
                System.out.println("엄마의 반응\nangry");
            }
            break;
        }

    }

}
/*
 * 보림이는 엄마와 함께 놋데리아에 갔다.
 * 
 * 지혜는 먹고 싶은게 많았으나 엄마가 살찐다고 2가지만 골라서 먹으라고 했다.
 * 
 * 그리고 2메뉴의 칼로리 합이 500보다 크면 엄마가 화를 내고, 500이하면 화를 내지 않으신다.
 * 
 * 지혜가 선택할 수 있는 메뉴는 다음과 같다.
 * 
 * 1. 치즈버거 : 400 칼로리
 * 
 * 2. 야채버거 : 340 칼로리
 * 
 * 3. 우유 : 170 칼로리
 * 
 * 4. 계란말이 : 100 칼로리
 * 
 * 5. 샐러드 : 70 칼로리
 * 
 * 이 메뉴들 중 2가지 메뉴를 선택했을 때 칼로리 합을 계산하고, 그 칼로리 합이 500보다 크면 "angry", 500이하면
 * "no angry"를 출력하시오.
 * 
 * 
 * 
 * 입력
 * 
 * 메뉴의 번호가 차례대로 두개 주어진다. (정수)
 * 
 * 출력
 * 
 * 그 번호의 메뉴 칼로리를 계산하여 500보다 크면 "angry", 500이하면 "no angry"를 출력하시오.
 * 
 * 
 * 
 * 입력 예시
 * 
 * 1
 * 
 * 2
 * 
 * 출력 예시
 * 
 * angry
 * 
 * 
 * 
 * 도움말
 * 
 * 치즈버거(400칼로리) + 야채버거(340칼로리) 의 합은 740이므로 엄마가 화를 낸다.
 */
