package uz.bepro.enumuration;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/12 && 5:51 PM}
 */
public class PizzaTest {
    PizzaSize pizzaSize;

    public PizzaTest(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void orderPizza(){
        switch (pizzaSize){
            case SMALL:
                System.out.println("I ordered a small size pizza. ");
                break;
            case MEDIUM:
                System.out.println("I ordered a medium size pizza.");
                break;
            default:
                System.out.println("I don't know which one to order.");
                break;
        }
    }
}
