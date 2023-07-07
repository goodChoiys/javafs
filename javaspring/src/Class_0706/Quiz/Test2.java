package Quiz;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner inputNDay = new Scanner(System.in);
        System.out.println("1.월 2. 화 3. 수 4. 목 5. 금 6.토 7.일\n요일에 해당하는 숫자를 정수로 입력하세요");
        int work = inputNDay.nextInt();
        switch (work) {
            case 1:
            case 3:
            case 5:
            case 7:
                System.out.println("oh my god");
                break;
            case 2:
            case 6:
            case 8:
                System.out.println("enjoy");
                break;
        }
    }
}