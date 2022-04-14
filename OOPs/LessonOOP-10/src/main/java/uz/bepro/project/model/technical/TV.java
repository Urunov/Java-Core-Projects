package uz.bepro.project.model.technical;

import uz.bepro.project.model.technical.RemoteController;
import uz.bepro.project.model.technical.SecondInterface;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/11 && 5:57 PM}
 */
public class TV implements RemoteController, SecondInterface {
    //
    private int volume;
    private int channel;

    @Override
    public void changeChannel() {

    }

    @Override
    public void changeValue() {

    }

    @Override
    public void extraMethod() {

    }

    @Override
    public void defaultMethod() {
        RemoteController.super.defaultMethod();
        System.out.println("Working extra default");
    }
}
