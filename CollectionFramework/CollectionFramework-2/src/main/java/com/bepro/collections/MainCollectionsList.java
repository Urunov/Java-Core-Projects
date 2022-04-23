package com.bepro.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {CollectionFramework-2}
 * @Date: {2022/04/23 && 12:21 PM}
 */
public class MainCollectionsList {
    public static void main(String[] args) {

        // step-0. List: addAll
        List<Integer> integerList = new ArrayList<>();
        integerList.add(34);
        integerList.add(43);
        integerList.add(55);
        integerList.add(1);
        System.out.println("1st List: " + integerList);

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(integerList);
        System.out.println("2nd List: "+list1);

        // step-1: List: removeAll if integerList contain list1

        list1.add(0,321);
        list1.add(3,8);
        list1.add(2,28);
        list1.add(5,28);
        System.out.println("before logic: "+list1);
//       list1.removeAll(integerList);
//       System.out.println("removeAll logic: " + list1);

        //step-2: List: retainAll

        list1.retainAll(integerList);
        System.out.println("retain logic: " +list1);
        System.out.println(list1.size());

        // step-3: List: set, get

        List<Double> doubles = new ArrayList<>();
        doubles.add(34.3);
        doubles.add(722.5);
        doubles.add(712.5);
        doubles.add(742.5);

        doubles.add(2,45.4);
        doubles.add(2,456.4);
        doubles.set(0,3.0);
        System.out.println(doubles.get(4));


        System.out.println(doubles);
        /**zadacha:
         * contain
         * containAll
         *
         * */

    }
}
