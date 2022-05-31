package uz.bepro.projects;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.out;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Advanced-Project-Lesson2}
 * @Date: {2022/05/28 && 2:48 PM}
 */
public class FileWords {
    public static void main(String[] args) throws IOException {
        //Blank Document
        XWPFDocument document = new XWPFDocument();

        // Create a blank spreadsheet
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText("purpose in the domains of Academics, Information ");

        //document.write(out);
        //out.close();
        //Write the Document in file system
        FileOutputStream out = new FileOutputStream( new File("hero1.docx"));
        document.write(out);
        out.close();
        System.out.println("createdocument.docx written successully");
    }
}
