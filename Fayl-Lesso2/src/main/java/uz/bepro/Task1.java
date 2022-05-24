package uz.bepro;

import java.io.File;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Fayl-Lesso2}
 * @Date: {2022/05/24 && 9:04 AM}
 */
public class Task1 {
    public static void main(String[] args) {
        task1("/Users/urunov/Documents/Algorithms/Java-Core-Projects/README.md");
    }

    public static void task1(String pathName){
        File file = new File(pathName);
        if (file.exists()){
            System.out.println(file.isFile()?"Fayl" : "papka");
        } else{
            System.out.println("PathName is not correct.");
        }
    }
}
