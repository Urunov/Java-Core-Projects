package com.bepro.lambda.lambda5;

import com.bepro.lambda.lambda5.tasks.Task10;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LambdaExpression-3}
 * @Date: {2022/04/21 && 1:17 PM}
 */
public class MainClass {
    public static void main(String[] args) {

        // Task10: Lambda expression. Find vowel.
        Task10 task10 = text -> {
            char ch;
            int count = 0; 
            for (int i = 0; i < text.length(); i++) {
                ch = text.toUpperCase().charAt(i);
                if (ch=='A' || ch=='E' || ch=='I' || ch=='U' || ch=='O' || ch =='Y'){
                    count++;
                }
            }
            return count;
        };

        System.out.println(task10.countVowel("Undercontrol our job."));
        System.out.println(task10.countVowel("Pat"));
    }
}
