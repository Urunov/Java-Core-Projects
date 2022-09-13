package uz.bepro.edu;

import org.apache.poi.wp.usermodel.HeaderFooterType;
import org.apache.poi.xwpf.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @project: DocumentFile
 * @Date: 08.09.2022
 * @author: H_Urunov
 **/
public class DocumentHeadFoot {
    public static void main(String[] args) {

        try (XWPFDocument doc = new XWPFDocument()) {

            XWPFParagraph p = doc.createParagraph();
            XWPFRun r = p.createRun();
            r.setBold(true);
            r.setFontSize(30);
            r.setText("Create document header and footer!");

            // next page
            XWPFParagraph p2 = doc.createParagraph();
            p2.setWordWrapped(true);
            p2.setPageBreak(true);  // new page break

            XWPFRun r2 = p2.createRun();
            r2.setFontSize(40);
            r2.setItalic(true);
            r2.setText("New Page");

            // document header and footer
            XWPFHeader head = doc.createHeader(HeaderFooterType.DEFAULT);
            head.createParagraph()
                    .createRun()
                    .setText("This is document header");

            XWPFFooter foot = doc.createFooter(HeaderFooterType.DEFAULT);
            foot.createParagraph()
                    .createRun()
                    .setText("This is document footer");

            try (OutputStream os = new FileOutputStream(new File("headersample.docx"))) {
                doc.write(os);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
