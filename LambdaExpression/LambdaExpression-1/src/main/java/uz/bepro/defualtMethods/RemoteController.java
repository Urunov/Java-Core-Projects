package uz.bepro.defualtMethods;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/15 && 6:06 PM}
 */
public interface RemoteController {

    //method.
    public abstract void changeChannel();
    void changeVolume();

    //static filed and method. It cannot support inheritance.
    public static final int interfaceValue = 10; // static cannot inheritance
    static void staticMethod(){
        System.out.println("Static method...called.");
    }

    // 1. inside the Interface, impossible to body method.
//    void defaultMethod(){
//        System.out.println("Default method called.");
//    }
    // 2. inside the interface, using default methods
    // same all the class after implementing interface.

    default void defaultMethod(){ // after implementing interface, after that the same all classes.
        System.out.println("Default method called. ...");
    }

    default void useManual(){
        System.out.println("Using manual for devices.");
    }


}
