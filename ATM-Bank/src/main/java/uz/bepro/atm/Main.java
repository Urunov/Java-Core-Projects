package uz.bepro.atm;

import uz.bepro.atm.model.Card;
import uz.bepro.atm.service.AtmService;
import uz.bepro.atm.service.AtmServiceImplement;

import java.util.Scanner;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Polymorphism}
 * @Date: {2022/04/06 && 11:53 PM}
 */
public class Main {

    public static Card card =  new Card("Uzcard", "8600 1234 1234 9011", "ABC","0909" ,100000, true);
    public static Card card1 =  new Card("Humo", "8600 1234 1234 9012", "ABD","0919" ,4000000, true);
    public static Card card2 =  new Card("Visa", "8600 1234 1234 9013", "ABE","0309" ,2000000, true);
    public static Card card3 =  new Card("Master  Card", "8600 1234 1234 9014", "ABF","1909" ,600400, true);
    public static Card card4 =  new Card("Union Pay", "8600 1234 1234 9015", "ABG","4309" ,4993000, true);
    public static Card card5 =  new Card("Union Pay", "8600 1234 1234 9115", "Rules","4300" ,4989830, false);

    static Card [] cards = {card, card1, card2, card3, card4, card5}; // massive db

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AtmService atm = new AtmServiceImplement();

        out:
        while (true) {
            System.out.println("Enter your Card(ID):");
            scanner = new Scanner(System.in);
            Card insertedCard = getCard(scanner.nextLine());
            if (insertedCard != null) {
                scanner = new Scanner(System.in);
                if (atm.checkPassword(insertedCard)) {
                    System.out.println(
                                  "  0 = Take card  "
                                + "  1 => Withdraw "
                                + "  2 => Balance Info  "
                                + "  3 => Change Pin ");

                    switch (scanner.nextInt()){
                        case 0:
                            System.out.println("Take it your card");
                            break;
                        case 1:
                            System.out.println("Widthraw money: ");
                            atm.withdraw(insertedCard);
                            continue out;
                        case 2:
                            System.out.println("Balance Info:  ");
                            atm.balance(insertedCard);
                            break;
                        case 3:
                            System.out.println("Change pin");
                            atm.changePin(insertedCard);
                            break;
                        default:
                            System.out.println("Atm is not working now.");
                    }

                } else {
                    System.out.println("You have a change, enter again" + "Your last change ... ");
                }
            }
           // return;
        }
    }

    public static Card getCard(String id) {
       //
        for (Card card : cards) {
            if (card.getId().equals(id)) {
                if (card.isState()) {
                    return card;
                } else {
                    System.out.println("Card blocked");
                    return null;
                }
            }
        }
        System.out.println("such a card is not available. ");
        return null;
    }
}
