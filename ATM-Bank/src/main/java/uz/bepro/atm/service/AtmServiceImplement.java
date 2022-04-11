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


        for (int i=0; i<=3; i++) {
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
        double withdrawMoney;
        Scanner scanner = new Scanner(System.in);
        System.out.println("" +
                " 1=> 100,000 " +
                " 2=> 200,000 " +
                " 3=> 300,000 " +
                " 4=> 400,000 " +
                " 5=> 500,000 " +
                " 6=> Others "
        );

        switch (scanner.nextInt()){
            case 1:
                withdrawMoney = 100000.0;
                break;

            case 2:
                withdrawMoney = 200000.0;
                break;

            case 3:
                withdrawMoney = 300000.0;
                break;
            case 4:
                withdrawMoney = 4000000.0;
                break;
            case 5:
                withdrawMoney = 500000.0;
                break;

            default:
                System.out.println("Summani bering....");
                withdrawMoney = scanner.nextDouble();
                break;
        }

        if(card.getBalance()>=withdrawMoney * 1.01){
            card.setBalance(card.getBalance()-withdrawMoney);
            System.out.println("Please, take your money: " + withdrawMoney + "SUM");
            System.out.println("Your balance: " + (card.getBalance()-withdrawMoney));
        } else{
            System.out.println("Balance is not enough money." + card.getBalance() + "has money");
        }
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
