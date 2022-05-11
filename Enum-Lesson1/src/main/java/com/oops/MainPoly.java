package com.oops;

import com.oops.service.CarDetailsImpLada;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Enum-Lesson1}
 * @Date: {2022/05/10 && 7:33 PM}
 */
public class MainPoly {
    public static void main(String[] args) {

        CarDetailsImpLada carDetailsImpLada = new CarDetailsImpLada();

        carDetailsImpLada.runAway();
        carDetailsImpLada.zavat();
        carDetailsImpLada.zavat(10);
    }
}
