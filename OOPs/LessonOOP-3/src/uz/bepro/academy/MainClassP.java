package uz.bepro.academy;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {lessonOOPs}
 * @Date: {2022/03/28 && 3:29 PM}
 */
public class MainClassP {
    public static void main(String[] args) {


        Country russia = new Country();
        russia.capital = "Moscow";
        russia.language = "ruski";
        russia.name = "RF";
        russia.currency = "Ruble";
        russia.population = 146.4;
        russia.history = "RUS knyaz";

        System.out.println(russia.toPrint());

        Country uzb = new Country();

        uzb.name = "Uzbekista";
        uzb.capital = "Tashkent";
        uzb.currency = "SUM";
        uzb.language = "uzbek";
        uzb.population = 34.4;
        System.out.println(uzb.toPrint());

        Country canada = new Country();
        canada.name = "Canada";
        canada.capital = "Ottowo";
        canada.currency = "Canada Dollar";
        canada.language = "English | Franch";
        canada.population = 38.4;
        canada.flag = "White and Red ";

        Country.area = 1234.3;
        System.out.println(canada.toPrint());


        Country trk = new Country();
        trk.flag = "Red";
        trk.name = "Turkey";
        trk.language = "turkish";

        Country.area = 687.34;

        System.out.println(trk.toPrint());



        Country ukraina = new Country();
        ukraina.language = "rus";
        ukraina.name = "Ukrain";
        ukraina.population = 48.9;
        ukraina.secretDocument = "Secret document";

        System.out.println(ukraina.toString());
    }
}
