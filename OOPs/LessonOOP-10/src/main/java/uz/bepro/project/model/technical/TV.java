package uz.bepro.project.model.technical;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/11 && 5:57 PM}
 */
public class TV implements RemoteController{
    //

    /**
     * Inheritance:
     *  Class ----> extend
     *  Interface ----> implement
     *
     *
     * */
    private int volume;
    private int channel;


    @Override
    public void changeChannel() {
        System.out.println("change... ");
    }

    @Override
    public void changeValue() {

        System.out.println("Volume.........");

    }

    @Override
    public void changeLanguage() {
        System.out.println("English, Russian, Uzbek");
    }

    @Override
    public void extraMethod() {

    }

    @Override
    public void defaultMethod() {
        RemoteController.super.defaultMethod();
        System.out.println("Working extra default");
    }

    public int getVolume() {
        System.out.println("Result: " + volume);
        return volume;
    }

    public void setVolume(int volume) {
        System.out.println("Upgrade volume: ");
        this.volume = volume+1;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "TV{" +
                "volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}
