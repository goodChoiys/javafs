package Class_0705;

public class A1_Ex_7_1 {
    public static void main(String[] args) {
        // 객체 생성
        Cat c = new Cat();
        // 클래스 타입 레퍼런스 변수명(참조변수명)에 연결
        // 객체 상태(필드) 변경
        c.name = "네로";
        c.breeds = "페르시안";
        c.weight = 4.37;
        // 객체 상태(필드) 출력
        System.out.printf("이름: %s\n", c.name);
        System.out.printf("품종: %s\n", c.breeds);
        System.out.printf("체중: %.2fkg\n ", c.weight);
    }
}

class Cat {
    // 객체 속에 존재하는 필드 - 인스턴스 변수(iv) 또는 멤버변수(3개)
    String name; // 이름
    String breeds; // 품종
    double weight; // 체중

    // 메서드 2개
    void claw() {
        System.out.println("할퀴기!!");
    }

    void meow() {
        System.out.println("야옹~");
    }

}