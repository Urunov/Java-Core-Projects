package uz.bepro.format.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {AdvancedFile-Lesson1}
 * @Date: {2022/05/26 && 10:54 AM}
 */
public class Post {
    //
    private Integer id;
    private String title;
    private String body;

    public Post(Integer id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
