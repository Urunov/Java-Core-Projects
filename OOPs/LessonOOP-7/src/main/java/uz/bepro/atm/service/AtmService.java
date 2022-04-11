package uz.bepro.atm.service;

import uz.bepro.atm.model.Card;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Polymorphism}
 * @Date: {2022/04/11 && 4:26 PM}
 */
public interface AtmService {
    //
    boolean checkPassword(Card card);
    void withdraw(Card card); //
    void balance(Card card);
    void changePin(Card card);
    void transferMoney(Card card);

}
