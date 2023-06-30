package A0629;
import java.util.Scanner;

public class A15_Book4_continue_137 {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}