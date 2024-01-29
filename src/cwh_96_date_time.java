import java.util.Calendar;
import java.util.TimeZone;

public class cwh_96_date_time {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
//        Calendar c= Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
        Calendar c= Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone().getID());

    }
}
