public class Datatype1 {
    public static void main(String[] args) {
        byte num1 = 127;
        byte num2 = -128;
        System.out.println(num1);
        System.out.println(num2);
        /* byte 는 1byte를 뜻하고 -128 ~ 127 */
        /* short 는 2byte -32768 ~ 32767 */
        /* int 4byte -2.3147.483.648~2.3147.483.647 */
        /* long 8byte -9223372036854780000 ~ 9223372036854780000 */
        num1++;
        num2--;
        System.out.println(num1);
        System.out.println(num2);
        /*
         * byte의 경우 표기 가능한 숫자 범위가 -128 ~ 127 까지라 128과 -129를 표현할수없어
         * 반전된 값이 출력됨
         */
    }
}
