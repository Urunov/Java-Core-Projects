package com.bepro.lambda.lambda1;

import com.bepro.lambda.lambda1.service.OperationMass;
import com.bepro.lambda.lambda1.service.Operationable;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LambdaExpression-2}
 * @Date: {2022/04/19 && 2:43 PM}
 */
public class MainLambda {
    public static void main(String[] args) {

        // 1. Operationable interface. Lambda logic
        Operationable op1 = (b) -> b % 2 == 0 ? true : false;

        if (op1.isEven(9)) {
            System.out.println("Event number ");
        } else{
            System.out.println("Odd number");
        }

        //2. Array: OperationMass Interface
        int []nums = {11, 2, 3, 4};

        //3. Even number, odd number, Prime number.
        sumEvenElement(nums);

        sumOddElement(nums);
        sumPrimeElement(nums);

    }

    public static void sumEvenElement(int nums[]){
        OperationMass cal= num -> {
            int sum = 0;
            for (int i: num) {
                if (i%2==0)
                    sum +=i;
            }

            return sum;
        };
        System.out.println("Sum of even elements:  " + cal.oper(nums));
    }
    public static void sumOddElement(int nums[]){
        OperationMass operationable= num -> {
            int sum = 0;
            for (int i: num) {
                if (i%2==1)
                    sum+=i;
            }

            return sum;
        };
        System.out.println("Sum of odd elements:  " + operationable.oper(nums));
    }

    // tub sonlar:
    public static void sumPrimeElement(int nums[]){
        OperationMass operationable= primeNumber -> {
            int sum = 0;
             for (int i=0; i<primeNumber.length; i++){
            //for (int i: primeNumber){
                if(isPrimer(primeNumber[i])){
                    sum+=primeNumber[i];
                   // System.out.println("---> " +primeNumber[i]);
                }
            }

            return sum;
        };
        System.out.println("Sum of prime elements:  " + operationable.oper(nums));
    }

    public static boolean isPrimer(int number){
        if (number==1) return false;
        for (int i = 2; i <=number/2; i++) {
            if (number %i==0){
                return false;
            }
        }
        return true;
    }
}
