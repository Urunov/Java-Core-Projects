package uz.bepro.atm.service;

import uz.bepro.atm.model.Card;

import java.util.Scanner;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Polymorphism}
 * @Date: {2022/04/11 && 4:29 PM}
 */
public class AtmServiceImplement implements AtmService {
    //

    @Override
    public boolean checkPassword(Card card) {
       Scanner scanner = new Scanner(System.in);

       AtmService atmService = new AtmServiceImplement();


        for (int i=0; i<3; i++) {
            System.out.println("Please, enter Password.");
            String pin = scanner.nextLine();
            if (pin.equals(card.getPin())) {
                return true;
            } else {
                System.out.println("Password incorrect");
                if (i==2){
                    return false;
                }
            }
        }
        card.setState(false); // outside the card.
        return false;
    }

    @Override
    public void withdraw(Card card) {

    }

    @Override
    public void balance(Card card) {

    }

    @Override
    public void changePin(Card card) {

    }

    @Override
    public void transferMoney(Card card) {

    }

    public void fillCash(){
        System.out.println("Full in Cash to ATM.");
    }

}
