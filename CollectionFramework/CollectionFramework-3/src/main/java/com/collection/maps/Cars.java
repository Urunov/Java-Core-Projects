package com.collection.maps;

import java.util.Comparator;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {CollectionFramework-2}
 * @Date: {2022/04/23 && 12:49 PM}
 */
public class Cars{
    //

    private String model;
    private int year;

    public Cars(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
