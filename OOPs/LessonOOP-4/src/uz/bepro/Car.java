package uz.bepro;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {lessonOOPEncapsulation}
 * @Date: {2022/03/28 && 5:45 PM}
 */

public class Car {
    //
    private String color;
    private String model;
    private String brand;
    private int year;

    private double petrolTank;
    private double petrolLevel;
    private double fuelConsumption; // 100 km
    boolean active; // true - zavat qilinadi, false - ochib turibdi

    public Car(String color, String model, String brand, int year) {
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public void start(){
        if (!active){
            if (petrolLevel > 0){
                active = true;
            } else{
                System.out.println("NO petrol");
            }
        } else {
            active =false;
        }
    }

    public boolean isActive(){
        return active;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPetrolTank() {
        return petrolTank;
    }

    public void setPetrolTank(double petrolTank) {

        this.petrolTank = petrolTank;
    }

    public double getPetrolLevel() {
        return petrolLevel;
    }

    public void setPetrolLevel(double petrolLevel) {
       if (petrolLevel > 0 && petrolLevel <=petrolTank){
           this.petrolLevel = petrolLevel;
       }
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
