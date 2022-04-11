package uz.bepro.project.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/11 && 5:55 PM}
 */
public interface RemoteController {

    void changeChannel();
    void changeValue();
    public static int interfaceField = 8; // public static cannot go to sub-class.

    static void staticMethod(){ // not implement to sub-class
        System.out.println("Static method...");
    }

   default void defaultMethod(){ //
        System.out.println("default...");
    }

   void extraMethod();
}
