package uz.bepro.tasks.books;

import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/12 && 7:35 PM}
 */
public class MainBooks {
    public static void main(String[] args) {

            Books books = new Books();
            books.setBookName("Darkest Hour");
            books.setISBN("222122100932");
            books.setPrice(222.2);
            books.setAuthors(
                    List.of("Ter", "Jery", "Bob")
            );
            books.setAuthors(
                    List.of("Ozod", "Terry", "Jhon", "Xon", "Alex")
            );
            books.getAuthors();

            books.bookInfo();
            System.out.println(books.toString());

            Books books1 = new Books();

            books1.authorInfo("Tonny", "antony");
            books1.authorInfo("Tolstoy", "Mihayl");
            books1.authorInfo("Shevchenko", "Sergey");
            books1.authorInfo("Donik", "SHevchono");
            books1.authorInfo("Daminbek", "Lenov", 234.3);
            System.out.println(books1.toString());

    }
}
