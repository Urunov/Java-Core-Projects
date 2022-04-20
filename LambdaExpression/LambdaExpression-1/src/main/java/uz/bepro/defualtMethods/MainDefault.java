package uz.bepro.defualtMethods;

import java.net.Socket;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/15 && 6:08 PM}
 */
public class MainDefault {
    public static void main(String[] args) {
        //

     allControl();

    }

    public static void allControl(){
        TV();
        UnderControler();
    }

    public static void TV(){
        RemoteController.staticMethod();
        System.out.println(RemoteController.interfaceValue);

        TV lg = new TV();
        lg.defaultMethod();
        lg.changeChannel();

    }

    public static void UnderControler(){
        SimpleClass simpleClass = new SimpleClass();
        simpleClass.address = "Tashkent";
        System.out.println(simpleClass.address);
        simpleClass.defaultMethod();
    }
}
