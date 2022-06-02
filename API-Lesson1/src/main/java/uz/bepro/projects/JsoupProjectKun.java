package uz.bepro.projects;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * @Company: {BeProAcademy}
 * @Author: {urunov}
 * @Project: {API-Lesson1}
 * @Date: {2022/05/31 && 3:49 PM}
 */
public class JsoupProjectKun {
    public static void main(String[] args) {
        Document document = null;

        try {
            document = Jsoup.connect("https://www.kun.uz/").get();
           // Elements elements = document.getElementsByClass("news-lenta__title");
            String title = document.title();
            System.out.println(title);

            Elements elements = document.getElementsByClass("lenta__title");
                             //   document.getElementsByAttributeValue("a", "register.html")
            for (Element element : elements) {
               // System.out.println(element.text());
                System.out.println(element.text());

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
