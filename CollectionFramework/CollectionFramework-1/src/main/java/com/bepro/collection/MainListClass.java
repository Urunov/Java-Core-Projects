package com.bepro.collection;


import java.util.*;
import java.util.function.Predicate;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LambdaExpression-3}
 * @Date: {2022/04/21 && 1:17 PM}
 */
public class MainListClass {
    public static void main(String[] args) {

        // List, ArrayList - synchronize
        // List - index based, using arrays.

        // step-1. Massiv - Array
        String [] massiv = new String[10];
        massiv[0] = "Hello ";
        massiv[1] = "Bratishka";
        massiv[5] = "Tashkent";

        for (int i = 0; i < massiv.length; i++) {
            System.out.print("   "+ massiv[i]);
        }
        System.out.println();
        System.out.println("-------------------------");

        List mylist = new ArrayList();
        ArrayList myArrayList = new ArrayList();

        ArrayList arrayList = new ArrayList();
        arrayList.add(43);
        arrayList.add("L");
        arrayList.add(true);
        arrayList.add("trust");

        System.out.println(arrayList.size());
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        arrayList.add(2,'A');

        System.out.println("----------");
        Object just = arrayList.get(4);
        System.out.println(arrayList);

        System.out.println(just);

        System.out.println("--------------------");
        ArrayList <Integer> list = new ArrayList(18);
        list.add(3);
        list.add(33);
        System.out.println(list);


        // Vector - asynchronize.
        // queue based.
        Vector<Integer> vector = new Vector<>();
        vector.add(56);
        vector.add(94);
        vector.add(944);
        vector.add(934);
        vector.add(924);
        System.out.println(vector);

        System.out.println(vector.get(4));

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.addFirst(33);
        linkedList.add(555);
        System.out.println(linkedList);


        List<Integer> integerList = Arrays.asList(43, 2, 443, 43, 23,0,0);
        for (Integer integer : integerList) {
            System.out.print("  " + integer);
        }

        // Lambda expression.
        integerList.forEach(integer -> System.out.println(integer));

        // Iterator
        System.out.println("---- Iterator ---- ");
        Iterator<Integer> iterator = integerList.iterator();
        System.out.println("Iteration: " + iterator.next());
        iterator.next();

        while (iterator.hasNext()){ // ---> null
            System.out.println( " iteration va:  " + iterator.next());
        }

        // task: sonlarni 2 kopaytirsin.

         List<Integer> nums = new ArrayList<>();
         nums.add(3);
         nums.add(33);
         nums.add(2);
         nums.add(-2);
         nums.add(-202);
         nums.add(0);
        System.out.println("1st " + nums);
        nums.replaceAll(integer -> integer *2);
         System.out.println("2nd " + nums);

         // Task-1. Predicate way
        Predicate<Integer> predicate = integer -> integer <0;
        nums.removeIf(integer -> integer <0);
        System.out.println(nums);

    }

    // task-1
    public List<Integer> noNeg(List<Integer> nums){
        nums.removeIf(integer -> integer<0);
        System.out.println(nums);
        return nums;
    }
}
// codingbat.com