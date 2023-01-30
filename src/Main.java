import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        LocalDateTime currentDateTime = LocalDateTime.now();

        int dayOfMonth= currentDateTime.getDayOfMonth();
String monthName = currentDateTime.getMonth().toString();


           int year = currentDateTime.getYear() %100;
           int hour = currentDateTime.getHour();
           int minute = currentDateTime.getMinute();


        System.out.println(String.format("%d %s" + dayOfMonth, monthName, year, hour, minute));

    }
}