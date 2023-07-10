package Class_0710;

public class A3_Main1 implements A1_Dog, A2_Cat {
    public static void main(String[] args) {
        A3_Main1 main = new A3_Main1();
        main.crying();
        main.one();
        main.two();
    }

    // 인터페이스를 사용하면 다중 상속이 가능하다.

    @Override
    public void crying() {
        System.out.println("월월");
    }

    @Override
    public void one() {
        System.out.println("One");
    }

    @Override
    public void two() {
        System.out.println("Two");
    }

}
