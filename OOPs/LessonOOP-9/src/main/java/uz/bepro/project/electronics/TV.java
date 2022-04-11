package uz.bepro.project.electronics;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {InhertanceImp}
 * @Date: {2022/04/11 && 2:40 PM}
 */
public class TV implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off");
    }
}
