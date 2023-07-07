package Class_0705;

public class HeroTest {
    public static void main(String[] args) {
        // ① 생성자 호출, 두 Hero 객체 만들기
        Hero ironMan = new Hero("아이언맨", 100, 120);
        Hero hurk = new Hero("헐크", 200, 80);

        // ② 생성자 정보 출력
        System.out.println(ironMan.toStr());
        System.out.println(hurk.toStr());
    }
}

class Hero {
    String name; // 이름
    int power; // 힘
    int speed; // 속도
    // 생성자 정의

    Hero(String n, int p, int s) {
        name = n;
        power = p;
        speed = s;
    }

    // 객체 정보를 문자열로 변환
    String toStr() {
        return String.format("Hero{name: %s, power: %d, speed: %d}", name, power, speed);
    }
}