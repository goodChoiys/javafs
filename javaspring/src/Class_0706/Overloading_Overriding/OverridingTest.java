package Overloading_Overriding;

public class OverridingTest {
    public static void main(String[] args) {
        Job job = new Job();

        // 부모클래스를 상속받았으므로 자식클래스 내 별도 선언 없이 부모클래스 내 멤버변수에 접근 가능
        job.name = "유리";
        job.age = 20;
        job.job = "프로그래머";

        // 호출
        job.info();

        // (중요) 실행결과 : 여자의 직업은 프로그래머입니다.
    }
}
