package uz.bepro.project.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaInhertance}
 * @Date: {2022/04/05 && 9:49 PM}
 */
public class Product {
    //
    private String util;
    public String name;
    public double price;
    String date;
    protected String maker; // sozdatel

    public String getUtil() {
        return util;
    }

    public void setUtil(String util) {
        this.util = util;
    }

    public String getMaker(){
        return maker;
    }

    public void setMaker(String maker){
        this.maker = maker;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String util, String name, double price, String date, String maker) {
        this.util = util;
        this.name = name;
        this.price = price;
        this.date = date;
        this.maker = maker;
    }
}
