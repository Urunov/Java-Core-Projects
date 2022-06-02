package uz.bepro.telgram;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

/**
 * @Company: {BePro}
 * @Author: {urunov}
 * @Project: {TelgramBot}
 * @Date: {2022/06/02 && 8:58 AM}
 */
public class MainTelegram  {
    public static void main(String[] args) {

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new MyBot());
            System.out.println("Code start to run....");

        }catch (TelegramApiException e){
            e.printStackTrace();
        }

    }
}
