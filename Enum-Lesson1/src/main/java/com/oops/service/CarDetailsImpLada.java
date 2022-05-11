package com.oops.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Enum-Lesson1}
 * @Date: {2022/05/10 && 7:37 PM}
 */
public class CarDetailsImpLada implements CarDetails, CarDetailsCustom{

    @Override
    public void zavat() {
        System.out.println("Tesla with key....");
    }

    public void zavat(int number){
        System.out.println("Yana zavat:  " + (number+5));

    }

    @Override
    public void checkPribor() {
        System.out.println("Check already fine");
    }

    @Override
    public void runAway() {
        System.out.println("We are ready to go....");
    }


    @Override
    public int millage() {
        return 4;
    }

    @Override
    public boolean colorType() {
        System.out.println("White");
        return true;
    }
}
