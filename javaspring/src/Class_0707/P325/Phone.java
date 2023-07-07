package Class_0707.P325;

public class Phone {
    // 필드 선언
    String owner;

    // 생성자 선언
    Phone(String owner) {
        this.owner = owner;
    }

    // 메소드 선언
    void turnOn() {
        System.out.println("폰 전원을 킵니다.");
    }

    void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
