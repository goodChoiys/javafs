package A0628;

public class A1_Ex3_6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        System.out.println();
        System.out.printf("%d + %d = %d%n", a, b, a + b); /* %n은 줄바꿈 */
        System.out.printf("%d + %d = %d%n", a, b, a - b);
        System.out.printf("%d + %d = %d%n", a, b, a * b);
        System.out.printf("%d + %d = %d%n", a, b, a / b);
        System.out.printf("%d + %f = %f%n", a, (float) b, a / (float) b); /* 소숫점으로 표기 */
    }

}
