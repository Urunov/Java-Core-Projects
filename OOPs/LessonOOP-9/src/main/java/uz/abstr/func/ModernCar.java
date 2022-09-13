package uz.abstr.func;

/**
 * @project: OOP-Abstract-Interface
 * @Date: 02.08.2022
 * @author: H_Urunov
 **/
public class ModernCar implements CarDetails{
    //
    @Override
    public void printDetails(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        ModernCar car = new ModernCar();
        car.printDetails("BMW X8.9");
    }
}
