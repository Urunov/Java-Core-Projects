package uz.bepro;

import uz.bepro.enums.Season;
import uz.bepro.model.SeasonClass;

import java.util.*;

import static uz.bepro.enums.Season.*;

/**
 * @Company: {BePro}
 * @Author: {urunov}
 * @Project: {Enum-Lesson1}
 * @Date: {2022/05/09 && 9:25 AM}
 */
public class MainPoly {
    private static final Season WINTER = Season.WINTER;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Season spring = Season.SPRING;
        Season winter = Season.WINTER;
        Season autumn = Season.AUTUMN;
        Season summer = Season.SUMMER;


        String giveSeason = spring.name();
        System.out.println(giveSeason);
        System.out.println(spring.getNameRus());


        // step-1: Original
        System.out.println("  " +spring.ordinal());

        //step-2: Array
        Season[] seasons = {spring, winter, autumn, summer};
        Season[] seasons1 = Season.values();

        for (Season season : seasons1) {
            System.out.print(" " +season);
        }
        System.out.println("");
        System.out.println("-----");
        // step-3.
        System.out.println("Enter Season Name:  ");
        Season sezon = Season.valueOf(scanner.nextLine().toUpperCase());
        System.out.println(sezon.getTemperature());
        System.out.println(sezon.getNameRus());

        // Collection: SET
        Set<Season> sezons = EnumSet.allOf(Season.class);
        System.out.println(sezons);

        System.out.println("-------");
        sezons.forEach(System.out::println);

        //
        System.out.println("COllection ENUM > ");
        EnumSet<Season> range = EnumSet.range(AUTUMN, WINTER);
        System.out.println(range);
    }
}
