package Overloading_Overriding;

public class Overloading {
    // 이름이 cat인 메소드
    void mean() {
        System.out.println("매개변수 없음");
    }

    void mean(int a, int b) {
        System.out.println("매개변수:" + a + "," + b);
    }

    void mean(String c) {
        System.out.println("매개변수:" + c);
    }
}
