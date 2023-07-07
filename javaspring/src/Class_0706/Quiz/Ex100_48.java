package Quiz;

import java.util.Scanner;

public class Ex100_48 {

    public static void main(String[] args) {

        int[] num = new int[4];
        boolean tt = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("주민등록번호 앞의 6자리를 입력해주세요");
        int infomation = scanner.nextInt();
        System.out.println("주민등록번호 뒤의 1자리를 입력해주세요");
        int Gender = scanner.nextInt();

        while (tt) {
            if (((infomation / 10000) > 18) && (Gender == 1)) {
                int j = (-((infomation / 10000) - 100)) + 23;
                System.out.println("입력하신 정보의 성별은 남성이며, 나이는 " + j + "세 입니다.\n");
                tt = false;

            } else if (((infomation / 10000) > 23) && (Gender == 2)) {
                int j = (-((infomation / 10000) - 100)) + 23;
                System.out.println("입력하신 정보의  성별은 여성이며, 나이는 " + j + "세 입니다.\n");
                tt = false;

            } else if (((infomation / 10000) <= 23) && (Gender == 3)) {
                int j = (infomation / 10000) + 23;
                System.out.println("입력하신 정보의  성별은 남성이며, 나이는 " + j + "세 입니다.\n");
                tt = false;

            } else if (((infomation / 10000) <= 23) && (Gender == 4)) {
                int j = (infomation / 10000) + 23;
                System.out.println("입력하신 정보의  성별은 여성이며, 나이는 " + j + "세 입니다.\n");
                tt = false;

            } else {
                System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요.");
                return;
            }
        }

    }
}
