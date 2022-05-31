package uz.bepro.projects;

import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Advanced-Project-Lesson2}
 * @Date: {2022/05/28 && 3:41 PM}
 */
public class FileWordBorder {
    public static void main(String[] args) throws IOException {

        //Blank Document
        XWPFDocument document = new XWPFDocument();

        //Write the Document in file system
        FileOutputStream out = new FileOutputStream(new File("applyingborder.docx"));

        //create paragraph
        XWPFParagraph paragraph = document.createParagraph();

        //Set bottom border to paragraph
        paragraph.setBorderBottom(Borders.BASIC_BLACK_DOTS);

        //Set left border to paragraph
        paragraph.setBorderLeft(Borders.BASIC_WIDE_INLINE);

        //Set right border to paragraph
        paragraph.setBorderRight(Borders.BASIC_BLACK_DASHES);

        //Set top border to paragraph
        paragraph.setBorderTop(Borders.BASIC_BLACK_DASHES);

        XWPFRun run = paragraph.createRun();
        run.setText(" Java Languages HHHHHH.");

        document.write(out);
        out.close();
        System.out.println("applyingborder.docx written successully");

    }
}
