package A0628;

import java.util.Scanner;

public class A14_Ex4_5 {
    public static void main(String[] args) {
        char grade = ' ', opt = ' ';

        System.out.println("점수를 입력하세요.>");
        // 스캐너를 import
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 input에 저장

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }

        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }

        } else {
            grade = 'C';
            if (score >= 78) {
                opt = '+';
            } else if (score < 74) {
                opt = '-';
            }

        }
        System.out.printf("당신의 학점은 %c%c입니다. %n", grade, opt);
    }
}