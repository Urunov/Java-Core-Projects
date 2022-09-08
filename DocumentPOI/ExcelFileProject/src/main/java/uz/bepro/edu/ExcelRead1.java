package uz.bepro.edu;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

/**
 * @project: ExcelFileProject
 * @Date: 08.09.2022
 * @author: H_Urunov
 **/
public class ExcelRead1 {

    private static final String EXCEL_FILE_LOCATION = "MyFirstExcel.xls";

    public static void main(String[] args) {
        Workbook workbook = null;
        try {

            workbook = Workbook.getWorkbook(new File(EXCEL_FILE_LOCATION));

            Sheet sheet = workbook.getSheet(0);
            Cell cell1 = sheet.getCell(0, 0);
            System.out.print(cell1.getContents() + ":");    // Test Count + :
            Cell cell2 = sheet.getCell(0, 1);
            System.out.println(cell2.getContents());        // 1

            Cell cell3 = sheet.getCell(1, 0);
            System.out.print(cell3.getContents() + ":");    // Result + :
            Cell cell4 = sheet.getCell(1, 1);
            System.out.println(cell4.getContents());        // Passed

            System.out.print(cell1.getContents() + ":");    // Test Count + :
            cell2 = sheet.getCell(0, 2);
            System.out.println(cell2.getContents());        // 2

            System.out.print(cell3.getContents() + ":");    // Result + :
            cell4 = sheet.getCell(1, 2);
            System.out.println(cell4.getContents());        // Passed 2

            System.out.print(cell3.getContents() + ":");    //
            cell4 = sheet.getCell(4, 12);
            System.out.println(cell4.getContents());        //
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        } finally {

            if (workbook != null) {
                workbook.close();
            }

        }

    }
}
