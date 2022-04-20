package uz.bepro.tasks.books;

import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/12 && 7:29 PM}
 */
public class Books extends Author{
    //field, variables
    private String bookName;
    private List<String> authors;
    private String ISBN;
    private double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<String> getAuthors() {
        System.out.println("Authors: "+ authors);
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void listAuthors(){
        System.out.println("Authors: "+
                authors);
    }

    public void bookInfo(){

        System.out.println("BOOK: " + getBookName() + " " + getISBN() + "  " + getPrice() + "  " + getAuthors());
    }

    @Override
    public void authorInfo(String authorName, String authorLastName) {
        super.authorInfo(authorName, authorLastName);
    }

    public void authorInfo(String authorName, String bookName, double price){
        System.out.println("BOOK Info:   " + authorName + "  " + bookName + "  " + price);
    }

    @Override
    public String toString() {
        return "Books [" +
                "bookName='" + bookName + '\'' +
                ", authors=" + authors +
                ", ISBN='" + ISBN + '\'' +
                ", price=" + price +
                ']';
    }
}
