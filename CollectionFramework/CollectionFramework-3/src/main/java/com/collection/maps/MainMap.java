package com.collection.maps;

import java.util.*;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {CollectionFramework-3}
 * @Date: {2022/04/27 && 2:29 PM}
 */
public class MainMap {
    public static void main(String[] args) {

        // step-0: Map, HashMap.
        HashMap<String, Integer> empId = new HashMap<>();
        empId.put("Urunov", 1233);
        empId.put("Allabayev", 5432);
        empId.put("Ramanov", 3434);
        empId.put("Ozod", 6544);
        empId.put("Donik", 432001);
        empId.put("Daminbek", 93933);
        System.out.println(empId); // not ordered.

        System.out.println(empId.get("Ozod"));
        System.out.println(empId.containsKey("Donik"));
        System.out.println(empId.containsValue(3434));

        empId.put("Allabayev", 10001);
        System.out.println(empId);

        empId.replace("Urunov", 10002);
        System.out.println(empId);

        empId.replace("Boris", 333);
        System.out.println(empId);

        empId.putIfAbsent("Steve", 222);
        System.out.println(empId);

        empId.remove("Steve");
        System.out.println(empId);

        //step-1: Map: initial capacity, loadFactor
        Map<String, Integer> map1 = new HashMap<>(); //key, value. [initialCapacity: 16, loadFactory: 0/9f]
        System.out.println(map1.put("first", 101)); // return null

        map1.put("second", 102);
        map1.put("third", 103);
        map1.put("four", 104);

        System.out.println(" :> " + map1);
        Set<String> keys = map1.keySet();
        Collection<Integer> values = map1.values();

        System.out.println("key: "+ keys);
        System.out.println("values: " + values);



        HashMap<String, Integer> map3 = new HashMap<>();
        map3.putAll(map1);
        System.out.println("PutAll: "+ map3);

        // step-2: Car class
        Map<Cars, String > map2 = new HashMap<>();

        Cars cars = new Cars("GM", 1999);
        Cars cars1 = new Cars("Lada", 2001);
        Cars cars2 = new Cars("VolsWagen", 2003);
        Cars cars3 = new Cars("BMW", 2012);
        Cars cars4 = new Cars("BMW", 1993);

        map2.put(cars, "Nexia");
        map2.put(cars1, "Vesta");
        map2.put(cars2, "VW03");
        map2.put(cars3, "B02");
        System.out.println(map2);

        // step-3: LinkedHashMap
        Map<Cars, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(cars, "Nexia-2");
        linkedMap.put(cars1, "XRAY Cross");
        linkedMap.put(cars2, "Retan");
        linkedMap.put(cars3, "X06");

        System.out.println(linkedMap);

        // step-4: TreeMap
        Map<Cars, String> treeMap = new TreeMap<>(Comparator.comparing(Cars::getYear));

        treeMap.put(cars, "Nexia-2");
        treeMap.put(cars1, "XRAY Cross");
        treeMap.put(cars2, "Retan");
        treeMap.put(cars3, "X06");
        treeMap.put(cars4, "A001");

        System.out.println(treeMap);

        //step-5. Map.Entry. example: Dictionary slovar
        Set<Map.Entry<String, Integer>> entrySet= map1.entrySet();
        entrySet.forEach(System.out::println);

        map3.forEach((key, value) -> System.out.println(keys + " : " + values));

    }
}
/*
* initial capacity
*
* loadFactory -- if full 3/4 in the map constructor. they again create
* max val = 1.
*
* */