package uz.bepro.project.electronics;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {InhertanceImp}
 * @Date: {2022/04/11 && 2:37 PM}
 */
public class Lamp extends Electronics{

    @Override
    public void turnOn() {
        System.out.println("Button toach on.");
        System.out.println("Lamp is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Button toach on");
        System.out.println("Lamp is off");
    }
}
