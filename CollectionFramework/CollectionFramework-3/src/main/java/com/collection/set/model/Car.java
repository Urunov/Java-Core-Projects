package com.collection.set.model;

import java.util.Comparator;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {CollectionFramework-2}
 * @Date: {2022/04/23 && 12:49 PM}
 */
public class Car implements Comparator<Car> {
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

    @Override
    public int compare(Car car1, Car car2) {
        if (car1.getYear() - car2.getYear()>0){
            return 1;
        } else if (car1.getYear() - car2.getYear()<0){
            return -1;
        } else {
            return 0;
        }
    }
}
