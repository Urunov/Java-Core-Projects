package com.project.exp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Exception-Lesson0}
 * @Date: {2022/05/16 && 10:15 PM}
 */
public class ExceptionProjects {
    public static void main(String[] args) {
        firstMethodAdd();
        secondMethod();
        thirdMethod();
    }
    public static void firstMethodAdd(){
        System.out.println("The first method.");
        Scanner scanner = new Scanner(System.in);
        int num2 = scanner.nextInt();
        int num1 = 90;
        try {
            int res = num2-num1;
            System.out.println(res);
        } catch (InputMismatchException e){
            System.err.println("===Error happend ====" + e);
        }

    }
    public static void secondMethod(){
        System.out.println("=== Second method called ===");
        Scanner scanner = new Scanner(System.in);
        int num1 = 100;
        System.out.println("Just enter number: ");
        int num2 = scanner.nextInt();

        try{
            int res = num1 /num2;
            System.out.println( num1 + " / " + num2 + " = " + res);
        } catch (ArithmeticException e){
           // System.out.println();
            e.printStackTrace();
        }
    }

    public static void thirdMethod(){
        System.out.println("----- thrid -----");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println(num * 10);
    }
}
