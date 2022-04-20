package com.bepro.lambda.lambda4;

import com.bepro.lambda.lambda4.service.GenericInterface;
import com.bepro.lambda.lambda4.service.GenericInterfaceMore;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LambdaExpression-2}
 * @Date: {2022/04/19 && 10:09 PM}
 */
public class MainPoly {
    public static void main(String[] args) {
        //
        // Generic Interface: 2 parameters.
        GenericInterface<String> addNumber1 = (number, number1) -> number + number1;
        GenericInterface<Integer> addNumber = (number, number1) -> number + number1;
        GenericInterface<Double> addNumber2 = (number, number1) -> number + number1;

        System.out.println(addNumber.add(4, 3333));
        System.out.println(addNumber1.add("5", "22"));
        System.out.println(addNumber.add(3, 2));
        System.out.println("Double: " + addNumber2.add(4.5, 33.3));

        // GENERIC more
        GenericInterfaceMore<Integer, String> genericInterfaceMore = (a, b) -> Integer.valueOf(a + b);
        System.out.println(genericInterfaceMore.add(4, "3"));
    }
}
// int, boolean, double --> primitve
// Integer, Double, String, Char, Boolean
/*
*  Generic Type;
* Only use Objective type. Cannot use primitive type.
*
* */