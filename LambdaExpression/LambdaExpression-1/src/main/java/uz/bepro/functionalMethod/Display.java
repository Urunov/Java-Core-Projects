package uz.bepro.functionalMethod;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/15 && 6:23 PM}
 */
@FunctionalInterface
public interface Display {
    //
    void switchValue(); // abstract method.

    default void showMe(){
        System.out.println("SHow me method is working....");
    }
}
// Functional Interface has only 1 abstract method.
// if you want add default method or static variable, no  problem just add and use it.