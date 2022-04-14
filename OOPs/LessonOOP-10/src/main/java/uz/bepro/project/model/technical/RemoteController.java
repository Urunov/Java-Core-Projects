package uz.bepro.project.model.technical;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/11 && 5:55 PM}
 */
public interface RemoteController {

    // methods.
    void changeChannel();
    void changeValue();

    public static int interfaceField = 8; // public static cannot go to sub-class, and not create object

    public static String companyName = "LG"; // static variable

    public static void madeInCountry() { // not to go sub class (cannot implement)
    }

    static void staticMethod(){ // not implement to sub-class
        System.out.println("Static method...");
    }


    // Default method possible in the interface.
    // just method canot put together.
    // that method for all implement class.
    default void defaultMethod(){ //
        System.out.println("default...");
    } // public (just default).

    void extraMethod();

    default void mainDefault(){
        System.out.println("Default method called.");
    }

}
