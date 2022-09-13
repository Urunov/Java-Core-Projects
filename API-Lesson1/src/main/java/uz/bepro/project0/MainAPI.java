package uz.bepro.project0;

import com.google.gson.Gson;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

/**
 * @project: API-Lesson1
 * @Date: 13.09.2022
 * @author: H_Urunov
 **/
public class MainAPI {
    public static void main(String[] args) throws IOException {

        File myfile = new File("posts1.txt");
        myfile.createNewFile(); // if file already exists will do nothing
        FileOutputStream oFile = new FileOutputStream(myfile, false);

        // Just use existing file
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("posts.txt"))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

//            Type type = new TypeToken<ArrayList<Post>>(){}.getType();
//            Reader reader = new InputStreamReader(urlConnection.getInputStream());
//            ArrayList<uz.bepro.projects1.model.Post> posts = gson.fromJson(reader, type);



            Post[] posts = gson.fromJson(bufferedReader, Post[].class);
            System.out.println(gson.toJson(posts));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
