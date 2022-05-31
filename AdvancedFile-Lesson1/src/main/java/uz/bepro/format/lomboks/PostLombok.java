package uz.bepro.format.lomboks;

import lombok.*;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {AdvancedFile-Lesson1}
 * @Date: {2022/05/26 && 10:54 AM}
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PostLombok {
    //
    private Integer id;
    private String title;
    private String body;

}
