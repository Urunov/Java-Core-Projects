package com.bepro.lambda.lambda6.domain;

import com.bepro.lambda.lambda6.service.Operation;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/13 && 9:33 PM}
 */
public class LambdaApp {

    static int number1 = 10;
    private static int number2=7;
    int number3 =20;

    public static void main(String []args){

        Operation op = ()->{
            number1 =30;
            number2=50;     // non-static method can use  this.

            return number1+number2;
        };

        System.out.println(op.calculate());
        System.out.println(number1);
        System.out.println(number2);
    }
}
