package Overloading_Overriding;

public class OverloadingTest {
    public static void main(String[] args) {

        // OverloadingTest 객체 생성
        Overloading ot = new Overloading();

        ot.mean();

        ot.mean(2, 3);

        ot.mean("hello");
    }
}
