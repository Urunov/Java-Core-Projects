package uz.bepro;

import java.io.File;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Fayl-Lesson1}
 * @Date: {2022/05/21 && 12:15 PM}
 */
public class FolderIO {
    public static void main(String[] args) {

        File folder = new File("logStore/logFiles/progress/");

        System.out.println(folder.mkdirs());

        if(folder.mkdir()){
             System.out.println("Papka created .... ");
         } else{
             System.out.println("Papka already here ...."); // Papka - folder.
         }


    }
}

