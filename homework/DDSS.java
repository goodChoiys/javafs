package homework;

import java.util.Scanner;

public class DDSS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int H = scan.nextInt();
        int M = scan.nextInt();

        if (M < 45) {
            if (H == 0) {
                H = 23;
            } else {
                H--;
            }
            M = M - 45 + 60;
        } else {
            M -= 45;
        }

        System.out.println(H + " " + M);
    }
}
