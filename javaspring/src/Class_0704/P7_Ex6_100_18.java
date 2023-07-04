package Class_0704;

import java.util.Scanner;

public class P7_Ex6_100_18 {
    public static void main(String[] args) {

        /*
         * 영문자 한 개를 입력받아 아스키코드 10진수값으로 출력하는 프로그램을 작성해보자.
         * 
         * String 클래스의 charAt(index i) 메소드를 사용하여 char형 문자 한 개를 char에 입력할 수 있다. )
         * 
         * 예) String str = scanner.nextLine();
         * 
         * char c = str.charAt(0); //인덱스 0(첫번째) 문자를 가져옴.
         * 
         * 
         * 입력
         * 
         * 영문자 한 개가 입력된다.
         * 
         * 출력
         * 
         * 입력 받은 문자에 해당되는 아스키코드값을 10진수로 출력한다.
         * 
         * 
         * 
         * 입력 예시
         * 
         * A
         * 
         * 출력 예시
         * 
         * 65
         * 
         * 도움말
         * 
         * 아스키(ASCII, 미국표준코드, American Standard Code for Information Interchange) 코드표는
         * 영문자, 특수문자 등을 사용할 때 사용하는 표준 코드이다.
         * 컴퓨터로 저장되는 모든 데이터는 2진 정수화되어 저장되는데, 영문자와 특수기호 등을 저장하는 방법으로 아스키코드를 일반적으로 사용한다.
         * 예를 들어 영문 대문자 'A'는 10진수 65에 해당하는 2진수 값으로 저장된다.
         * 
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 또는 알파벳 하나를 입력하세요");
        String str = scanner.nextLine();
        char c = str.charAt(0);
        int num = c;
        System.out.println(num);
    }
}
