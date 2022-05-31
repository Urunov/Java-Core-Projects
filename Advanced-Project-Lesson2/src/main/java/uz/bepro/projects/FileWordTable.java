package uz.bepro.projects;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Advanced-Project-Lesson2}
 * @Date: {2022/05/28 && 3:44 PM}
 */
public class FileWordTable {
    public static void main(String[] args) throws IOException {

        //Blank Document
        XWPFDocument document = new XWPFDocument();

        //Write the Document in file system
        FileOutputStream out = new FileOutputStream(new File("justTable.docx"));

        //create table
        XWPFTable table = document.createTable();

        //create first row
        XWPFTableRow tableRowOne = table.getRow(0);
        tableRowOne.getCell(0).setText("col 1, row 1");
        tableRowOne.addNewTableCell().setText("col 2, row 2");
        tableRowOne.addNewTableCell().setText("col 3, row 1");

        //create second row
        XWPFTableRow tableRowTwo = table.createRow();
        tableRowTwo.getCell(0).setText("col 1, row 2");
        tableRowTwo.getCell(1).setText("col 2, row 2");
        tableRowTwo.getCell(2).setText("col 3, row 2");

        //create third row
        XWPFTableRow tableRowThree = table.createRow();
        tableRowThree.getCell(0).setText("col 1, row 3");
        tableRowThree.getCell(1).setText("col 2, row 3");
        tableRowThree.getCell(2).setText("col 3, row 3");

        //create third row
        XWPFTableRow tableRowFour = table.createRow();
        tableRowFour.getCell(0).setText("col 1, row 3");
        tableRowFour.getCell(1).setText("col 2, row 3");
        tableRowFour.getCell(2).setText("col 3, row 3");

        document.write(out);
        out.close();
        System.out.println("Create Table doc file.");
    }
}
