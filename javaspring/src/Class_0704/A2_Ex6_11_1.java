package Class_0704;

public class A2_Ex6_11_1 {
    public static void main(String[] args) {
        Cars c1 = new Cars("white", "hybride", "auto", 4);

        Cars c2 = new Cars("gray", "disel", "manual", 6);

        System.out.println("c1의 color: " + c1.color + ", fuerType: " + c1.fuerType + ", gearType: " + c1.gearType
                + ", door: " + c1.door);
        System.out.println("c2의 color: " + c2.color + ", fuerType: " + c2.fuerType + ", gearType: " + c2.gearType
                + ", door: " + c2.door);
    }
}

class Cars {
    String color;
    String fuerType;
    String gearType;
    int door;

    Cars(String a, String b, String c, int d) {

        color = a;
        fuerType = b;
        gearType = c;
        door = d;

    }

}