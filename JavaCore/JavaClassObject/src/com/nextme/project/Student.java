package com.nextme.project;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaClassObject}
 * @Date: {2022/02/19 && 9:42 PM}
 */
public class Student {
    //
    private String name = "afas";
    private int age;
    private String fakultet;





    // Constructor
    public Student(){ // default constuctor

    }

   public Student(String name){

   }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String fakultet){
        this.name = name;
        this.age = age;
        this.fakultet = fakultet;
    }
}
