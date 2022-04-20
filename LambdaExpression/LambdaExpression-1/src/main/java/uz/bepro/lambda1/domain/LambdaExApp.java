package uz.bepro.lambda1.domain;

import uz.bepro.lambda.service.Operationable;
import uz.bepro.lambda1.service.Operation;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/13 && 10:29 PM}
 */
public class LambdaExApp {

    public static void main(String[] args) {

        int n = 70;
        int m = 80;
        Operation operationable = () -> {
           // n = 100; // impossible to use
            return m + n;
        };
        //  n = 100; // impossible to use
        System.out.println(operationable.calculate());

    }
}
