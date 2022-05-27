package uz.bepro.atm.model.uzbek;

import uz.bepro.atm.Main;
import uz.bepro.atm.model.Card;
import uz.bepro.atm.model.ServiceATM;
import uz.bepro.atm.model.ServiceatmImplement;

import java.util.Scanner;

public class ExecutiveClass {

    static Card card = new Card("Uzcard", "9090 9090 9090 9090", "Sherjonov Jahongir", "0909", 2000000, true);
    static Card card1 = new Card("Humo", "9860 1234 4555 9012", "Aminov Abror", "0919", 100000, true);
    static Card card2 = new Card("Visa", "1921 1010 5544 9013", "Ozodov Doniyor", "0309", 1000, true);
    static Card card3 = new Card("Master  Card", "7654 9090 1214 9014", "Mirziyoyev Shuhrat", "1909", 1400, true);
    static Card card4 = new Card("Union Pay", "9077 1234 2321 9015", "Asqarov Abbos", "4309", 43000, true);

    public static Card[] cards = {card, card1, card2, card3, card4}; // massive db

    static ServiceATM service = new ServiceatmImplement();
    public static void Logicsinfo(Card insertedCard) {

        Scanner scanner = new Scanner(System.in);

        if (insertedCard != null) {
            if(service.checkPin(insertedCard)){
                while (true) {



                        System.out.println("----------------------");
                        System.out.println("1. View card account.");
                        System.out.println("----------------------");
                        System.out.println("2. Cash withdrawal.");
                        System.out.println("----------------------");
                        System.out.println("3. Replenish the card account.");
                        System.out.println("----------------------");
                        System.out.println("4. Currency exchange.");
                        System.out.println("----------------------");
                        System.out.println("5. SMS notification.");
                        System.out.println("----------------------");
                        System.out.println("6. Change the card code.");
                        System.out.println("----------------------");
                        System.err.println("7. Exit");
                   
                    switch (scanner.nextInt()){
                        case 1 : {
                            service.balance(insertedCard);
                            break;
                        }
                        case 2 : {
                            service.withdraw(insertedCard);
                            break;
                        }
                        case 3 : {
                            service.replenishaccount(insertedCard);
                            break;
                        }
                        case 4 : {
                            service.currencyexchange(insertedCard);
                            break;
                        }
                        case 5 : {
                            service.message(insertedCard);
                        }
                        case 6 : {
                            service.changePin(insertedCard);
                            break;
                        }
                        case 7 : {
                            return;
                        }
                    }


                }
            }else System.err.println("Write the password well...");
        }
    }

    public static Card getCard(String id) {
        Card cardIn = card;
        String cardMessage="";
        for (Card card : cards) {
                if (card.getId().equals(id)) {
                    if (card.isState()) {
                        cardIn = card;
                        return cardIn;
                    } else {
                        System.out.println("The card does not work!!!");
                        return null;
                    }
                }else {
                    cardMessage="There is no such card.";
                    cardIn = null;
                }
            }
        System.out.println(cardMessage);
        return cardIn;
    }
}
