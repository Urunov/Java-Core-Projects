package uz.bepro.project;

import uz.bepro.project.model.Display;
import uz.bepro.project.model.ExactClass;
import uz.bepro.project.model.RemoteController;
import uz.bepro.project.model.TV;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/11 && 5:42 PM}
 */
public class MainPoly {
    public static void main(String[] args) {

        RemoteController.staticMethod();

        TV tv = new TV();
        tv.changeChannel();
        System.out.println(TV.interfaceField);
        tv.extraMethod();

        tv.defaultMethod();

        // Anonym class
//        Display display = new Display() {
//            @Override
//            public void swich() {
//              System.out.print("Hello Display");
//              System.out.print("Hello Display");
//            }
//        };

        // Concert Class
        ExactClass exactClass = new ExactClass();
        exactClass.methodA();
        exactClass.methodB();
        exactClass.swich();

        // Java 8. Lambda expression
        Display lambdaDisplay = () ->{
            System.out.println("Hello .. .");
            System.out.println("World~!");

        };
        lambdaDisplay.methodA();
    }
}
