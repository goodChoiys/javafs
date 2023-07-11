package Class_0711;

public class Wrapper03 {
    public static void main(String[] args) {
        // -128~127 초과값일 경우
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("==: " + (obj1 == obj2));
        System.out.println("equals():" + obj1.equals(obj2));
        System.out.println();

        // -128~127 범위값일 경우
        Integer obj3 = 10;
        // -128 에서 127 사이의 값인경우에만 == 연산자로 비교 시 true가 나올 수 있다.
        Integer obj4 = 10;
        System.out.println("==: " + (obj3 == obj4));
        System.out.println("equals:" + obj3.equals(obj4));

    }
}
