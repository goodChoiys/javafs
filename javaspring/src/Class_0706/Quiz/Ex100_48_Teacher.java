package Quiz;

import java.util.Scanner;

public class Ex100_48_Teacher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("주민번호 앞 6자리를 입력해주세요");
        int number = scanner.nextInt();
        System.out.println("주민번호 뒤 첫째자리를 입력해주세요");
        int male = scanner.nextInt();
        int birth_year;
        if (male == 1 || male == 2) {
            birth_year = 1900 + number / 10000;
        } else {
            birth_year = 2000 + number / 10000;
        }
        int age = 2023 - birth_year;
        System.out.println("나이는 : " + age+ "살 입니다.");
    }
}
