package uz.bepro.edu;

import org.apache.logging.log4j.LogManager;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @project: DocumentFile
 * @Date: 08.09.2022
 * @author: H_Urunov
 **/
public class DocumentWorkingParagraph {
    public static void main(String[] args) throws IOException {


        LogManager.getLogger(DocumentFile.class.getName());


        try (XWPFDocument doc = new XWPFDocument()) {

            XWPFParagraph p1 = doc.createParagraph();
            p1.setAlignment(ParagraphAlignment.CENTER);

            // Set Text to Bold and font size to 22 for first paragraph
            XWPFRun r1 = p1.createRun();
            r1.setBold(true);
            r1.setItalic(true);
            r1.setFontSize(22);
            r1.setText("I am first paragraph. My Text is bold, italic, Courier and capitalized");
            r1.setFontFamily("Courier");

            XWPFParagraph p2 = doc.createParagraph();
            //Set color for second paragraph
            XWPFRun r2 = p2.createRun();
            r2.setText("I am second paragraph. My Text is Red in color and is embossed");
            r2.setColor("ff0000");
            r2.setEmbossed(true);

            XWPFParagraph p3 = doc.createParagraph();
            //Set strike for third paragraph and capitalization
            XWPFRun r3 = p3.createRun();
            r3.setStrikeThrough(true);
            r3.setCapitalized(true);
            r3.setText("I am third paragraph. My Text is strike through and is capitalized");

            XWPFParagraph p4 = doc.createParagraph();
            p4.setWordWrapped(true);
            p4.setPageBreak(true);  // new page break
            p4.setIndentationFirstLine(600);

            XWPFRun r4 = p4.createRun();
            r4.setFontSize(40);
            r4.setItalic(true);
            //r4.setTextPosition(100);
            r4.setText("Line 1");
            r4.addBreak();
            r4.setText("Line 2");
            r4.addBreak();
            r4.setText("Line 3");

            // save the docs
            try (FileOutputStream out = new FileOutputStream("simple.docx")) {
                doc.write(out);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
