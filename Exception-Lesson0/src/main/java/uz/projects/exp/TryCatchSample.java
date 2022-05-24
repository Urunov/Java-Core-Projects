package uz.projects.exp;

import java.util.Scanner;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Exception-Lesson0}
 * @Date: {2022/05/16 && 6:44 PM}
 */
public class TryCatchSample {
    //
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // step-0: try - catch ....

       try {
            System.out.println("Enter num1: ");
            int num1 = scanner.nextInt();
            if (num1<0){
                System.out.println("Please enter your number again.");

            }
            System.out.println("Enter num2: ");
            int num2 = scanner.nextInt();
            int result  = num1 + num2;
            System.out.println(result);
            } catch(Exception e) {
            // e.printStackTrace(); // Original exception.
            //  e.printStackTrace();

              System.err.println("Hey error ... " + e);
            }
        // step-1. Array
        int [] massive = new int[5]; // 0 .. 4

        try {
            int number = massive[5];
                //this statement will never execute
               // as exception is raised by above statement
            System.out.println("Inside  try block ." + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception caught in catch block. " + e);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        finally {
            System.out.println("Finally block excuted ");
        }

        // rest program will be executed.
        System.out.println("Outside try-catch-finally clause.");
    }
}
