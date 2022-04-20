package uz.bepro.lambda;

import uz.bepro.lambda.model.ConcretClass;
import uz.bepro.lambda.service.Calculate;
import uz.bepro.lambda.service.NoParam;
import uz.bepro.lambda.service.OperationMass;
import uz.bepro.lambda.service.Operationable;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/13 && 2:22 PM}
 */
public class MainPoly {
    public static void main(String[] args) {

        // Calculate Interface
        Calculate addNumber = (number1, number2) -> number1  + number2;
        System.out.println(addNumber.calc(5, 33));

        Calculate add = (a,b) -> a +b;// lambda expression
        System.out.println(add.calc(4, 3));

        Calculate sub = (a, b) -> a*b;
        System.out.println(sub.calc(54, 54));

        Calculate doIt = (a, b) -> a*b +1;
        System.out.println(doIt.calc(5, 3));

        // Using test method, and 2 more parameters.
        testMethod(4,5, add);
        testMethod(1,2, sub);

        Calculate cal = new ConcretClass();
        testMethod(4,22, cal);

        // no parameter lambda expression: NoParam Interface I
        NoParam noParam =() -> "Hello Lambda";
        System.out.println(noParam.operator());

        // 1 parameter lambda expression: Operationable Interface
        Operationable operationable= number -> number%2==0;

        if (operationable.isEven(45)){
            System.out.println("Odd");
        } else{
            System.out.println("Even");
        }

        // Array: OperationMass Interface
        int []nums = {3,5, 6, 12,32, 7, 1, 38};

        sumEvenElement(nums);
        sumOddElement(nums);
        sumPrimeElement(nums);
    }

    public static void testMethod(int value, int value1, Calculate calculate){
        System.out.println(calculate.calc(value, value1));
    }
    
    public static void sumEvenElement(int nums[]){
        OperationMass operationable= num -> {
            int sum = 0;
            for (int i: num) {
                if (i%2==0)
                    sum +=i;
            }

            return sum;
        };
        System.out.println("Sum of even elements:  " + operationable.oper(nums));
    }
    public static void sumOddElement(int nums[]){
        OperationMass operationable= num -> {
            int sum = 0;
            for (int i: num) {
                if (i%2==0)
                   sum+=i;
            }

           return sum;
        };
        System.out.println("Sum of odd elements:  " + operationable.oper(nums));
    }
    public static void sumPrimeElement(int nums[]){
        OperationMass operationable= primeNumber -> {
            int sum = 0;
            for (int i=0; i<primeNumber.length; i++){
                if(isPrimer(primeNumber[i])){
                    sum+=primeNumber[i];
                }
            }
            return sum;
        };
        System.out.println("Sum of prime elements:  " + operationable.oper(nums));
    }

    public static boolean isPrimer(int number){
            if (number==1) return false;
            for (int i = 2; i < number/2; i++) {
                if (number %i==0){
                    return false;
                }
            }
           return true;
        };
}

