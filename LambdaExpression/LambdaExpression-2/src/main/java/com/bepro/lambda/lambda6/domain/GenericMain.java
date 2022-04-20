package com.bepro.lambda.lambda6.domain;

import com.bepro.lambda.lambda6.service.GenericInterface;
import com.bepro.lambda.lambda6.service.GenericTypes;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/13 && 10:37 PM}
 */
public class GenericMain {
    public static void main(String[] args) {

        GenericInterface<String> combineStr = (a, b) -> a + b;
        GenericInterface<Integer> addValue = (a, b) -> a + b;

        System.out.println(combineStr.add("helel", "Generrics"));
        System.out.println(addValue.add(5, 39));

         GenericTypes<Integer, Boolean, String> genericInterface = (a, b) -> ""+ a + b;
        System.out.println(genericInterface.addValue(4, true));
    }
}
