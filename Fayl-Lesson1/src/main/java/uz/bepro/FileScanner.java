package uz.bepro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Fayl-Lesson1}
 * @Date: {2022/05/21 && 2:56 PM}
 */
public class FileScanner {
    public static void main(String[] args) {
       //
        Scanner scanner = null;
        int num=0;
         try {
             scanner = new Scanner(new File("folderSample/util/account.txt"));
                while (scanner.hasNext()){

                    System.out.println(scanner.nextLine());
                    num++;
                }

             System.out.println(num);

         }catch (FileNotFoundException e){
             e.printStackTrace();
         }
    }
}
