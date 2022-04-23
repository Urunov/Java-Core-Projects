package com.bepro.collections.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {CollectionFramework-2}
 * @Date: {2022/04/23 && 12:49 PM}
 */
public class Car {
    //
    int year;
    String model;
    double price;

    public Car(int year, String model, double price) {
        this.year = year;
        this.model = model;
        this.price = price;
    }




    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
