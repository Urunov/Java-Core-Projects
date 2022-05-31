package uz.bepro.projects;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Advanced-Project-Lesson2}
 * @Date: {2022/05/28 && 4:37 PM}
 */
public class ConnectionExample {
    public static void main(String[] args) {

        try {
            //URL url = new URL("https://kun.uz/rss");
            //URL url = new URL("https://jsonplaceholder.typicode.com/posts");
            URL url = new URL("https://api.github.com/users");

            URLConnection urlConnection = url.openConnection();

            BufferedInputStream inputStream = new BufferedInputStream(urlConnection.getInputStream());
            int i;
            while ((i=inputStream.read())!=-1){
                System.out.print((char)i);
            }


        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException ioException){
            ioException.printStackTrace();
        }

    }
}
