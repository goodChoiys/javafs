import java.util.Calendar;

public class Calendar02 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        // 월이 0부터 시작되므로 1을 더해 1부터 시작되도록 한다.
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Current Date: " + year + " " + month + " " + day);
    }
}
