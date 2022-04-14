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
            books.setName("Darkest Hour");
            books.setISBN("222122100932");
            books.setPrice(222.2);
            books.setAuthors(
               List.of("Ter", "Jery", "Bob")
            );
           // books.getAuthors();

            books.authorInfo("Tonny", "antony");
            books.authorInfo("Tolstoy", "Mihayl");
            books.authorInfo("Shevchenko", "Sergey");
            books.bookInfo();

    }
}
