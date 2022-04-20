package com.bepro.lambda.lambda2;

import com.bepro.lambda.lambda2.service.MaxValue;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LambdaExpression-2}
 * @Date: {2022/04/19 && 4:02 PM}
 */
public class MainLam {
    public static void main(String[] args) {

        // 1. Lambda expression: 2 parameters
        MaxValue maksimum = (a, b) -> (a>=b) ? a : b;
        System.out.println("Max: " + maksimum.compareValues(43, 3));

        // 2. Reference value, reference variables
        // :: -- reference
        MaxValue mas = Integer::max;
        System.out.println("Max: " +mas.compareValues(4, 22));

        MaxValue minValue = Integer::min;
        System.out.println("Min: " + minValue.compareValues(4, 23));
    }
}
