package Study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.printf("%d\n%d\n%d\n%d\n%d\n", a + b, a - b, a * b, a / b, a % b);
    }
}
