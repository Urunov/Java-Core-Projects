package uz.bepro.project.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaInhertance}
 * @Date: {2022/04/05 && 10:03 PM}
 */
public class Phone extends Electronics {

    double camera; // default
    public String phoneCall;
    private String phoneNumber;

    public Phone(String name, double price, double voltage, boolean onOff) {
        super(name, price, voltage, onOff);
    }


    public double getCamera() {
        return camera;
    }

    public void setCamera(double camera) {
        this.camera = camera;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "voltage=" + voltage +
                ", onOff=" + onOff +
                ", camera=" + camera +
                ", phoneCall='" + phoneCall + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", maker='" + maker + '\'' +
                '}';
    }
}


