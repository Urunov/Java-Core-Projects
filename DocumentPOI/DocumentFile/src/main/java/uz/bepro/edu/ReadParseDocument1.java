package uz.bepro.edu;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @project: DocumentFile
 * @Date: 08.09.2022
 * @author: H_Urunov
 **/
public class ReadParseDocument1 {
    public static void main(String[] args) throws IOException {

        String fileName = "mydocument.docx";

        try (XWPFDocument doc = new XWPFDocument(
           Files.newInputStream(Paths.get(fileName)))) {

            XWPFWordExtractor xwpfWordExtractor = new XWPFWordExtractor(doc); // extract doc file
            String docText = xwpfWordExtractor.getText();
            System.out.println(docText);

            // find number of words in the document
            long count = Arrays.stream(docText.split("\\s+")).count();
            System.out.println("Total words: " + count);
        }
    }
}
