package uz.projects.exp;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Exception-Lesson0}
 * @Date: {2022/05/16 && 6:48 PM}
 */
public class MultiCatchSample {
    public static void main(String[] args) {
        try {
            int massive1 [] = new int[4];
            massive1[2] = 30/90;

        } catch (ArithmeticException a){
            System.out.println("Task1 is completed. 0 ga bo'lishi mn emas,=");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Task2 is  completed.");
        } catch (Exception e){
            System.out.println("Common task completed.");
        }

        finally {
            System.out.println("Gooooood.");
        }
    }
}
