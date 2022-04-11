package uz.bepro.project.tasks;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {InhertanceImp}
 * @Date: {2022/04/11 && 4:11 PM}
 */
public class Bird extends Animals implements Flying{

    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }

    @Override
    void voice() {

    }
}
