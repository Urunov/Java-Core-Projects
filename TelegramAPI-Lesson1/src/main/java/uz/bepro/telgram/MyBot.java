package uz.bepro.telgram;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Locale;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {TelgramBot}
 * @Date: {2022/06/02 && 9:23 AM}
 */
public class MyBot extends TelegramLongPollingBot {
   //

    @Override
    public String getBotUsername() {
        return "myJavaClass";
    }

    @Override
    public String getBotToken() {
        return "5571190652:AAE1HGs7igTdFJMqfIr6bdhQ2mPPGgxZz04";
    }

    @Override
    public void onUpdateReceived(Update update) {

        String receiveMessage = update.getMessage().getText();
        String sendingMessage = receiveMessage;

        switch (receiveMessage.toLowerCase()){
            case "/start": sendingMessage="Botga Xush kelibsiz...."; break;
            case "salom": sendingMessage = "Valaykum Salom. Nimadir zadacha bormi?"; break;
            case "qalaysan": sendingMessage =" Narmalno, o'zingchi..."; break;
            case "zor": sendingMessage = "Voobshe malades"; break;

            default:
                sendingMessage = "Gap yo ukam....";

        }





        SendMessage sendMessage = new SendMessage();
        sendMessage.setText(sendingMessage);
        sendMessage.setChatId(update.getMessage().getChatId().toString());
        try {
            execute(sendMessage);
        } catch (TelegramApiException e){
            e.printStackTrace();
        }
        
    }
}
