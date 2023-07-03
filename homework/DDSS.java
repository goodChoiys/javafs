package homework;

import java.util.Scanner;

public class DDSS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt(); // 시
        int minute = scanner.nextInt(); // 분
        scanner.close();

        if (minute < 45) {
            hour--;
            minute = 60 - (45 - minute);

            if (hour < 0) {
                hour = 23;
            }

            System.out.println(hour + " " + minute);
        } else {
            System.out.println(hour + " " + (minute - 45));

        }

    }
}
