package uz.bepro.tasks.books;

import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/12 && 7:29 PM}
 */
public class Books extends Author{
    //
    private String name;
    private List<String> authors;
    private String ISBN;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

        System.out.println("BOOK: " + getName() + " " + getISBN() + "  " + getPrice() + "  " + getAuthors());
    }
}
