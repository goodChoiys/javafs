package Quiz;

import java.util.Scanner;

public class Ex100_43_Teacher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("한글로 변환할 수를 입력하세요.");
        int number = scanner.nextInt();

        int[] numbers = new int[5];

        numbers[0] = number / 10000; // 만의 자리수
        numbers[1] = (number / 1000) % 10; // 천의 자리수
        numbers[2] = (number / 100) % 10; // 백의 자리수
        numbers[3] = (number / 10) % 10; // 십의 자리수
        numbers[4] = number % 10; // 일의 자리수

        String sum_str = " ";
        for (int i = 0; i < 5; i++) {
            if (numbers[i] == 1) {
                sum_str += "일";
            } else if (numbers[i] == 2) {
                sum_str += "이";
            } else if (numbers[i] == 3) {
                sum_str += "삼";
            } else if (numbers[i] == 4) {
                sum_str += "사";
            } else if (numbers[i] == 5) {
                sum_str += "오";
            } else if (numbers[i] == 6) {
                sum_str += "육";
            } else if (numbers[i] == 7) {
                sum_str += "칠";
            } else if (numbers[i] == 8) {
                sum_str += "팔";
            } else if (numbers[i] == 9) {
                sum_str += "구";
            }
            if (i == 0 && numbers[0] >= 1) {// 만의 자리수에 숫자가 있다면

            } else if (i == 1 && numbers[1] >= 1) {
                sum_str += "일";
            } else if (i == 2 && numbers[2] >= 1) {
                sum_str += "십";
            } else if (i == 3 && numbers[3] >= 1) {
                sum_str += "백";
            } else if (i == 4 && numbers[4] >= 1) {
                sum_str += "천";
            } else if (i == 5 && numbers[5] >= 1) {
                sum_str += "만";
            }

            System.out.println(sum_str);
        }
        
        System.out.println(sum_str);
    }

}
