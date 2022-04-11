package com.project.oops;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {ClassObject}
 * @Date: {2022/03/16 && 1:00 AM}
 */
public class MainPoly {
    public static void main(String[] args) {

        Student student = new Student(15); // Object
        student.giveMeYourName("Ozod"); // object method obrasheniya (Call)

        Student bratishka = new Student("Yura");
        bratishka.giveMeYourName("Pasha");

        Student heyBola = new Student("Natasha", 33);
        heyBola.giveMeYourName("Kuku");

        Student daxshat = new Student(32);
        daxshat.giveMeYourName("Lolo");
        daxshat.calcMoney(45);

        
    }
}
