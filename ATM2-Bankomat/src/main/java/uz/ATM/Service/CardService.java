package uz.ATM.Service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;

public interface CardService {
    void addCard() throws FileNotFoundException;
    void historyCard(JSONArray inserted) throws FileNotFoundException;
    void throwMoney(JSONArray inserted);
    void seeBalanc(JSONArray inserted);
    void exchangeInfo();
}
