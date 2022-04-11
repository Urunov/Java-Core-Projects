package com.project.oops;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {ClassObject}
 * @Date: {2022/03/16 && 12:46 AM}
 */


public class Student {
    // Field --> variables
    private String name;
    private int age;
    public int sum =1;

    public Student(){ // empty constructor
        // JVM
    }

    public Student(String n, int a){
        name = n;
        age = a;
    }


    public Student(String name1){
        name = name1;
    }

    public Student(int age1){
        age = age1;
    }

    // Method --> Function
    // void --> no return type.
    public void giveMeYourName(String name){
        // Logic
        int a = 9 + 7;

        System.out.println("Your name is : " + name +"   " + a);
    }

    public int calcMoney(int money){

        sum *= money;
        System.out.println("Summa: " + sum);
        return sum;
    }
}
