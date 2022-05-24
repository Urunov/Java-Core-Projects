package uz.academy.forInstance;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {DateTime-Lesson1}
 * @Date: {2022/05/12 && 2:37 PM}
 */
public class MainClass {
    public static void main(String[] args) {
        Car car = new CarTest(); // same
        Car car1 = Car.getInstance(); // same
    }
}
