package uz.ATM.checkCardAndPin;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CheckCard {

    public static int globalNum = 0;
    public static JSONArray checkID(String id){
        if(id.equals("1")){
            return null;
        }
        id = id.trim();
        JSONParser jsonParser = new JSONParser();
        String cardMessage = "";
        JSONArray jsonCard = null;
        try(FileReader fileReader = new FileReader("CardData/json/cardData.json"))
        {
            Object object = jsonParser.parse(fileReader);
            JSONArray employeList = (JSONArray) object;


            for (globalNum = 0; globalNum < employeList.size(); globalNum++) {
                JSONObject jsonObject = (JSONObject) employeList.get(globalNum);
                jsonCard = employeList;
                if(jsonObject.get("accountNum").equals(id)){
                    cardMessage = "";
                    if((boolean)jsonObject.get("state")){
                        return jsonCard;
                    }else {
                        System.err.println("The card is blocked");
                        return null;
                    }
                }else {
                    cardMessage = id + " No such Card found";
                    jsonCard = null;
                }
            }

        }catch (NullPointerException | ParseException | IOException e){
            e.printStackTrace();
        }
        System.out.println(cardMessage);
        return jsonCard;
    }

    public static boolean checkPin(JSONArray inserted){

        JSONObject jsonObject = (JSONObject) inserted.get(CheckCard.globalNum);

        Scanner scanner = new Scanner(System.in);

        boolean condition = false;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the password : ");
            String pin = scanner.nextLine();
            if((jsonObject.get("pin")).equals(pin)){
                condition = true;
                return condition;
            }else {
                System.out.println("Karta paroli xato");
                if(i == 2){
                    System.out.println("Karta bloklandi.");
                    condition = false;
                    return condition;
                }
            }
        }

        return condition;
    }
}
