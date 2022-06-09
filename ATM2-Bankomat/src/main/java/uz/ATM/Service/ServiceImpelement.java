package uz.ATM.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import uz.ATM.checkCardAndPin.CheckCard;
import uz.ATM.model.Card;



import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

import java.util.*;


public class ServiceImpelement implements CardService{
    @Override
    public void addCard() {
        Random random = new Random();
        int min = 1000;
        int max = 9999;
        Scanner scanner = new Scanner(System.in);
        System.out.println("owner : ");
        String owner = scanner.nextLine();
        System.out.println("pin");
        String pin = scanner.nextLine();
        boolean state = true;
        String balance = "0";
        System.out.println("Select the card type : ");
        System.out.println("1. UzCard");
        System.out.println("2. HUMO");
        String accountNum="";
        int cardNumber = scanner.nextInt();


        switch (cardNumber){
            case 1 : {
                accountNum = "8600 " + (random.ints(min,max).findFirst().getAsInt()) + " " + (random.ints(min,max).findFirst().getAsInt()) + " " + (random.ints(min,max).findFirst().getAsInt());
                break;
            }
            case 2 : {
                accountNum = "9860"+ (random.ints(min,max).findFirst().getAsInt()) + " " + (random.ints(min,max).findFirst().getAsInt()) + " " + (random.ints(min,max).findFirst().getAsInt());
                break;
            }
            default:
                System.err.println("error");
        }
        String cardType = "";
        if(cardNumber == 1){
            cardType = "UZCARD";
        } else if (cardNumber == 2) {
            cardType = "HUMO";
        }
        System.out.println("-----------=Successful=------------");

        JSONParser jsonParser = new JSONParser();
        try(FileReader fileReader = new FileReader("CardData/json/cardData.json")){
            Object obj = jsonParser.parse(fileReader);
            JSONArray jsonArray = (JSONArray) obj;
            Card card = new Card((jsonArray.size()+1), accountNum, pin, owner, balance, state,cardType);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            jsonArray.add(card);
            File file = new File("CardData/json/cardData.json");
            OutputStream outputStream = new FileOutputStream(file);
            outputStream.write(gson.toJson(jsonArray).getBytes(StandardCharsets.UTF_8));
            System.out.println("Your Card Information : " + card);
        }catch (IOException e){
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void historyCard(JSONArray inserted) {

        Scanner scanner = new Scanner(System.in);
        JSONObject jsonObject = (JSONObject) inserted.get(CheckCard.globalNum);
        try {
            Scanner scanner1 = new Scanner(new File("CardData/IncomeAndExpenditureFile/IncomeAndExpenditure.txt"));

            String[] obj1 = null;
            String [] object=null;
            System.out.println("1. Kirim");
            System.out.println("2. Chiqim");
            int Num = scanner.nextInt();
            while (scanner1.hasNext()) {
                String obj = scanner1.nextLine();
                obj1 = obj.split(" ");
                object = obj.split(",");

                switch (Num) {
                    case 1: {

                        if (obj1[1].equals("Kirim")) {
                            System.err.println("--------------=CHEK=--------------");
                            String[] data0 = object[1].split(":");
                            String[] data1 = (object[2].split(":"));
                            String[] data2 = (object[11].split(":"));
                            data2 = data2[1].split("}");
                            String[] data3 = object[10].split(":");
                            String[] data4 = object[7].split(":");
                            data4 = data4[1].split("");
                            String[] data5 = object[5].split(":");
                            String[] data6 = object[4].split(":");

                            String data = data1[1].substring(1,5);
                            if(jsonObject.get("accountNum").equals(data)) {
//                                System.out.println("----------------------------------");
                                System.out.println(data1[1] + "  <-------- +" + data0[1] + " --------  " + data2[0]);
                                System.out.println("balance : " + data6[1]);
                                System.out.println(data4[1] + "." + data4[3] + "." + data5[1] + " " + data3[1] + ":" + data3[2] + ":" + data3[3]);
                                System.out.println("----------------------------------");
                            }else {
                                System.out.println("Your card history data was not found.");
                            }
                        }
                        break;
                    }
                    case 2: {
                        if (obj1[1].equals("Chiqim")) {
                            System.err.println("--------------=CHEK=--------------");
                            String[] data0 = object[1].split(":");
                            String[] data1 = (object[8].split(":"));
                            String[] data2 = object[5].split(":");
                            String[] data3 = object[3].split(":");
                            String[] data4 = object[7].split(":");
                            data4 = data4[1].split("");
                            String[] data5 = object[4].split(":");
                            String[] data6 = object[11].split(":");
                            String[] data7 = data6[3].split("}");
                            String data = data0[1].substring(1, 5);
                            if (jsonObject.get("accountNum").equals(data)) {
//                                System.out.println("----------------------------------");
                                System.out.println(data0[1] + "  -------- -" + data1[1] + " -------->  " + data2[1]);
                                System.out.println("balance : " + data3[1]);
                                System.out.println(data4[1] + "." + data4[3] + "." + data5[1] + " " + data6[1] + ":" + data6[2] + ":" + data7[0]);
                                System.out.println("----------------------------------");
                            } else {
                                System.out.println("Your card history data was not found.");
                            }
                        }

                        break;
                    }
                    default:
                        System.out.println("OOO NO, Replay enter number!");
                }
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public void throwMoney(JSONArray jsonStream) {
        Scanner scanner = new Scanner(System.in);

        JSONObject inserted = (JSONObject) jsonStream.get(CheckCard.globalNum);


        System.out.println("The card number you want to send : ");
        String id = scanner.nextLine().trim();
        if(inserted.get("accountNum").equals(id)){
            System.err.println("The practice cannot be done");
            return;
        }
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = null;
        try (FileReader fileReader = new FileReader("CardData/json/cardData.json")){
            Object object = jsonParser.parse(fileReader);
            JSONArray jsonArray = (JSONArray) object;

            int i;
            for (i = 0; i < jsonArray.size(); i++) {
               jsonObject = (JSONObject) jsonArray.get(i);
                if(jsonObject.get("accountNum").equals(id)){
                    if((boolean)jsonObject.get("state")){
                        System.out.println("O'tkazmoqchi bo'lgan summani kiriting : ");
                        double sum = scanner.nextDouble();

                        //--------------Calendar put to Object

                        Calendar calendar = new GregorianCalendar();
                        inserted.put("Clock", calendar.getTime().getHours()+":"+calendar.getTime().getMinutes()+":"+calendar.getTime().getSeconds());
                        inserted.put("Data", calendar.getTime().getDate()+"."+(calendar.getTime().getMonth()+1));
                        inserted.put("Year", calendar.getWeekYear());
                        jsonObject.put("Year", calendar.getWeekYear());
                        jsonObject.put("Clock", calendar.getTime().getHours()+":"+calendar.getTime().getMinutes()+":"+calendar.getTime().getSeconds());
                        jsonObject.put("Data", calendar.getTime().getDate()+"."+(calendar.getTime().getMonth()+1));
                        File file = new File("CardData/IncomeAndExpenditureFile/IncomeAndExpenditure.txt");
                        Reader wrt = new FileReader("CardData/IncomeAndExpenditureFile/IncomeAndExpenditure.txt");
                        Scanner scanner1 = new Scanner(new File("CardData/spiskaNum.txt"));

                        double card1Sum = Double.parseDouble((String) inserted.get("balance"));
                        double card2Sum = sum*0.01;
                        double jsonObj = Double.parseDouble((String) jsonObject.get("balance"));

                        if(card1Sum+card2Sum > sum){

                            inserted.put("balance", String.valueOf(card1Sum-sum-card2Sum));
                            jsonObject.put("balance", String.valueOf(jsonObj+sum));

                            int Num = 0;
                            if (wrt.ready()){
                                while (scanner1.hasNext()){
                                    Num = Integer.parseInt(scanner1.next());
                                }
                            }else {Num = 0;}
                            inserted.put("chiqimBalance", sum);
                            jsonObject.put("kirimBalance", sum);
                            inserted.put("kiruvchiCard", jsonObject.get("accountNum"));
                            jsonObject.put("chiquvchiCard", inserted.get("accountNum"));

                            String obj1 = null;
                            String obj2 = null;
                            int Num1 = Num;
                            while (Num < Num1+1) {
                                Num++;
                                obj1 =  Num + ". " + "Chiqim : " + inserted + "\n";
                                Num++;
                                obj2 =  Num + ". " + "Kirim : " + jsonObject + "\n";
                            }

                            inserted.remove("chiqimBalance");
                            inserted.remove("kiruvchiCard");
                            jsonObject.remove("chiquvchiCard");
                            jsonObject.remove("kirimBalance");


                            String num = String.valueOf(Num);

                            //---------- Write spisk File

                            File file1 = new File("CardData/spiskaNum.txt");
                            OutputStream outputStream1 = new FileOutputStream(file1);
                            outputStream1.write(num.getBytes(StandardCharsets.UTF_8));

                            //---------------Income and Expenditure write

                            OutputStream outputStream = new FileOutputStream(file,true);
                            outputStream.write(obj1.getBytes(StandardCharsets.UTF_8));
                            outputStream.write(obj2.getBytes(StandardCharsets.UTF_8));
                            jsonObject.remove("Year");
                            jsonObject.remove("Data");
                            jsonObject.remove("Clock");
                            inserted.remove("Year");
                            inserted.remove("Data");
                            inserted.remove("Clock");

                            //---------------Json file write money

                            jsonArray.set(CheckCard.globalNum, inserted);
                            Gson gson = new GsonBuilder().setPrettyPrinting().create();
                            File out1 = new File("CardData/json/cardData.json");
                            OutputStream output1 = new FileOutputStream(out1);
                            output1.write(gson.toJson(jsonArray).getBytes(StandardCharsets.UTF_8));
                            System.out.println("------=Successfully=-------");
                        }else {
                            System.out.println("There is not enough money in your account.");
                        }
                    }else {
                        System.out.println("Your card is blocked");
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public void seeBalanc(JSONArray inserted) {
        JSONObject jsonObject =null;
            jsonObject = (JSONObject) inserted.get(CheckCard.globalNum);

        System.out.println(jsonObject.get("balance"));
    }

    @Override
    public void exchangeInfo() {
        try{
            URL url = new URL("https://cbu.uz/oz/arkhiv-kursov-valyut/json/");
            URLConnection connection = url.openConnection();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
            JSONArray jsonArray = gson.fromJson(reader, JSONArray.class);
            for (int i = 0; i < jsonArray.size(); i++) {
                Map jsonObject = (Map) jsonArray.get(i);
                System.out.println("-----"+jsonObject.get("Ccy")+"-----");
                System.out.println(jsonObject.get("CcyNm_EN"));
                System.out.println(jsonObject.get("Rate"));
                System.out.println(jsonObject.get("Diff"));
                System.out.println(jsonObject.get("Date"));
                System.out.println("=======================");
            }

        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
