package uz.bepro.edu;

import org.apache.logging.log4j.LogManager;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @project: DocumentFile
 * @Date: 08.09.2022
 * @author: H_Urunov
 **/
public class CreateTable {
    public static void main(String[] args) {

        LogManager.getLogger(CreateTable.class.getName());

        try (XWPFDocument doc = new XWPFDocument()) {

            XWPFTable table = doc.createTable();

            //Creating first Row
            XWPFTableRow row1 = table.getRow(0);
            row1.getCell(0).setText("First Row, First Column");
            row1.addNewTableCell().setText("First Row, Second Column");
            row1.addNewTableCell().setText("First Row, Third Column");

            //Creating second Row
            XWPFTableRow row2 = table.createRow();
            row2.getCell(0).setText("Second Row, First Column asdf ");
            row2.getCell(1).setText("Second Row, Second Column");
            row2.getCell(2).setText("Second Row, Third Column");

            //create third row
            XWPFTableRow row3 = table.createRow();
            row3.getCell(0).setText("Third Row, First Column 22 ");
            row3.getCell(1).setText("Third Row, Second Column 3242");
            row3.getCell(2).setText("Third Row, Third Column");

            // save to .docx file
            try (FileOutputStream out = new FileOutputStream("table.docx")) {
                doc.write(out);
                System.out.println("Created.");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
