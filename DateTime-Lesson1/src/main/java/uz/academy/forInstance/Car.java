package uz.academy.forInstance;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {DateTime-Lesson1}
 * @Date: {2022/05/12 && 2:34 PM}
 */
public abstract class Car {

    private String name;
    private String model;

    public static CarTest getInstance(){
        CarTest carTest = new CarTest();
            return carTest;
    }
}
