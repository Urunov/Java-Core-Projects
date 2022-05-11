package uz.bepro.enums;

import uz.bepro.model.SeasonClass;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Enum-Lesson1}
 * @Date: {2022/05/09 && 9:26 AM}
 */
public enum Season {
    //

    SPRING,
    SUMMER,
    AUTUMN,
    WINTER; // public static final;


    private String initialName;
    private String nameRus;
    private String nameUz;
    private Integer temperature;

    Season() {
    }

    Season(String initialName, String nameRus, String nameUz, Integer temperature) {
        this.initialName = initialName;
        this.nameRus = nameRus;
        this.nameUz = nameUz;
        this.temperature = temperature;
    }

    Season(String initialName, String nameRus, Integer temperature) {
        this.initialName = initialName;
        this.nameRus = nameRus;
        this.temperature = temperature;
    }

    Season(String initialName, String nameRus) {
        this.initialName = initialName;
        this.nameRus = nameRus;
    }

    public String getNameRus() {
        return nameRus;
    }


    public Integer getTemperature() {
        return temperature;
    }
}
