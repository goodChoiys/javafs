package Class_0703;

public class A9_SubString {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6); // index번호 0 부터 6번째까지
        System.out.println(firstNum);

        String secondNum = ssn.substring(7); // index번호 7 부터 끝까지
        System.out.println(secondNum);
    }
}
