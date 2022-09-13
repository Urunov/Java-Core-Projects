package uz.bepro.edu;


import jxl.Workbook;
import jxl.write.*;
import jxl.write.Number;

import java.io.File;
import java.io.IOException;

/**
 * @project: ExcelFileProject
 * @Date: 08.09.2022
 * @author: H_Urunov
 **/
public class ExcelFormat1 {

    private static final String EXCEL_FILE_LOCATION = "MyFormattedExcel.xls";

    public static void main(String[] args) {


        //1. Create an Excel file
        WritableWorkbook mySecondWbook = null;
        try {

            mySecondWbook = Workbook.createWorkbook(new File(EXCEL_FILE_LOCATION));
            WritableSheet myFirstSheet = mySecondWbook.createSheet("Sheet 1", 0);

            WritableCellFormat cFormat = new WritableCellFormat();
            WritableFont font = new WritableFont(WritableFont.ARIAL, 16, WritableFont.BOLD);
            cFormat.setFont(font);
            Label label = new Label(0, 0, "Test Count", cFormat);
            myFirstSheet.addCell(label);
            Number number = new Number(0, 1, 1);
            myFirstSheet.addCell(number);

            label = new Label(1, 0, "Result", cFormat);
            myFirstSheet.addCell(label);
            label = new Label(1, 1, "Passed");
            myFirstSheet.addCell(label);

            number = new Number(0, 2, 2);
            myFirstSheet.addCell(number);

            label = new Label(1, 2, "Passed 2");
            myFirstSheet.addCell(label);

            mySecondWbook.write();

        } catch (WriteException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (mySecondWbook != null) {
                try {
                    mySecondWbook.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (WriteException e) {
                    e.printStackTrace();
                }
            }


        }

    }
}
