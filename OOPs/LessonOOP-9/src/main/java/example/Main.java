package example;

/**
 * @project: ${PROJECT_NAME}
 * @Date: ${DATE}
 * @author: ${USER}
 **/
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Cat cat = new Cat();
        cat.makeNoise();
        cat.poop();
        cat.printName();
    }
}