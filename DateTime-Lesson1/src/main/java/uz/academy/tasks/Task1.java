package uz.academy.tasks;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {DateTime-Lesson1}
 * @Date: {2022/05/12 && 5:26 PM}
 */
public class Task1 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter YEAR: ");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, scanner.nextInt());

        //
        if (calendar.getActualMaximum(Calendar.YEAR) ==366){
            System.out.println("LEAP YEAR");
        } else{
            System.out.println("NOT LEAP YEAR");
        }



    }
}
