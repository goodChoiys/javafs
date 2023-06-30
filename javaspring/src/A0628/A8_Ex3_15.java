package A0628;

import java.util.Scanner;

public class A8_Ex3_15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 'Scanner'를 사용하여 사용자의 입력을 받는다.
        char ch = ' ';
        System.out.println("문자를 하나 입력하세요.>");
        String input = scanner.nextLine();
        ch = input.charAt(0); //인덱스 0번에 문자를 입력받겠다.
        
        if ('0' <= ch && ch <= '9') {
            System.out.printf("입력하신 문자는 숫자입니다.%n");
        }
        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.printf("입력하신 문자는 영문자입니다.%n");
        }

        // 경고 보기싫어서 억지로 넣어둠
        System.out.println(scanner);
    }
}
