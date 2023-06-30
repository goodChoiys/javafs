package A0628;

public class A3_Ex3_10 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000; /* int형식으로 계산됨 */
        long b = 1_000_000 * 1_000_000L;
        long c = 1000000L * 1000000;
        long d = 1000000 * 1000000;

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);

    }
}
