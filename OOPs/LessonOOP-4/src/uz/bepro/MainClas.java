package uz.bepro;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {lessonOOPEncapsulation}
 * @Date: {2022/03/28 && 5:45 PM}
 */
public class MainClas {
    public static void main(String[] args) {

        Car car = new Car("White", "BMW", "BMW-X6", 2021);
        car.setBrand("Audi");
        car.getBrand();

        Initilazer initilazer = new Initilazer();
        initilazer.toInfo();
        System.out.println(initilazer.toInfo());
    }
}
