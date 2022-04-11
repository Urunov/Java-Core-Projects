package uz.bepro.animals;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaInhertance}
 * @Date: {2022/04/06 && 12:26 AM}
 */
public class Fish extends Animal{
    //
    private String swim; // encapsulation: private


    public String getSwim(){
        return swim;
    }

    public void setSwim(String swim){
        this.swim = swim;
    }


    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", swim='" + swim + '\'' +
                '}';
    }
}
