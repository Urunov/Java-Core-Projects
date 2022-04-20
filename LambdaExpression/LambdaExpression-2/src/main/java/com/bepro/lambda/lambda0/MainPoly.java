package com.bepro.lambda.lambda0;

import com.bepro.lambda.lambda0.domain.ConcrateClass;
import com.bepro.lambda.lambda0.domain.Matem;
import com.bepro.lambda.lambda0.service.Calculate;
import com.bepro.lambda.lambda0.service.NoParam;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LambdaExpression-2}
 * @Date: {2022/04/18 && 7:55 PM}
 */
public class MainPoly {
    public static void main(String[] args) {

        // 0. Matem class
        Matem matem = new Matem();
        System.out.println(matem.add(3, 2));

        // 1. Anonomy: Interface
        // new --> Object . Class
        Calculate cal = new Calculate() {
            @Override
            public int calculate(int num1, int num2) {
                // logic
                int sum = 0;
                sum = num1 * num2 + 9;


                return sum;

            }
        };

        System.out.println("Umnajeniya Sum : "+ cal.calculate(5, 3));

        Calculate calculate = new Calculate() {
            @Override
            public int calculate(int num1, int num2) {
                return num1 + num2;
            }
        };
        System.out.println(calculate.calculate(5, 6));

        // 2. Parameters: Lambda expression.
        Calculate addValue = (num1, num2) -> num1 + num2;
        Calculate summa = (number1, number2) -> number1 + number2;
        System.out.println(summa.calculate(6, 7));
        System.out.println(addValue.calculate(8, 8));
        Calculate umnajeniya = (num1, num2) -> num1 * num2;
        System.out.println(umnajeniya.calculate(4, 3));

        Calculate minusValue = (num1, num2) -> num1 - num2;
        System.out.println(minusValue.calculate(45, 45));

        //3. Lambda expression in Static method
        testMethod(3, 12, summa);
        testMethod(34, 43, addValue);
        testMethod(32,8, umnajeniya);
        testMethod(45, 12, minusValue);

        // 4. Interface and Concrate Class integration
        Calculate addNumber= new ConcrateClass(); // Calculate type object
        testMethod(-1, 3, addNumber);

        //5. No parameter Lambda expression
        NoParam noParam = () -> "Hello Lambda in our class";
        System.out.println(noParam.operations());
    }

       // 3. Static Method for Lambda expression
    public static void testMethod(int val, int val1, Calculate hisobla){
        System.out.println(hisobla.calculate(val, val1));
    }
}
