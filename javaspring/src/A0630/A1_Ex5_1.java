package A0630;

import java.util.Arrays;

public class A1_Ex5_1 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = { 100, 95, 80, 70, 60 };
        char[] chArr = { 'a', 'b', 'c', 'd' };

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1; // 1 ~ 10까지의 숫자를 순서대로 배열에 대입(저장)한다.

        }

        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random() * 10) + 1;
            System.out.print(iArr1[i] + ","); // 1,2,3,4,5,6,7,8,9,10,
        }

        System.out.printf("%n%d,%d,%d,%d,%d%n", iArr1[0], iArr1[1], iArr1[2], iArr1[3], iArr1[4]); // 1,2,3,4,5


        System.out.println();

        System.out.println(Arrays.toString(iArr2)); // [9, 2, 2, 7, 5, 9, 4, 4, 2, 2]
        //Arrays.toString() - 배열을 문자열로 변환
        System.out.println(Arrays.toString(iArr3)); // [100, 95, 80, 70, 60]
        System.out.println(Arrays.toString(chArr)); // [a, b, c, d]
        System.out.println(iArr3); // [I@2a18f23c iArr3의 주소
        System.out.println(chArr);
    }
}
