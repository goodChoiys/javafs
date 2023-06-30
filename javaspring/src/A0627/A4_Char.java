package A0627;

public class A4_Char {
    public static void main(String[] args) {

        int a = 65;
        int b = -66;
        char a2 = 65;
        // char b2 = -66; 에러 남
        char a3 = 97;
        System.out.println((char) a);
        System.out.println((char) b); // -66은 유효한 문자 코드가 아님
        System.out.println((char) a2);
        System.out.println((char) a3);

    }
}