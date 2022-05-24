package uz.exceptionHandler.exeptions;

import uz.exceptionHandler.enums.CardType;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Exception-Lesson1}
 * @Date: {2022/05/14 && 11:23 AM}
 */
public class CardTypeNotMatch extends Throwable {
    //
    CardType receiver;
    CardType deliver;
    String bankFee; // bank usluga.


    public CardTypeNotMatch() {
    }


    public CardTypeNotMatch(CardType cardType, CardType cardType1) {
        System.out.println("Not much type");
    }
}
