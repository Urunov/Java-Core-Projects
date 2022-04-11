package uz.bepro.project.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/11 && 6:11 PM}
 */
@FunctionalInterface
public interface Display {

    void swich();
   // void block(); // public abstract

    default void methodA(){
        System.out.println("A... method");
    }
    default void methodB(){
        System.out.println("B... method");
    }
}