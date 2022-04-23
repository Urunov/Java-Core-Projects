package com.bepro.collections;

import com.bepro.collections.model.Car;
import com.bepro.collections.model.MoreMethods;
import com.bepro.collections.model.TestInterface;

import java.util.*;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {CollectionFramework-2}
 * @Date: {2022/04/23 && 12:39 PM}
 */
public class MainCollectionSet {
    public static void main(String[] args) {

        // Anonym
        TestInterface testInterface = new TestInterface() {
            @Override
            public boolean calculates(int number1, int number2) {
                //logic
                return false;
            }
        };
        MoreMethods moreMethods= new MoreMethods() {
            @Override
            public void calc() {

            }

            @Override
            public int cal(int val1) {
                return 0;
            }

            @Override
            public int umn(int value1, int number2) {
                return 0;
            }
        };
        Set setSample = new Set() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        // step-0: Add
        Set<Integer> setInts = new HashSet<>();

        setInts.add(34);
        setInts.add(342);
        setInts.add(2);
        setInts.add(11);
        setInts.add(-12);
        setInts.add(90);
        setInts.add(-2);
        setInts.add(-2);
        setInts.add(-2);
        setInts.add(-2);
        setInts.add(0);
        setInts.add(0);
        setInts.add(-132);

        System.out.println("-------------------");
        System.out.println("set: " + setInts);

        setInts.removeIf(n -> n==0);
        System.out.println(">0 Logic: " + setInts);
        setInts.removeIf(number -> number %2==1);

        System.out.println("----After Logic ----");
        System.out.println(setInts);

        //step-1: LikedHashSet
        Set<String> strings = new LinkedHashSet<>();
        strings.add("Hash");
        strings.add("are");
        strings.add("Hello");
        strings.add("-2");
        strings.add("Linked");
        strings.add("ArrayList");
        strings.add("List");

        System.out.println(strings);

        Set<String> upString = new LinkedHashSet<>();
        upString.addAll(strings);

        System.out.println("Upstring: " + upString);


        Set<Integer> integers = new LinkedHashSet<>();
        integers.add(32);
        integers.add(1);
        integers.add(55);
        integers.add(155);
        integers.add(255);
        integers.add(245);
        System.out.println("LinkedHashSet: " + integers);


        //step-2: TreeSet: Alfabit
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello");
        treeSet.add("Tree");
        treeSet.add("Set");
        treeSet.add("Collection");
        treeSet.add("Alex");

        System.out.println(treeSet);

        // Step-3: Car class
       TreeSet<Car> cars1 = new TreeSet<>(Comparator.comparing(Car::getPrice));
        Car car12 = new Car(2001, "BMW", 44444);
        Car car13 = new Car(2004, "Lada", 2313.3);
        Car car14 = new Car(2011, "WV", 3333.3);
        Car car15 = new Car(2021, "Ford", 33.3);

        cars1.add(car12);
        cars1.add(car13);
        cars1.add(car14);
        cars1.add(car15);
        System.out.println("Price:  " + cars1);

        TreeSet<Car> cars = new TreeSet<>(Comparator.comparing(Car::getYear)); // ctrl + P
        Car car1 = new Car(2001, "BMW", 33.3);
        Car car2 = new Car(2004, "Lada", 233.3);
        Car car3 = new Car(2011, "WV", 333.3);
        Car car4 = new Car(2021, "Ford", 133.3);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        System.out.println(cars);
    }
}
