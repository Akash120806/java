public class Time {
    public static void main(String[] args) {
        // the time in the time function is always give in milliseconds from the year 1970  and we can change it to days year seconds hours
        long milliseconds= System.currentTimeMillis();
        long seconds=milliseconds/1000;
        long hours= seconds/3600;
        long day=hours/24; 
        long year=day/365;
        System.out.println(milliseconds);
        System.out.println(seconds);
        System.out.println(hours);
        System.out.println(day);
        System.out.println(year);
    }
    
}
