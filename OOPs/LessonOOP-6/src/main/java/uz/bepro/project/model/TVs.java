package uz.bepro.project.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaInhertance}
 * @Date: {2022/04/05 && 10:02 PM}
 */
public class TVs extends Electronics{

    public double diagonal;


    public TVs(String name, double price, double voltage, boolean onOff) {
        super(name, price, voltage, onOff);
    }

    public TVs(String util, String name, double price, String date, String maker, double voltage, boolean onOff) {
        super(util, name, price, date, maker, voltage, onOff);
    }
}
