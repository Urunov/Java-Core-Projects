package uz.bepro.projects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {API-Lesson1}
 * @Date: {2022/05/31 && 4:17 PM}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@PackagePrivate
public class Post {
    //https://jsonplaceholder.typicode.com/posts
    Integer id;
    Integer userId;
    String title;
    String body;
}
