package uz.bepro.project.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {InhertanceImp}
 * @Date: {2022/04/11 && 1:50 PM}
 */
public class Cat extends Animal{
    //
    @Override
    public void voice() {
        System.out.println("meo meo");
    }

    public void eatingMeal(){
        System.out.println("Cat eating meat");
    }
}
