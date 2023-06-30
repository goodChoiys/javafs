package A0629;
import java.util.Scanner;

public class A12_Book2_Q {
    public static void main(String[] args) {

        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.printf(">");
            inputString = scanner.nextLine(); //nextLine: 문자를 한줄단위로 받을수있음
            System.out.println(inputString);
        } while (! inputString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");

    }
}
