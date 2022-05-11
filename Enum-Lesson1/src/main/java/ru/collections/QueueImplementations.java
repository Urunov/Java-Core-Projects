package ru.collections;

import java.util.*;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Enum-Lesson1}
 * @Date: {2022/05/10 && 8:11 PM}
 */
public class QueueImplementations {

    public static void main(String[] args) {

    Queue<Integer> ocherd = new LinkedList<>();


    ocherd.add(-5);
    ocherd.add(3);
    ocherd.add(33);
    ocherd.add(-8);
    ocherd.add(10);

    System.out.print ("   :> " + ocherd + " ");
        System.out.println("-------");
        System.out.println(ocherd.peek());
        System.out.println("SIZE:   " + ocherd.size());

        System.out.println("remove: " + ocherd.remove());
        System.out.println("Peek : " + ocherd.peek());
        System.out.println("SIZE1:   " + ocherd.size());
        ocherd.add(99);
        System.out.println("SIZE2:   " + ocherd.size());

    Deque<Integer> ocherds = new LinkedList<>();
    ocherds.add(3);
    ocherds.add(13);
    ocherds.add(33);
    ocherds.add(1113);
    ocherds.add(300);

        System.out.println(ocherds);
        ocherds.offer(3);
        ocherds.offerFirst(1113);
        System.out.println("-------");
        System.out.println(ocherds.peek());


    }
}
