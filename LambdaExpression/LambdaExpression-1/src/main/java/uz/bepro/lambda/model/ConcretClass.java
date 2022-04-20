package uz.bepro.lambda.model;

import uz.bepro.lambda.service.Calculate;
import uz.bepro.lambda.service.Second;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/13 && 6:06 PM}
 */
public class ConcretClass extends Matem implements Calculate {


    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
