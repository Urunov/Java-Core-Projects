package com.bepro.oops;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Polymorphism}
 * @Date: {2022/04/06 && 10:05 PM}
 */
public class Employee {

    private String name;
    private String lastName;
    public int age;
    public double salary;

    public Employee() { // Constructor polymorphism
    }

    public Employee(String name, String lastName){
        this.name = name;
        this.lastName = lastName;

    }

    public Employee(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void work(){
        System.out.println("Employee works. ");
    }
}
