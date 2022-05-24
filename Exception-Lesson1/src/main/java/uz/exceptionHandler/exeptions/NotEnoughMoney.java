package uz.exceptionHandler.exeptions;

import uz.exceptionHandler.enums.CardType;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Exception-Lesson1}
 * @Date: {2022/05/14 && 10:55 AM}
 */

public class NotEnoughMoney extends Exception{
    //
    double sum;

    public NotEnoughMoney(double sum) {
        super("Not enough money in your balance." + sum + " ");
    }
}