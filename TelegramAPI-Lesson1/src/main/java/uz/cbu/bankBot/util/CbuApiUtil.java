package uz.cbu.bankBot.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import uz.cbu.bankBot.model.Currency;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {TelgramBot}
 * @Date: {2022/06/02 && 9:55 AM}
 */
public class CbuApiUtil {

    public Currency[] connectToCbuApi(){
        Currency[] currencies = null;

        try {
            URL url = new URL("https://cbu.uz/oz/arkhiv-kursov-valyut/json/");
            URLConnection connection = url.openConnection();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
             currencies = gson.fromJson(reader, Currency[].class);
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return currencies;
    }

    public Currency convertion(String convertMessage){

        boolean convertionType = convertMessage.startsWith("UZS");

        Currency[] currencies = connectToCbuApi();
        Currency currentCurrency = null;
        for (Currency currency : currencies) {
            if(convertMessage.contains(currency.getCcy())){
                currentCurrency = currency;
            }
        }
        return currentCurrency;
    }

    public String convertion(String summa){
        Double sum = Double.parseDouble(summa);

    }
}
