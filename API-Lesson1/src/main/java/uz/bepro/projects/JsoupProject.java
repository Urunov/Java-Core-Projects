package uz.bepro.projects;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @Company: {BeProAcademy}
 * @Author: {urunov}
 * @Project: {API-Lesson1}
 * @Date: {2022/05/31 && 3:21 PM}
 */
public class JsoupProject {
    public static void main(String[] args) {

        webSiteJsoup();
    }

    public static void webSiteJsoup(){

      Document doc = null;
        //https://www.javatpoint.com/jsoup-api
        try {
            doc = Jsoup.connect("https://www.javatpoint.com/").get();

            // Logic.
            String title = doc.title();

            Elements links = doc.select("a[href]");
            for (Element link : links) {
                System.out.println("\nlink : " + link.attr("href"));
                System.out.println("text : " + link.text());
                System.out.println("tag : " + link.tagName());
            }


          //  ScheduledExecutorService
            Document document = Jsoup.parse(new File("e:\\register.html"),"utf-8");
            Element loginform = document.getElementById("registerform");

            Elements inputElements = loginform.getElementsByTag("input");
            for (Element inputElement : inputElements) {
                String key = inputElement.attr("name");
                String value = inputElement.attr("value");
                System.out.println("Param name: "+key+" \nParam value: "+value);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
