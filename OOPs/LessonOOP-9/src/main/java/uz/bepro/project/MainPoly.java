package uz.bepro.project;

import uz.bepro.project.model.Cat;
import uz.bepro.project.model.Dog;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {InhertanceImp}
 * @Date: {2022/04/11 && 1:48 PM}
 */
public class MainPoly {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.voice();


        Dog dog = new Dog();
        dog.voiceAnimal();

    }



}

/*
* 1. Abstract class needs to abstract method
* 2. Abstract method -> super class method can override sub-class
* 3. Abstract class cannot make object [Abstract classdan obekt olinmaydi]
* 4. Abstract method cannot declare in the non-abstract class.
* 5.
*
* */