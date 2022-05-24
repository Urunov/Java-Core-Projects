package uz.bepro;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Fayl-Lesson1}
 * @Date: {2022/05/21 && 12:48 PM}
 */
public class FileIOLogic {
    public static void main(String[] args) {
        //
        // step-1: Logic
        File file = new File("files/Muqumiy1.txt");
        if (file.exists()){
            System.out.println("Yes there is file");
        } else{
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("NO such file in here.");
        }

        // step-2. Address file
        System.out.println(file.getParent());
        System.out.println(file.getParentFile());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(new Date(file.lastModified()));
    }
}
