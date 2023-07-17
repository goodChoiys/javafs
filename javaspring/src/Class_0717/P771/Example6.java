package Class_0717.P771;

import java.util.Arrays;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(new Member("홍길동",  30) ,new Member("신용권" , 40 ),new Member("감자바 ", 26));

        double avg = list.stream()
        .mapToInt(Member::getAge) // Member 객체의 나이(age)를 int값으로 매핑
        .average() // .average() 메소드를 호출하여 스트림 요소의 평균 값 구한다.
        // .orElse(0.0); // 기본값 설정 (예외 발생 시 0.0 반환)
        .getAsDouble(); // 가지고온 평균값을 실수(double) 타입으로 가져온다.
        System.out.println("평균 나이: " + avg);
    }
}
