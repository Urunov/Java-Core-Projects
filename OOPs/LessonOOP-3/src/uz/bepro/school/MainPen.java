package uz.bepro.school;

import uz.bepro.academy.Country;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {lessonOOPs}
 * @Date: {2022/03/28 && 4:01 PM}
 */
public class MainPen {
    public static void main(String[] args) {

        Pen ruchka = new Pen("Black");
        ruchka.inkLevel = 100;
        ruchka.clickButton();
       // ruchka.write("hello again");

        Pen ruchkaPres = new Pen("Black", 100, true, 10);
        ruchkaPres.write("Assalomu      alaykum ");




    }
}
