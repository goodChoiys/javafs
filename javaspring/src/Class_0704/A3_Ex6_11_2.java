package Class_0704;

public class A3_Ex6_11_2 {
    public static void main(String[] args) {
        Carss c1 = new Carss("white", "hybride", "auto", 4);
        Carss c2 = new Carss("gray", "disel", "manual", 6);
        Carss c3 = new Carss();

        c3.color = "orange";
        c3.fuerType = "gasolin";
        c3.gearType = "manual";
        c3.door = 3;

        System.out.println("c1의 color: " + c1.color + ", fuerType: " + c1.fuerType + ", gearType: " + c1.gearType
                + ", door: " + c1.door);
        System.out.println("c2의 color: " + c2.color + ", fuerType: " + c2.fuerType + ", gearType: " + c2.gearType
                + ", door: " + c2.door);
    }
}

class Carss {
    String color;
    String fuerType;
    String gearType;
    int door;

    Carss() {
    }

    Carss(String color, String b, String c, int d) {

        this.color = color;
        fuerType = b;
        gearType = c;
        door = d;

    }

    // 인스턴스변수의 초기화
    // 생성자의 이름은 클래스의 이름과 같아야 한다.
    // 생성자는 리턴값이 없다.

}