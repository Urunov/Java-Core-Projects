package uz.bepro.projects.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * @Company: {BeProAcademy}
 * @Author: {urunov}
 * @Project: {API-Lesson1}
 * @Date: {2022/05/31 && 4:16 PM}
 */
public class JsonPHProject {
    public static void main(String[] args) {
        //https://jsonplaceholder.typicode.com/

        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");
            URLConnection urlConnection = url.openConnection();

            Gson gson = new Gson();
            Type type = new TypeToken<ArrayList<Post>>(){}.getType();
            Reader reader = new InputStreamReader(urlConnection.getInputStream());
            ArrayList<Post> posts = gson.fromJson(reader, type);

            XWPFDocument document = new XWPFDocument();
            FileOutputStream file = new FileOutputStream("jsonholder.docx");

            document.write(file);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
