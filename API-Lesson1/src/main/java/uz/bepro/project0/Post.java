package uz.bepro.project0;

import lombok.AllArgsConstructor;
import lombok.Data;
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

/**
 * Create Project using open API (https://jsonplaceholder.typicode.com/posts)
 * -------------------------------------------------------------------------
 *  1. Create POST class
 *  2. using details information
 *  3. install Lombok plugin
 *  4. create annotation for project.
 *  5. Create Gson builder.
 * */
