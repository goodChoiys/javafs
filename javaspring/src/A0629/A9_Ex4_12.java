package A0629;
public class A9_Ex4_12 {
    public static void main(String[] args) {
        int i = 5;

        while(i--!=0) {
            //i-- 후위형이므로 조건식 평가된후에 i값이 감소
            System.out.println(i + " - I can do it.");
        }
    }
}
