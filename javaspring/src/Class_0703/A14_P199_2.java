package Class_0703;

public class A14_P199_2 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = { 1, 5, 3, 8, 2 };

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        };
        System.out.println("입력된 값중 최대 값은 " + max + " 입니다.");

    }
}
