package uz.bepro.projects;

import org.pdfbox.exceptions.COSVisitorException;
import org.pdfbox.pdmodel.PDDocument;

import java.io.IOException;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Advanced-Project-Lesson2}
 * @Date: {2022/05/28 && 3:52 PM}
 */
public class FilePDF {
    public static void main(String[] args) throws IOException, COSVisitorException {


        //Creating PDF document object
        PDDocument document = new PDDocument();

        //Saving the document
        document.save("my_doc.pdf");

        System.out.println("PDF created");

        //Closing the document
        document.close();
    }
}
