package uz.bepro;

import java.io.*;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Fayl-Lesso2}
 * @Date: {2022/05/24 && 9:51 AM}
 */
public class ReaderSample {
    public static void main(String[] args) {

        try {
            Reader reader = new FileReader("/Users/urunov/Documents/Algorithms/Java-Core-Projects/README.md");
            while (reader.ready()) {
              //  System.out.println(reader.read());
                System.out.println((char)reader.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
