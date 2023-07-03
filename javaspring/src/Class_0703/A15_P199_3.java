package Class_0703;

public class A15_P199_3 {
    public static void main(String[] args) {
        int sum = 0;
        double avg = 0.0;
        int cnt = 0;

        int[][] array = {
                { 95, 86 },
                { 83, 92, 96 },
                { 78, 83, 87, 88 }
        };

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
            cnt = cnt + array[i].length;
        }
        avg = (double) sum / cnt;
        System.out.println("전체 합 : " + sum);
        System.out.println("평균 : " + avg);

    }
}
