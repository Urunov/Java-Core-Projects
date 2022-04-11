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

    static Card card =  new Card("Uzcard", "8600 1234 1234 9011", "ABC","0909" ,1000, true);
    static Card card1 =  new Card("Humo", "8600 1234 1234 9012", "ABD","0919" ,1000, true);
    static Card card2 =  new Card("Visa", "8600 1234 1234 9013", "ABE","0309" ,1000, true);
    static Card card3 =  new Card("Master  Card", "8600 1234 1234 9014", "ABF","1909" ,1400, true);
    static Card card4 =  new Card("Union Pay", "8600 1234 1234 9015", "ABG","4309" ,43000, true);

    static Card [] cards = {card, card1, card2, card3, card4}; // massive db

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AtmService atm = new AtmServiceImplement();


        while (true) {
            System.out.println("Enter your Card(ID):");
            Card insertedCard = getCard(scanner.nextLine());
            if (insertedCard != null) {
                if (atm.checkPassword(insertedCard)) {
                    System.out.println("0 => Take card");
                    System.out.println("1 => Withdraw");
                    System.out.println("2 => Balance Info");
                    System.out.println("3 => Change Pin");

                    switch (scanner.nextInt()){
                        case 0:
                            System.out.println("Card will out");
                            break;
                        case 1:
                            System.out.println("Widthraw money: ");
                            atm.withdraw(insertedCard);
                        case 2:
                            System.out.println("Balance Info:  ");
                            atm.balance(insertedCard);
                        case 3:
                            System.out.println("Change pin");
                            atm.changePin(insertedCard);
                        default:
                            System.out.println("Atm is not working now.");
                    }

                } else {
                    System.out.println("You have a change, enter again" + "Your last change ... ");
                }
            }
            return;
        }
    }

    public static Card getCard(String id){
        // for (Card card : cards) {
        // for(int i=0; i<Card.lenght; i++){
        // cards[i]
        for(;;){ // the same
          if (card.getId().equals(id)){
              if (card.isState()){
                  return card;
              }else {
                  System.out.println("Card blocked");
              }
          } else {
              System.out.println("No this card ");
          }
          return null;
        }
    }


}
