package com.bepro.lambda.lambda6.domain;


import com.bepro.lambda.lambda6.service.Operation;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/13 && 10:29 PM}
 */
public class LambdaExApp {

    public static void main(String[] args) {

        int n = 70;
        int m = 80;
        Operation operationable = () -> {
           // n = 100; // impossible to use
            return m + n;
        };
        //  n = 100; // impossible to use
        System.out.println(operationable.calculate());

    }
}
