package uz.bepro.project;

import java.util.Scanner;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lessons}
 * @Date: {2022/04/03 && 12:03 AM}
 */
public class MainClass {
    public static void main(String[] args) {


        ZarplataControl zarplataControl = new ZarplataControl();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter zarplata:  ");

        zarplataControl.zarplataLogic(scanner.nextDouble());


//        zarplataControl.setZarplata(7077.5);
//        System.out.println("   --> " + zarplataControl.getZarplata());

        Integer intas = new Integer(5);
        intas.intValue();

        
    }
}
