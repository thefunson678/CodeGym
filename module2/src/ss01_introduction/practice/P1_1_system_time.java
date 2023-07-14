package ss01_introduction.practice;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class P1_1_system_time {
    public static void main(String[] args) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        LocalDate now = LocalDate.now();
        System.out.println(String.format("System time: %s/%s/%s",now.getYear(), now.getMonthValue(), now.getDayOfMonth()));
//        Date time1 = new Date();
//        System.out.println("System Time: " + dateFormat.format(time1.getTime()));
//        System.out.printf("System Time: %1$ty/%1$tm/%1$td %n", time1);

    }
}
