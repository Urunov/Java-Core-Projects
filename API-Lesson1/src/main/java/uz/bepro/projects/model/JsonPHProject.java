package uz.bepro.projects.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.poi.xwpf.usermodel.*;

import java.io.*;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * @Company: {BeProAcademy}
 * @Author: {urunov}
 * @Project: {API-Lesson1}
 * @Date: {2022/05/31 && 4:16 PM}
 */
public class JsonPHProject {
    public static void main(String[] args) {
        //https://jsonplaceholder.typicode.com/

        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");
            URLConnection urlConnection = url.openConnection();

            Gson gson = new Gson();
            Type type = new TypeToken<ArrayList<Post>>(){}.getType();
            Reader reader = new InputStreamReader(urlConnection.getInputStream());
            ArrayList<Post> posts = gson.fromJson(reader, type);

            XWPFDocument document = new XWPFDocument();
            document.createParagraph().createRun().setText("List of Post information: ");
            XWPFTable xwpfTable = document.createTable();
            XWPFTableRow tableRow = xwpfTable.getRow(0);
            tableRow.getCell(0).setText("Id");
            tableRow.addNewTableCell().setText("User Id");
            tableRow.addNewTableCell().setText("Title");
            tableRow.addNewTableCell().setText("Body");

            for (Post post : posts) {
                tableRow  = xwpfTable.createRow();
//                //create paragraph
//                XWPFParagraph paragraph = document.createParagraph();
//
//                //Set bottom border to paragraph
//                paragraph.setBorderBottom(Borders.BASIC_BLACK_DOTS);
//
//                //Set left border to paragraph
//                paragraph.setBorderLeft(Borders.BASIC_WIDE_INLINE);
//
//                //Set right border to paragraph
//                paragraph.setBorderRight(Borders.BASIC_BLACK_DASHES);
//
//                //Set top border to paragraph
//                paragraph.setBorderTop(Borders.BASIC_BLACK_DASHES);
                tableRow.getCell(0).setText(post.getId().toString());
                tableRow.getCell(1).setText(post.getUserId().toString());
                tableRow.getCell(2).setText(post.getTitle());
                tableRow.getCell(3).setText(post.getBody());

            }

            FileOutputStream file = new FileOutputStream("jsonholder.docx");
            System.out.println("Process completed.");
            document.write(file);

        }catch (MalformedURLException ee){
            ee.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
