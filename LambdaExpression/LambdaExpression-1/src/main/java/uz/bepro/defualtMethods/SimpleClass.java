package uz.bepro.defualtMethods;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/16 && 8:29 PM}
 */
public class SimpleClass implements RemoteController {

     String address;

    void showMeAddress(){
         System.out.println("Your address: " + address);
    }

    @Override
    public void changeChannel() {
        System.out.println("Simple class method....");
    }

    @Override
    public void changeVolume() {
        System.out.println("Change volume ....");
    }

    @Override
    public void defaultMethod() {
        RemoteController.super.defaultMethod();
    }

    @Override
    public void useManual() {
        RemoteController.super.useManual();
    }
}
