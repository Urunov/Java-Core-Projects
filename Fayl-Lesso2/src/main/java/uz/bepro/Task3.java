package uz.bepro;

import java.io.File;
import java.util.Scanner;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Fayl-Lesso2}
 * @Date: {2022/05/24 && 9:32 AM}
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your searching WORD...");

        String searchText = scanner.nextLine().toLowerCase();
        task3("/Users/", searchText);

    }

    public static void task3(String pathName, String searchText){

        File folder = new File(pathName);
        if (folder.exists()){
            File[] files = folder.listFiles();

            for (File file: files){
                if (file.getName().contains(searchText)){
                    System.out.println("YES: "+file.getAbsolutePath());
                }
                if (file.isDirectory()){
                    task3(file.getAbsolutePath(), searchText);
                }
            }
        }else {
            System.out.println("PathName is not correct.");
        }
    }
}
