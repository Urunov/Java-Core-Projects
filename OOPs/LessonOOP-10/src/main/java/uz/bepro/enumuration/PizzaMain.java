package uz.bepro.enumuration;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/12 && 5:53 PM}
 */
public class PizzaMain {
    public static void main(String[] args) {
        PizzaTest pizzaTest = new PizzaTest(PizzaSize.MEDIUM);
        pizzaTest.orderPizza();
    }
}
