package Class_0714.P710;

public class Person {

    public void ordering(Comparable comparable) {
        String a = "홍길동";
        String b = "김길동";
        /* String a = "a";
        String b = "A"; */

        int result = comparable.compare(a, b);

        if (result < 0) {
            System.out.println(a + "은 " + b + "보다 앞에 옵니다.");
        } else if (result == 0) {
            System.out.println(a + "은 " + b + "과 같습니다.");
        } else {
            System.out.println(a + "은 " + b + "보다 뒤에 옵니다.");
        }
    }
}
