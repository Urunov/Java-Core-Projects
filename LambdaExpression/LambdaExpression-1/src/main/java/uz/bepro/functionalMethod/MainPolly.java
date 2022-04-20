package uz.bepro.functionalMethod;

import java.util.WeakHashMap;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/15 && 6:28 PM}
 */
public class MainPolly {
    public static void main(String[] args) {

        // step-1. Anonym class
        // why need anonym class- if you want to use only 1 time.

        ExactClass exactClass = new ExactClass();
        exactClass.switchValue();
        exactClass.showMe();

        Display display = new Display() {
            @Override
            public void switchValue() {
                System.out.println("Just only one Radio product....");
            }
        };

        display.showMe();


        // step-2. Concrate Class
        ExactClass exactClass1 = new ExactClass();
        exactClass1.switchValue();
        exactClass1.showMe();

        //step-3. From Java-8. Lambda Expression
        Display lambdaDisplay = () -> {
            System.out.println("Hello Lambda ... ");
            int a = 9;
            System.out.println("Result: " + (a+1));
        };
        lambdaDisplay.switchValue();

        Display heyLambda = () -> {
            System.out.println("Hey result here. ");
        };
        heyLambda.switchValue();



        /*
        *  () -- shown method
        *  -> lambda expression
        *  inside the method show sout.
        * */

    }
}
// Abstract class possible to inheritance,