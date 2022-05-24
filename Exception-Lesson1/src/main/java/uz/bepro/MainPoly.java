package uz.bepro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Exception-Lesson1}
 * @Date: {2022/05/14 && 9:32 AM}
 */
public class MainPoly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try{
            Date date = simpleDateFormat.parse(scanner.nextLine());
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
    public static void sixthMethod(){
        throw new NumberFormatException();
    }
}
