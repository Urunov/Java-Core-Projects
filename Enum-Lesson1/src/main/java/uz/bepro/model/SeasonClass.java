package uz.bepro.model;


/**
 * @Company: {BeProAcademy}
 * @Author: {urunov}
 * @Project: {Enum-Lesson1}
 * @Date: {2022/05/09 && 9:14 AM}
 */
public class SeasonClass {
    //
    private String name;
    private String nameRus;
    private Integer temperature;

    public SeasonClass() {
    }

    public SeasonClass(String name, String nameRus) {
        this.name = name;
        this.nameRus = nameRus;
    }

    public SeasonClass(String name, String nameUz, Integer temperature) {
        this.name = name;
        this.nameRus = nameUz;
        this.temperature = temperature;
    }

    public static final SeasonClass WINTER = new SeasonClass("WINTER", "ZIMA");





    public static final SeasonClass SUMMER = new SeasonClass("SUMMER", "YOZ");
    public static final SeasonClass SPRING = new SeasonClass("SPRING", "Bahor");
    public static final SeasonClass FALL = new SeasonClass("FALL", "KUZ");

    public static final SeasonClass WINTER_TEM = new SeasonClass("WINTER", "QISH", -23);
    public static final SeasonClass SPRING_TEM = new SeasonClass("SPRING", "BAHOR", 19);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameRus() {
        return nameRus;
    }

    public void setNameRus(String nameRus) {
        this.nameRus = nameRus;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}
