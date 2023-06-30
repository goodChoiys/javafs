package A0629;
import java.util.Scanner;

public class A17_Book4_138_4 {
    public static void main(String[] args) throws Exception {

        System.out.print("주사위를 굴리세요.>");

        while (true) {
            int diceA = (int) (Math.random() * 6) + 1;
            int diceB = (int) (Math.random() * 6) + 1;
            System.out.println("(" + diceA + "," + diceB + ")");
            if ((diceA + diceB) == 5) {
                break;
            }
        }
        System.out.println("정답 입니다.");
    }

}