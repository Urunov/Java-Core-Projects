package uz.bepro.animals;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaInhertance}
 * @Date: {2022/04/06 && 12:18 AM}
 */
public class MainAnimals {
    public static void main(String[] args) {


        Horse horse = new Horse();

        horse.age = 3;
        horse.name = "Mustang";
        horse.speed = 3.2;

        System.out.println(horse);

        Fish fish = new Fish();
        fish.name ="GoldFish";
        fish.age = 1;
        fish.setSwim("able");

        System.out.println(fish);
    }
}
