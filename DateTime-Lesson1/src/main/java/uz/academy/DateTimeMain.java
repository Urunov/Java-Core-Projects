package uz.academy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Company: {DavrBank}
 * @Author: {urunov}
 * @Project: {DateTime-Lesson1}
 * @Date: {2022/05/12 && 8:58 AM}
 */
public class DateTimeMain {
    public static void main(String[] args) throws ParseException {

        // STEP-0: CALENDAR

        Calendar calendarG = new GregorianCalendar();
        System.out.println("> "+ calendarG);


        Calendar calendar1 = Calendar.getInstance();
        System.out.println(calendar1);


        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);

        System.out.println(calendar.getTimeInMillis()); // mill Second

        // offset - time zone
        System.out.println("Day of week: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Day of month: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of year: " + calendar.get(Calendar.DAY_OF_YEAR));

        System.out.println("Day of Week in month: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        System.out.println("Hour " + calendar.get(Calendar.HOUR));
        System.out.println("Minute " + calendar.get(Calendar.MINUTE));
        System.out.println("second " + calendar.get(Calendar.SECOND));
        System.out.println("AM " + calendar.get(Calendar.AM));
       // System.out.println("PM " + calendar.get(Calendar.PM));
        System.out.println("HOUR_OF_DAY " + calendar.get(Calendar.HOUR_OF_DAY));

        // Index and Value. SET AND GET
        System.out.println("Day: " + calendar.get(1));
        System.out.println("DATE  ");
        System.out.println(calendar.get(Calendar.DATE));

        System.out.println(" DATE Index: " + calendar.get(1)); // YEAR
        calendar.setMinimalDaysInFirstWeek(3);

        calendar.set(1, 2001); // YEAR = 1 , 2022 --> 2001
        System.out.println(calendar.get(1));

        calendar.set(2005, 13,12);

        System.out.println("YEAR >> "+calendar.get(1));
        System.out.println("Month: " + calendar.get(2));

        // step-1: ADD method

        System.out.println("Original Time: " + calendar.get(1));
        calendar.add(Calendar.MONTH, 12);
        System.out.println("Update Time: "+ calendar.get(2));

        // step-2: date
        Date dateT = new Date();
        System.out.println("current time: " + dateT);
        System.out.println("TIME: >>>> "+dateT.getTime());

        // Clock
        Clock c = Clock.systemUTC();
        System.out.println(c.instant());
        Duration d = Duration.ofHours(5);
        Clock clock = Clock.offset(c, d);
        System.out.println("Clock: " + clock.instant());


        Date dateTime = new Date(1652371048458l);
        System.out.println("Changeable time: "+ dateTime);


        // step-3: SimpleDateFormat
        Date dateSimple = new Date();
        // \t - tab \n - new
        SimpleDateFormat dateFormat = new SimpleDateFormat("' Sana: 'dd-yyyy-MM  \t 'Time: ' hh:mm:ss");
        System.out.println(dateSimple);
        System.out.println("Formatlangan date: ");
        System.out.println(dateFormat.format(dateSimple));

        // step-4:
        try {
            Date date1 = dateFormat.parse(" 05:21:57");
            System.out.println(date1.getTime());
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
