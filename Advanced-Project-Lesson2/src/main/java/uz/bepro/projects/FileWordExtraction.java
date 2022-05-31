package uz.bepro.projects;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Advanced-Project-Lesson2}
 * @Date: {2022/05/28 && 3:48 PM}
 */
public class FileWordExtraction {
    public static void main(String[] args) throws IOException {
        //
        XWPFDocument docx = new XWPFDocument(new FileInputStream("hero.docx"));

        //using XWPFWordExtractor Class
        XWPFWordExtractor we = new XWPFWordExtractor(docx);
        System.out.println(we.getText());

    }
}
