package uz.bepro.atm;

import uz.bepro.atm.model.Card;
import uz.bepro.atm.model.uzbek.ExecutiveClass;

import java.util.Scanner;

import static uz.bepro.atm.model.uzbek.ExecutiveClass.getCard;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter your card number : ");
            Card insertedCard = getCard(scanner.nextLine());
            ExecutiveClass.Logicsinfo(insertedCard);
        }

    }
}