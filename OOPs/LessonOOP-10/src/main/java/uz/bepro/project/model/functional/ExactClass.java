package uz.bepro.project.model.functional;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/11 && 6:17 PM}
 */
public class ExactClass implements Display{

    @Override
    public void swich() {

    }

    @Override
    public void methodA() {
        Display.super.methodA();
    }

    @Override
    public void methodB() {
        Display.super.methodB();
    }
}
