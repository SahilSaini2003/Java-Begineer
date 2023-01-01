import java.util.Date;

public class P29_DateTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); // Returns Millisecond Passed Since 1 Jan 1970
        System.out.println(System.currentTimeMillis()/1000); // Returns Second Passed Since 1 Jan 1970
        System.out.println(System.currentTimeMillis()/1000/3600); // Returns Hour Passed Since 1 Jan 1970
        System.out.println(System.currentTimeMillis()/1000/3600/24); // Returns Days Passed Since 1 Jan 1970
        System.out.println(System.currentTimeMillis()/1000/3600/24/30); // Returns Month Passed Since 1 Jan 1970
        System.out.println(System.currentTimeMillis()/1000/3600/24/366); // Returns Years Passed Since 1 Jan 1970
        Date a = new Date();
        System.out.println(a);
        System.out.println(a.getTime());
        // System.out.println(a.getYear());
        // System.out.println(a.getDate());
        
    }
}
