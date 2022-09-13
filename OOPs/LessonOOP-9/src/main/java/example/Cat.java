package example;

/**
 * @project: OOP-Project9
 * @Date: 02.08.2022
 * @author: H_Urunov
 **/
public class Cat extends Animal implements AnimalStuff{
    //

    @Override
    public void makeNoise() {
        System.out.println("Meiya....");
    }

    @Override
    public void poop() {
        System.out.println("Phlhbnnnlpppp");
    }
}
