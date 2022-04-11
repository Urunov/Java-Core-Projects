package com.bepro.mathsTech;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Polymorphism}
 * @Date: {2022/04/06 && 10:06 PM}
 */
public class MathSample {
    //
    /*
    * Method Polymorphism
    *
    *
    * static --> it cannot create object or call the object behaviour.
    * */

    public final double pi = 3.1423233;  // constant

    public static int add(int a, int b){ // method
        return a + b;
    }

    public static double add(double a, double b){ // method
        return a + b;
    }

    public double add (double a, int b){
        return a + b;
    }
    public static double add(int a, double b){
        return a + b;
    }

    public static double add(double a, double b, double c){

        return a + b + c;
    }

    public int addAll(int a, int b){ // method
        return 2*(a + b);
    }
}
