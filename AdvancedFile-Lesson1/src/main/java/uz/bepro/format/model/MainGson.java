package uz.bepro.format.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {AdvancedFile-Lesson1}
 * @Date: {2022/05/26 && 9:08 PM}
 */
public class MainGson {
    public static void main(String[] args) {
        // step-4. GSON Builder.
        User users = new User("Petrov Lukan", 1822, true);
      //  Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        System.out.println(gson.toJson(users));


        Post post1 = new Post(1, "he", "Soon");
        Gson gson1 = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        System.out.println(gson1.toJson(post1));
    }
}
