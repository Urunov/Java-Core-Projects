package example;

/**
 * @project: OOP-Project9
 * @Date: 02.08.2022
 * @author: H_Urunov
 **/
public abstract class Animal{
    //
    int age;
    String name;

//    public abstract void makeNoise(){
//        System.out.println("Moiev");
//    }

    public abstract void makeNoise();

    public void printName(){
        System.out.println("Name is: " + name);
    }

}
