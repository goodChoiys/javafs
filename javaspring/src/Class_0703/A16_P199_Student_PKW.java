package Class_0703;

import java.util.Scanner;

public class A16_P199_Student_PKW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = 0;
        int chose = 0;
        int c = 0;
        int high = 0;
        int[] score = null;
        float avg = 0;

        while (true) {
            System.out.println("------------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("------------------------------------------------------------");
            System.out.println("메뉴를 선택해주세요.");
            chose = sc.nextInt();
            // 변수 c는 학생 입력을 먼저 선택하지 않았을 경우 들아감
            if (c == 0) {
                if (chose != 1) {
                    System.out.println();
                    System.out.println("학생 수를 먼저 입력해 주세요.");
                    continue;
                }
            }
            // 학생 선택시 시작.
            if (chose == 1) {
                if (c == 1) {
                    System.out.println("이미 학생수를 입력했습니다.");
                    continue;
                }
                System.out.println("학생수를 입력해 주세요.");
                students = sc.nextInt();
                System.out.println("현재 입력하신 학생수 : " + students);
                // 학생수 만큼 배열 생성
                score = new int[students];
                c = 1;
            } else if (chose == 2) {
                System.out.println("학생들의 점수를 입력해 주세요.");
                int n = 0;
                while (true) {
                    System.out.printf("학생 %d의 점수 입력 : ", n + 1);
                    score[n] = sc.nextInt();
                    if (n == students - 1) {
                        System.out.println("점수 입력이 완료되었습니다.");
                        break;
                    }
                    n++;
                }
            } else if (chose == 3) {
                System.out.println("학생들의 점수 내역입니다.");
                for (int i = 0; i < students; i++) {
                    System.out.printf("%n학생 %d의 점수 : %d%n ", i + 1, score[i]);
                }
            } else if (chose == 4) {
                high = score[0];
                for (int i = 0; i < students; i++) {
                    if (high < score[i]) {
                        high = score[i];
                    }
                    avg = avg + score[i];
                }
                System.out.println("최고점 : " + high);
                System.out.printf("평균 : %.1f%n", avg / students);
            } else if (chose == 5) {
                System.out.println("프로그램을 종료합니다. 감사합니다.");
                break;
            }
        }
    }
}