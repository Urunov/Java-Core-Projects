package uz.bepro.project;

import uz.bepro.project.model.emp.Employee;
import uz.bepro.project.model.functional.Display;
import uz.bepro.project.model.functional.ExactClass;
import uz.bepro.project.model.technical.Projector;
import uz.bepro.project.model.technical.RemoteController;
import uz.bepro.project.model.technical.TV;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/11 && 5:42 PM}
 */
public class MainPoly {
    public static void main(String[] args) {

        // Step-1.
        Employee employee = new Employee();
        employee.a=5;

        // step-2. ---> see MainPolyTest.




        // step-3.
        RemoteController.staticMethod();

        TV tv = new TV();
        tv.changeChannel();
        System.out.println(TV.interfaceField);
        tv.extraMethod();

        tv.defaultMethod();

        // step-4.

        // Anonym class (--> till java 8.)
        // cannot
//        Display display = new Display() {
//            @Override
//            public void swich() {
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


        Projector projector = new Projector();
        projector.changeChannel();
        projector.changeValue();
        projector.extraMethod();

        projector.defaultMethod();
    }
}
