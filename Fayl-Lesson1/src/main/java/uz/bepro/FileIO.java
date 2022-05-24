package uz.bepro;

import java.io.File;
import java.io.IOException;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Fayl-Lesson1}
 * @Date: {2022/05/21 && 10:38 AM}
 */
public class FileIO {
    public static void main(String[] args) {

        // step-1: Create file
        File file = new File("files/Muqumiy.txt"); // window: d://hello.txt
        try {
            System.out.println(file.getFreeSpace());
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
