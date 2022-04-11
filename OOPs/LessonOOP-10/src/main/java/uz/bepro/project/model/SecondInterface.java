package uz.bepro.project.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/11 && 6:06 PM}
 */
public interface SecondInterface {
    //
    default void defaultMethod(){
        System.out.println("Second interface's Default method called...");
    }
}
