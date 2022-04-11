package com.bepro.oops;

import javax.print.Doc;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Polymorphism}
 * @Date: {2022/04/06 && 10:05 PM}
 */
public class MainEmp {
    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        doctor.work();

        Programmer programmer = new Programmer();
        programmer.work();

    }
}


/*
*  Can not override :
* 1. Constructor
* 2. Static method
* 3. Final method
*
* -----
* 1. The same return type and parameters for override
* 2. super () key word can use in sub-class when to @Override
*
*
* ----- Final where do we use ------
* 1. Variable
* 2. Method
* 3. Class
* */