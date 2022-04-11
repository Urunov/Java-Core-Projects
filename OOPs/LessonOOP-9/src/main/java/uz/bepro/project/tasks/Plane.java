package uz.bepro.project.tasks;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {InhertanceImp}
 * @Date: {2022/04/11 && 4:11 PM}
 */
public class Plane implements Flying, Technics{

    public boolean state;

    @Override
    public void fly() {

        if (state){
            System.out.println("Plane is flying now.");
        } else{
            System.out.println("Plane is not flying now, dvigatel cannot turn on.");
        }
    }

    @Override
    public void turnOnOf() {
        state =!state;
    }

    @Override
    public void repair() {
        System.out.println("Preparing is possible.");
    }
}
