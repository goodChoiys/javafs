package Study;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String id = "abc";
        String warnning = "??!";
        boolean run = true;

        while (run) {
            System.out.println("아이디를 입력하세요.");
            String info = input.next();
            id = info;
            if (id == info) {
                System.out.printf("%d%d", id, warnning);
                run = false;
            }
        }
    }
}
