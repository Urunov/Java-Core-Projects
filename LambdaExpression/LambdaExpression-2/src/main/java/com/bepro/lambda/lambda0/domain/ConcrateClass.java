package com.bepro.lambda.lambda0.domain;

import com.bepro.lambda.lambda0.service.Calculate;
import com.bepro.lambda.lambda0.service.ShowUs;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LambdaExpression-2}
 * @Date: {2022/04/19 && 12:15 PM}
 */
public class ConcrateClass implements ShowUs, Calculate {


    @Override
    public void showMe() {
        System.out.println("Show me ...");
    }

    @Override
    public void tellMe() {
        System.out.println("Tell me....");
    }

    @Override
    public int calculate(int num1, int num2) {
        return num1 * num2;
    }
}
