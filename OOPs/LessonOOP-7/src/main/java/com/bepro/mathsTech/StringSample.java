package com.bepro.mathsTech;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Polymorphism}
 * @Date: {2022/04/06 && 10:29 PM}
 */
public class StringSample {
    //

    public static String tellMe = "              Assalomu alaykum.                   ";//// Global variable (o'zgaruvchi)

    public static void main(String[] args) {


        int n = tellMe.length();

        System.out.println("len:  " + n);
        System.out.println(tellMe);
        System.out.println(tellMe.trim());
        System.out.println(tellMe.substring(0,8));

    }
}
