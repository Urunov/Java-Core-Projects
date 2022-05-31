package uz.bepro;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Fayl-Lesson1}
 * @Date: {2022/05/21 && 12:56 PM}
 */
public class OutputStreamSample {
    public static void main(String[] args) throws IOException {

         File nashFile =  new File("folderSample/util/account.txt");
//       // File file = new File("files/file1.txt");
//        try {
//            nashFile.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream(nashFile, true); // without append > default = false.
            String s = " \n File in Folder our class! ukam";

            outputStream.write(s.getBytes(StandardCharsets.UTF_8));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {

        }
    }
}
