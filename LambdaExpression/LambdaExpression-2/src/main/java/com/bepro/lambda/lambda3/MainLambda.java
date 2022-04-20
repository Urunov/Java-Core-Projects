package com.bepro.lambda.lambda3;

import com.bepro.lambda.lambda3.services.Task6ExistNumber;
import com.bepro.lambda.lambda3.services.Task1Position;
import com.bepro.lambda.lambda3.services.Task9String;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LambdaExpression-2}
 * @Date: {2022/04/19 && 6:50 PM}
 */
public class MainLambda {
    public static void main(String[] args) {

        // Task1. Number
        Task1Position taskPlus = (number) -> {
            if (number>0){
                System.out.println("Number is positive");
            }else if (number<0){
                System.out.println("Number is negative");
            } else{
                System.out.println("Number is 0");
            }
        };

        taskPlus.defineSign(-33);
        taskPlus.defineSign(32);
        taskPlus.defineSign(0);


        // Task-4 Existing number.
        Task6ExistNumber existNumber = (nums, number) -> {
            // nums.length --> razmer massiv,

            for (int i = 0; i < nums.length; i++) {
                if (nums[i]==number){
                   System.out.println("Yes number");
                    return true;
                } else{
                }
            }
            System.out.println("No number");
            return false;
        };

        int[] ars = {4, 3, 5, 22, 44, 21, 16};
        System.out.println("----- Task 4 --------");

        System.out.println(existNumber.isExists(ars, 4));
        System.out.println(existNumber.isExists(ars, 13));

        // Task-9.
        System.out.println("----- Task 9 --------");
        Task9String task1 = (s1, s2) -> s1.contains(s2); // Lambda expression. String contains
        Task9String task2 = String::contains; // Reference

        System.out.println(task1.isContain("Hey", "Good"));
        System.out.println(task2.isContain("MyGood", "Good"));

        System.out.println(task1.isContain("Ozod bratishka ", "Ozod"));

        System.out.println(task2.isContain("ramazon", "zon"));

    }
}
