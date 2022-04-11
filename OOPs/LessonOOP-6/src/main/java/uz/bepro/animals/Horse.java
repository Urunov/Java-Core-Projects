package uz.bepro.animals;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaInhertance}
 * @Date: {2022/04/06 && 12:17 AM}
 */
public class Horse extends Animal{

    double speed; // default

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", speed=" + speed +
                '}';
    }
}
