package homework;

import java.util.Scanner;

public class DDSS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("알람을 몇시로 맞출지 설정하세요");
        int Hour = scan.nextInt();
        System.out.println("알람을 몇분으로 맞출지 설정하세요");
        int Minute = scan.nextInt();

        if (Hour >= 25) {
            System.out.println("25미만의 값으로 다시 설정하세요");
            return;
        } else if (Minute < 45) {
            if (Hour == 0) {
                Hour = 23;
            } else {
                Hour--;
            }
            Minute = Minute - 45 + 60;
        } else {
            Minute = Minute - 45;
        }
        System.out.printf("창영이 방법대로 설정된 알람은 %d" + "시" + " " + "%d" + "분 입니다.", Hour, Minute);

    }
}
