package uz.cbu.bankBot.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Currency;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {TelgramBot}
 * @Date: {2022/06/02 && 9:55 AM}
 */
public class CbuApiUtil {
   
    public Currency[] connectToCbuApi(){
        try {
            URL url = new URL("https://cbu.uz/oz/arkhiv-kursov-valyut/json/");
            URLConnection connection = url.openConnection();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
            Currency[] currencies = gson.fromJson(reader, Currency[].class);
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String convertion(String convertMessage){

        boolean convertionType = convertMessage.startsWith("UZS");

        Currency[] currencies = connectToCbuApi();
        Currency currentCurrency = null;
        for (Currency currency : currencies) {
            if(convertMessage.contains(currency.getCcy())){
                currentCurrency = currency;
            }
        }
        return currentCurrency.toString();

    }
}
