package uz.bepro.format.model;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {AdvancedFile-Lesson1}
 * @Date: {2022/05/26 && 10:55 AM}
 */
public class MainFiles {
    public static void main(String[] args) throws IOException {

       //  File file = new File("test/advanced/post/posting.txt");
       // file.mkdirs();
       // file.createNewFile();


        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("advanced/post/posting1.txt"))) {
           //step-1. Simple way

//                String line;
//
//                while ((line=bufferedReader.readLine())!=null){
//                    System.out.println(line);
//                }

          // step-2. GSON makes Serializable and Deserializable

            Gson gson = new Gson();

            Post posting = gson.fromJson (bufferedReader, Post.class/*object type*/);
            System.out.println(posting);
//
//
//            // step-3. GSON (String)--> JSON
//
            User user = new User("Urunov Hamdamboy", 1987, true);
            System.out.println(gson.toJson(user));
            gson.toJson(user);

            // step-4. GSON Builder.
            User users = new User("Petrov Lukan", 1822, true);
            Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
            System.out.println(gson1.toJson(user));

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
