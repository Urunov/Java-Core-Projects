package uz.bepro.oop.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-8}
 * @Date: {2022/04/09 && 7:21 PM}
 */
public class Triangle {
    //
   public double katet1;
   public double katet2;

  // public double hypotenuse = Math.sqrt(katet1 * katet1 + katet2* katet2);


   public void perimeter(){
       //double hypotenuse = Math.sqrt(katet1 * katet1 + katet2* katet2);
       System.out.println("Perimeter: " + katet1 + katet2 + hypotenuse());
   }

   public void area(){
       System.out.println("Area: " + (katet1 * katet2)/2);
   }

   public double hypotenuse(){

      return Math.sqrt(katet1 * katet1 + katet2* katet2);
   }
}
