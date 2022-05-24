package com.project.exp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Exception-Lesson0}
 * @Date: {2022/05/16 && 10:34 PM}
 */
public class DateException {
    public static void main(String[] args) {
        showMeMethod();
    }

    public static void showMeMethod(){
        System.out.println("Please enter the time: >  ");
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

        // step-1 try = catch
        try {
            Date date = simpleDateFormat.parse(scanner.nextLine());
            System.out.println(date);

        } catch (ParseException e){
            e.printStackTrace();
        }


        // step-2. using throw
      //  Date date2 = simpleDateFormat.parse(scanner.nextLine());

    }
}
