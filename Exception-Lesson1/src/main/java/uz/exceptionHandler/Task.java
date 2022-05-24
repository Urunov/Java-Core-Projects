package uz.exceptionHandler;

import uz.exceptionHandler.enums.CardType;
import uz.exceptionHandler.exeptions.CardTypeNotMatch;
import uz.exceptionHandler.exeptions.NotEnoughMoney;
import uz.exceptionHandler.model.Card;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Exception-Lesson1}
 * @Date: {2022/05/14 && 9:55 AM}
 */
public class Task {
    public static void main(String[] args) throws CardTypeNotMatch, NotEnoughMoney {
      //
        ArrayList<Card>  cards = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Card uzcard = new Card("1", "A", 5000, CardType.HUMO,true,"909");
        Card humoCard = new Card("2", "AA", 44000, CardType.UZCARD,true,"109");
        Card visa = new Card("3", "AB", 15000, CardType.UNIONPAY,true,"2909");
        Card unionPay = new Card("4", "AC", 9000, CardType.VISA,true,"9409");
        cards.add(uzcard);
        cards.add(humoCard);
        cards.add(visa);
        cards.add(unionPay);

        Card myCard = uzcard;

        while (true){
            System.out.println("Qabul qiluvchi card ni tanlang: " + " 0-> Exit, 1-> Humo, 2-> Uzcard, 3-> UnionPay ");

            int choice = scanner.nextInt();
            if (choice==0) return;

            Card receiver = cards.get(choice);

            Card deliver = cards.get(1); // check.

            System.out.println("Summani kiting: ");
            transfer(deliver, receiver);


        }
    }

    public static void transfer(Card deliver, Card receiver) throws CardTypeNotMatch {
        //
        boolean cardTypeMissMatch = false;
        Scanner scanner = new Scanner(System.in);
        Double summa = scanner.nextDouble();

        if (deliver.getCardType().getCurrency().equals(receiver.getCardType())){
            if (deliver.getBalance()>summa){
                deliver.setBalance(deliver.getBalance() -summa);
                receiver.setBalance(receiver.getBalance() + summa);
            }else {
                try {
                    throw new NotEnoughMoney(deliver.getBalance());
                } catch (NotEnoughMoney notEnoughMoney){
                    System.out.println(notEnoughMoney.getMessage());
                }
            }
            cardTypeMissMatch=true;
        }else {
            throw new CardTypeNotMatch(deliver.getCardType(), receiver.getCardType());
        }
    }


}
