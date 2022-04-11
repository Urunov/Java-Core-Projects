package uz.bepro.project.electronics.devices;

import uz.bepro.project.electronics.Electronics;
import uz.bepro.project.electronics.devices.Callable;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {InhertanceImp}
 * @Date: {2022/04/11 && 2:35 PM}
 */
public class Phone extends Electronics implements Callable, Recordable {

    @Override
    public void turnOn() {
        System.out.println("Toach butto long time.");
        System.out.println("Turn ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Toach butto long time.");
        System.out.println("Turn Off");
    }

    @Override
    public void call() {

        System.out.println("Calling...");
    }

    @Override
    public void record() {
        System.out.println("Recording...");
    }
}
