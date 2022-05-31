package uz.bepro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Fayl-Lesso2}
 * @Date: {2022/05/24 && 10:24 AM}
 */
public class BufferReaderSample {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("nashrasha/scratch.json"))){
            String line;
            while ((line= bufferedReader.readLine())!=null){
                System.out.println(line);
                // logic
//                line.equals("a"){
//
//                }
                count++;
            }
            System.out.println(count);
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
