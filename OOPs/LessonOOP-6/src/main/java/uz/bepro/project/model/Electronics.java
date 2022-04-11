package uz.bepro.project.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaInhertance}
 * @Date: {2022/04/05 && 9:56 PM}
 */
public class Electronics extends Product{

    double voltage;
    boolean onOff;

    public Electronics(String name, double price, double voltage, boolean onOff) {
        super(name, price);
        this.voltage = voltage;
        this.onOff = onOff;
    }

    public Electronics(String util, String name, double price, String date, String maker, double voltage, boolean onOff) {
        super(util, name, price, date, maker);
        this.voltage = voltage;
        this.onOff = onOff;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "voltage=" + voltage +
                ", onOff=" + onOff +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", maker='" + maker + '\'' +
                '}';
    }
}
