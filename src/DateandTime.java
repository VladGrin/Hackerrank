import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateandTime {

    public static String getDay(String day, String month, String year){


//        LocalDate dt = LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
//        return dt.getDayOfWeek().toString();
        Calendar calendar = new GregorianCalendar(Integer.parseInt(year),Integer.parseInt(month)-1,Integer.parseInt(day));
        switch (calendar.get(Calendar.DAY_OF_WEEK)){
            case 1 :
                return "SUNDAY"; //SUNDAY
            case 2 :
                return "MONDAY";//MONDAY
            case 3 :
                return "TUESDAY";//TUESDAY
            case 4 :
                return "WEDNESDAY";//WEDNESDAY
            case 5 :
                return "THURSDAY";//THURSDAY
            case 6 :
                return "FRIDAY";//FRIDAY
            case 7 :
                return "SATURDAY";//SATURDAY
        }
        return "";
    }

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            String month = in.next();
            String day = in.next();
            String year = in.next();

            System.out.println(getDay(day, month, year));
        }
    }
}
