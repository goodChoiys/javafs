package Class_0714.LambdaExample;

//어노테이션
@FunctionalInterface // 함수형 인터페이스
public interface Calculable {
    // 추상 메소드
    void calculate(int x, int y);
}