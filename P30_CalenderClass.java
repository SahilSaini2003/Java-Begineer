import java.util.Calendar;
import java.util.GregorianCalendar;

public class P30_CalenderClass {
    public static void main(String[] args) {
        Calendar a = Calendar.getInstance();
        System.out.println(a);
        System.out.println(a.getCalendarType());
        System.out.println(a.getTimeZone());
        System.out.println(a.getTimeZone().getID());
        System.out.println(a.getMinimalDaysInFirstWeek());
        System.out.println(a.get(Calendar.SECOND));
        System.out.println(a.get(Calendar.MONTH));
        System.out.println("Date:- " + a.get(Calendar.DATE) + " : " + a.get(Calendar.MONTH) + " : " + a.get(Calendar.YEAR));

        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g);
        System.out.println(g.isLeapYear(2000));
        System.out.println(g.isLeapYear(1900));
        System.out.println(g.getTime());
        System.out.println(a.getWeekYear());
    }
}
