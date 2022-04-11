package uz.bepro.oop.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-8}
 * @Date: {2022/04/09 && 7:48 PM}
 */
public class YearDate {
    //
    public int day;
    public int month;
    public int year;

    public void printDate(){
        System.out.println((day<10 ? "0" + day: day)+ "." + (month<10 ? "0" + month: month) + "."+ (year<10 ? "00" + year: year ));
    }
}
