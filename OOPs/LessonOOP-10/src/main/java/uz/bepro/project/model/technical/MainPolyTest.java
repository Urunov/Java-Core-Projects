package uz.bepro.project.model.technical;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/15 && 1:25 AM}
 */
public class MainPolyTest {
    public static void main(String[] args) {

        TV tv = new TV();
        tv.changeChannel();
        tv.changeLanguage();
        tv.changeValue();
        tv.setVolume(10);
        tv.getVolume();

        System.out.println(TV.interfaceField);
        System.out.println(RemoteController.interfaceField);



    }
}
