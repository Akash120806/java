import java.util.*;
public class Calender {
    public static void main(String[] args) {
        Calendar cal= Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(cal.getTimeZone());
       // System.out.println(cal.getInstance());
        System.out.println(cal.getCalendarType());
        System.out.println(cal.getFirstDayOfWeek());
    }
    
}
