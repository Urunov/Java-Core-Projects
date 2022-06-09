package uz.ATM;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import uz.ATM.Service.CardService;
import uz.ATM.Service.ServiceImpelement;
import uz.ATM.model.MenuSelect;


import java.io.FileNotFoundException;
import java.util.Scanner;

import static uz.ATM.checkCardAndPin.CheckCard.checkID;

public class ATMMain {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        CardService serviceImpelement = new ServiceImpelement();
        while (true){
            System.out.println("If you do not have a card");
            System.out.println("1. Sign up and get a card");
            System.out.println("Enter the card ID : ");
            String write = scanner.nextLine();
            JSONArray inserted = checkID(write);
            MenuSelect.menuSelect(inserted);
            if(write.equals("1")){
                serviceImpelement.addCard();
            }

        }


    }
}





//id -> accountNum
