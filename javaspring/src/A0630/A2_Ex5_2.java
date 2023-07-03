package A0630;


public class A2_Ex5_2 {
    public static void main(String[] args) {
        int sum = 0; // 총점을 저장하기 위한 변수
        float average = 0f; // 평균을 저장하기 위한 변수

        int[] score = { 100, 88, 100, 100, 90 };

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float) score.length; // int형으로 선언된 값을 연산할때 (float)를 적용하여 결과값이 실수로 나오게끔 만들 수 있다.

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
    }
}
