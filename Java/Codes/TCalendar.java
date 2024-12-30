import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        // System.out.println(c.getTime());
        // System.out.println(c.getTimeZone());
        // System.out.println(c.get(Calendar.DATE));
        // System.out.println(c.get(Calendar.SECOND));
        // System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        Scanner sc = new Scanner(System.in);
        GregorianCalendar g = new GregorianCalendar();
        System.out.println("Enter the YEar ");
        int n = sc.nextInt();
        System.out.println(g.isLeapYear(n));
    }
}
