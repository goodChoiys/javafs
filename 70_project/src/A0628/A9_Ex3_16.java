package A0628;

public class A9_Ex3_16 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';

        System.out.printf("b=%b%n", b); //true 
        System.out.printf("!b=%b%n", !b); //false
        System.out.printf("!!b=%b%n", !!b); //true 
        System.out.printf("!!!b=%b%n", !!!b); //false
        System.out.println();

        System.out.printf("ch=%c%n", ch); //c% 한개의 문자 C
        System.out.printf("ch < 'a' || ch > 'z' = %b%n", ch < 'a' || ch > 'z');
        // true 소문자 a 는 아스키 코드값이 97 대문자 C 는 67, ch < 'a'참 이므로 true
        System.out.printf("!('a'<=ch && ch<= 'z')=%b%n", !('a' <= ch && ch <= 'z'));
        // true
        System.out.printf("'a'<=ch && ch<='z' =%b%n", 'a' <= ch && ch <= 'z');
        // false && 앞뒤에 둘 다 식이 참이여야만 true
        // false || 앞뒤에 둘 중 하나만 참이면 결과값 참

    } // main의 끝
}
