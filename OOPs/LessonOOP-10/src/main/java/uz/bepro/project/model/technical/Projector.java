package uz.bepro.project.model.technical;

import uz.bepro.project.model.technical.RemoteController;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/11 && 6:03 PM}
 */
public class Projector implements RemoteController {
    //

    @Override
    public void changeChannel() {
        System.out.println("Change to channel");
    }

    @Override
    public void changeValue() {
        System.out.println("Change to values");
    }

    @Override
    public void changeLanguage() {

    }

    @Override
    public void extraMethod() {
        System.out.println("Change to extra methods.");
    }

    @Override
    public void defaultMethod() {
        RemoteController.super.defaultMethod();
    }
}
