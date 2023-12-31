import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        LocalDate myObj = LocalDate.now();
        LocalTime myObj1 = LocalTime.now();
        LocalDateTime myObj2 = LocalDateTime.now();
        DateTimeFormatter myObj3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myObj2.format(myObj3);
        System.out.println(formattedDate);
        System.out.println(myObj2);
        System.out.println(myObj1);
        System.out.println(myObj);
    }
}
