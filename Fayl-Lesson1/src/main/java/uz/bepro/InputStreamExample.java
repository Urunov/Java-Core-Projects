package uz.bepro;

import java.io.*;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Fayl-Lesson1}
 * @Date: {2022/05/21 && 12:04 PM}
 */
public class InputStreamExample {
    public static void main(String[] args) {

        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream("folderSample/util/account.txt");
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);

            String s = new String(bytes);
            System.out.println("----- Real text ------");
            System.out.println(s);

            System.out.println("----- == File Byte ------");

            for (byte aByte : bytes) {
                System.out.println(aByte);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream !=null){
                try {
                    inputStream.close();
                }catch (IOException e){
                    e.getStackTrace();
                }
            }
        }

    }
}
