package A0629;
import java.util.Scanner;

public class A16_Book4_138_3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.printf("1부터 100까지 3의 배수 총 합계는 %d%n", sum);

    }

}