import java.util.Calendar;

public class Calendar01 {

    public static void main(String[] args) {
        Calendar time = Calendar.getInstance();
        System.out.println(time.getTime());

        time.add(Calendar.SECOND, 120);
        System.out.println(time.getTime());
    }
}
