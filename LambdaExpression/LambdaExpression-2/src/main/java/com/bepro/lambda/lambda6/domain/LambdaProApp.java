package com.bepro.lambda.lambda6.domain;


import com.bepro.lambda.lambda6.service.Expression;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/14 && 4:30 PM}
 */
public class LambdaProApp {

    public static void main(String[] args) {
        Expression expression = (n) -> n%2 ==0;

        int[] nums = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println(sum(nums, (n) -> n%2 ==0));

        //Expression expression1 = ExpressionHelper::isPositive;
       // System.out.println(sum(nums, expression1));
    }

    public static int sum(int[] numbers, Expression func){
        int result =0;
        for (int i: numbers){
            if(func.isEqual(i))
                result+=i;
        }
        return result;
    }
}
