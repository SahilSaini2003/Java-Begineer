import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
/**
 * @author Sahil (Saini)
 * @version 0.1
 * @since 2000
 * @see <a href = "https://docs.oracle.com/en/java/javase/19/docs/api/index.html">Java Docs</a>
 */
public class P31_TimeClasss {
    public static void main(String[] args) {
        LocalDate a = LocalDate.now();
        System.out.println(a);
        LocalTime b = LocalTime.now();
        System.out.println(b);
        
        LocalDateTime c = LocalDateTime.now();
        System.out.println(c);

        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
        String dt = c.format(d);
        System.out.println(dt);
    }
}
