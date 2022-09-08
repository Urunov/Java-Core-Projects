package uz.bepro.edu;

import org.apache.logging.log4j.LogManager;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @project: ${PROJECT_NAME}
 * @Date: ${DATE}
 * @author: ${USER}
 **/

public class DocumentFile {
    public static void main(String[] args) {
        System.out.println("Word Document!");

     //   String fileName = "mydocument.docx";
        String fileName = "template.docx";
        // Logger.getLogger(String.valueOf(DocumentFile.class));
        LogManager.getLogger(DocumentFile.class.getName());

        try (XWPFDocument doc = new XWPFDocument()) {

            // create a paragraph
            XWPFParagraph p1 = doc.createParagraph();
            p1.setAlignment(ParagraphAlignment.CENTER);

            // set font
            XWPFRun r1 = p1.createRun();
            r1.setBold(true);
            r1.setItalic(true);
            r1.setFontSize(22);
            r1.setFontFamily("Arial"); // your setting format.
          //  r1.setText("I am first paragraph. My document file. Interesting Proecess ");
            r1.setText("Hello ${name}, Congratulations, you are learning something new!. And we will replace the string ${name} with a predefined input and create a new file ");

            // save it to .docx file
            try (FileOutputStream out = new FileOutputStream(fileName)) {
                doc.write(out);
                System.out.println("Process complated.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}