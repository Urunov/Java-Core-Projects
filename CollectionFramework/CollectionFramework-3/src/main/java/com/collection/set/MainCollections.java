package com.collection.set;

import com.collection.set.model.Car;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {CollectionFramework-3}
 * @Date: {2022/04/25 && 9:33 PM}
 */
public class MainCollections {
    public static void main(String[] args) {
        //
        Set<Integer> numbers = new TreeSet<>();

        //Add elements to the set
        numbers.add(2);
        numbers.add(4);
        numbers.add(12);
        System.out.println("Set using TreeSet: " + numbers);

        //Access Elements using iterator()
        System.out.println("Accessing elements using iterator : ");
        Iterator<Integer> integerIterator = numbers.iterator();
        while (integerIterator.hasNext()){
            System.out.print(integerIterator.next());
            System.out.print(", ");
        }
        System.out.println();
        //
        TreeSet<Car> cars = new TreeSet<>((o1, o2)-> o2.getYear() - o1.getYear());
        Car car1 = new Car(2009, "Tesla", 23.3);
        Car car2 = new Car(2021, "GM", 342.2);
        Car car3 = new Car(2011, "Volvo", 20.2);
        Car car4 = new Car(2012, "Ford", 32.2);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
       // System.out.println(cars);

        cars.forEach(car -> System.out.println(car));

    }
}
