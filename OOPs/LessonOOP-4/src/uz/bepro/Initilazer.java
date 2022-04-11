package uz.bepro;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {OOPInitization}
 * @Date: {2022/03/30 && 4:23 PM}
 */
public class Initilazer {
    private static int nextId;
    private int id;

    static double temp = 343.3;

    // static initialization block
    static {
        nextId = ThreadLocalRandom.current().nextInt(1000);
    }

    // object initialization block
    {
        id = nextId;
        nextId++;
        temp++;
    }

    public String toInfo(){

        return "Logic: " + id + " temp: " + temp;
    }
}
