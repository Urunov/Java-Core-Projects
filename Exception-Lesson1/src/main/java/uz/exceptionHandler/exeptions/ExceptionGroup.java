package uz.exceptionHandler.exeptions;

import uz.exceptionHandler.enums.CardType;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Exception-Lesson1}
 * @Date: {2022/05/14 && 9:56 AM}
 */
public class ExceptionGroup extends Exception{

    CardType receiver;
    CardType deliver;

    public void NotEnoughMoney(CardType receiver, CardType deliver) {
        System.out.println(deliver.name() + " card bilan " + receiver.name() + " not the same currency ");
    }
}
