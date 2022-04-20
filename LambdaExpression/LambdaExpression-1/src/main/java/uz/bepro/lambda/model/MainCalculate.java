package uz.bepro.lambda.model;

import uz.bepro.lambda.service.Calculate;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/18 && 12:59 PM}
 */
public class MainCalculate {
    public static void main(String[] args) {
        ConcretClass concretClass = new ConcretClass();
        System.out.println(concretClass.calc(4, 3));

    }
}
