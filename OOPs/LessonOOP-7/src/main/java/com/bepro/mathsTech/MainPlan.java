package com.bepro.mathsTech;

import java.sql.SQLOutput;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Polymorphism}
 * @Date: {2022/04/06 && 10:08 PM}
 */
public class MainPlan {
    public static void main(String[] args) {

        // non-static method call :
        MathSample mathSample = new MathSample();
        mathSample.add(4, 3);

        System.out.println(mathSample.addAll(2, 44));

        /// --------------------------

        // we can call static method:
        MathSample.add(3,4);
        MathSample.add(5.9, 8.9);
        MathSample.add(3, 4);
        MathSample.add(43.2, 22.2, 32.2);

        MathSample sample = new MathSample();
        System.out.println(sample.addAll(3, 4));
        // -----------------------------------

    }
}
