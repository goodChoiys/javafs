package Quiz;

import java.util.Scanner;

public class Ex100_43 {

    public static String convert(String money) {
        String[] han1 = { "", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
        String[] han2 = { "", "십", "백", "천" };
        String[] han3 = { "", "만", "억", "조", "경" };

        StringBuffer result = new StringBuffer();
        int leng = money.length();
        int initInt = 0;

        for (int i = leng - 1; i >= 0; i--) {
            initInt = Integer.parseInt(String.valueOf(money.charAt(leng - i - 1)));

            if (initInt > 0) {
                result.append(han1[initInt]);
                result.append(han2[i % 4]); // 십,백,천

            }
            // 만, 억, 조 ,경 단위
            if (i % 4 == 0) {
                result.append(han3[i / 4]); // 천단위
                result.append("");
            }

        }
        return result.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String don = scan.next();
        System.out.print(Ex100_43.convert(don));
    }

}
