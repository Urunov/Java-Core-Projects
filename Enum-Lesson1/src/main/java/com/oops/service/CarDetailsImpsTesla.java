package com.oops.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Enum-Lesson1}
 * @Date: {2022/05/10 && 7:43 PM}
 */
public class CarDetailsImpsTesla implements CarDetailsCustom, CarDetails{

    List myTesla = new ArrayList<>();
    Map<String, Integer> mapTesla = new HashMap<>();

    @Override
    public void zavat() {
        myTesla.add("Tesla TV1");
        System.out.println();
    }

    @Override
    public void checkPribor() {
        System.out.println("Ready...Tesla");
    }

    @Override
    public void runAway() {
        System.out.println("Just go...");
    }

    @Override
    public int millage() {
        return 4;
    }

    @Override
    public boolean colorType() {
        System.out.println("Color is ready");
        return true;
    }
}
