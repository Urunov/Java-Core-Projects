package uz.bepro.defualtMethods;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/15 && 6:09 PM}
 */
public class TV implements RemoteController {
    //
    private int volume;
    private int channel;

    @Override
    public void changeChannel() {
        System.out.println("LG tv....");
    }

    @Override
    public void changeVolume() {
        System.out.println("tv volume....");
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
