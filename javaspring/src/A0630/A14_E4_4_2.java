package A0630;


public class A14_E4_4_2 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int num = 0;

        for (int i = 1; sum < 100; i++, s = -s) {
            num = i * s;
            sum += num;
        }
        
        System.out.println("num=" + num); // 결과 : num=199
        System.out.println("sum=" + sum); // 결과 : sum=100
    }
}
