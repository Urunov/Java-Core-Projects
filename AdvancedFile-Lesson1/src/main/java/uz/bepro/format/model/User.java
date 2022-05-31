package uz.bepro.format.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {AdvancedFile-Lesson1}
 * @Date: {2022/05/26 && 11:49 AM}
 */
public class User {

    private String fullName;
    private Integer birthYear;
    private Boolean gender;

    public User() {
    }

    public User(String fullName, Integer birthYear, Boolean gender) {
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", birthYear=" + birthYear +
                ", gender=" + gender +
                '}';
    }
}
