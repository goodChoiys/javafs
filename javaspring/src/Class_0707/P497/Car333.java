package Class_0707.P497;

public class Car333 {
    public static void main(String[] args) {
        Car3 car01 = new Car3();
        Car3 car02 = new Car3();

        System.out.println(car01.toString());
        System.out.println(car02.toString());
        System.out.println(car01.equals(car02));

        car01 = car02; // 두 참조 변수가 같은 주소를 가리킴.
        System.out.println(car01.equals(car02));
    }
}
