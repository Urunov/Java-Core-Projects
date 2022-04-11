package com.bepro.oops;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Polymorphism}
 * @Date: {2022/04/06 && 10:43 PM}
 */
public class Programmer extends Employee{
    //

    @Override
    public void work() {
        super.work();
        System.out.println("Programmer working");
    }
}
