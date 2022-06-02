package uz.bepro.cbu;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import uz.bepro.cbu.model.Currency;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {API-Lesson1}
 * @Date: {2022/05/31 && 6:20 PM}
 */
public class BankCBU {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://cbu.uz/oz/arkhiv-kursov-valyut/json/");
            URLConnection connection = url.openConnection();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
            Currency[] currencies = gson.fromJson(reader, Currency[].class);
           System.out.println(gson.toJson(currencies));
           // System.out.println(gson.toJson(currencies));


        }catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

