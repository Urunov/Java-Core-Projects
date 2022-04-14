package uz.bepro.tasks.books;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/12 && 7:32 PM}
 */
public class Author {
    //
    private String authorName;
    private String authorLastName;
    List<String> info = new ArrayList<>();

    public void authorInfo(String authorName, String authorLastName){
       info.add(authorName + "  " + authorLastName);
       System.out.println(info);
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }
}