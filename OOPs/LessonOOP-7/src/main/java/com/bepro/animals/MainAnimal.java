package com.bepro.animals;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Polymorphism}
 * @Date: {2022/04/06 && 10:54 PM}
 */
public class MainAnimal {

    public String toString(){
        return super.toString();
    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.voice();
        System.out.println(cat.toString()); // how to work toString

        Dog dog = new Dog();
        dog.voice();
        System.out.println(dog.toString());
    }
}
