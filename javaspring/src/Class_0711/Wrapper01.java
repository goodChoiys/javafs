package Class_0711;

public class Wrapper01 {
    public static void main(String[] args) {
        // Integer num = new Integer(17); // 박싱 -Java8 까지
        Integer num = Integer.valueOf(17); // Jaba9 부터 박싱 방법
        int n = num.intValue();
        System.out.println(n);

        Character ch = 'X'; // Character ch =new Character('X'); : 오토박싱
        char c = ch; // char c = ch.charValue(); : 오토언박싱
        System.out.println(c);
    }
}
