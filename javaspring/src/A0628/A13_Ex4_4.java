package A0628;

import java.util.Scanner;

public class A13_Ex4_4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.println("점수를 입력하세요.>");
        // 스캐너를 import
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 input에 저장

        if (score >= 90) {
            System.out.println("A학점 입니다.");
        } else if (score >= 80) {
            System.out.println("B학점 입니다.");
        } else if (score >= 70) {
            System.out.println("C학점 입니다.");
        } else if (score >= 60) {
            System.out.println("D학점 입니다.");
        } else if (score >= 50) {
            System.out.println("E학점 입니다.");
        } else {
            System.out.println("F학점 입니다.");
        }

    }
}
