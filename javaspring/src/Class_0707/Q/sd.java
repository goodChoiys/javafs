package Class_0707.Q;

import java.util.Scanner;

public class sd {
    public static void main(String[] args) {
        System.out.println("번호를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int array[] = { 400, 340, 170, 100, 70 };
        int buger1 = sc.nextInt();
        int buger2 = sc.nextInt();

        int result = array[buger1] + array[buger2];

        if (result <= 500) {
            System.out.println("no angry");
        } else {
            System.out.println("angry");
        }
    }
}
