package Class_0707;

public class Main10 {

    public static void main(String[] args) {
        Archer archer = new Archer("궁수", "상");
        Archer archer2 = new Archer("궁수", "상");
        System.out.println(archer == archer2);
        System.out.println(archer.equals(archer2));
    }

}
