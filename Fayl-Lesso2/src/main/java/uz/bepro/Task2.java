package uz.bepro;

import java.io.File;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Fayl-Lesso2}
 * @Date: {2022/05/24 && 9:23 AM}
 */
public class Task2 {
    public static void main(String[] args) {
       task2("/Users/urunov/Documents/Algorithms/Java-Core-Projects");

    }

    public static void task2(String pathName){
        boolean director =false, file = false;

        File folder = new File(pathName);

        if (folder.isDirectory()){
            File[] files = folder.listFiles(); // masssiv, list.
            for (File file1: files){
                //director = file1.isDirectory()?true : false;
                if (file1.isDirectory()){
                    director = true;
                } else if (file1.isFile()){
                    file =true;
                }
            }
//            if (director){
//                System.out.println("Correct, papka is here.");
//            } else{
//                System.out.println("Papka, is not here ");
//            }
//
//            if (file){
//                System.out.println("Correct, File is correct");
//            } else{
//                System.out.println("File is not here.");
//            }
            System.out.println(director ? "Correct, papke is here. " : "Papka is not here.");
            System.out.println(file ? "Correct, file is here. " : "file is not here.");
        } else{
            System.out.println("pathName is not correct.");
        }
    }
}
