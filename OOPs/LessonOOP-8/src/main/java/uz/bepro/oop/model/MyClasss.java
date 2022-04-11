package uz.bepro.oop.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-8}
 * @Date: {2022/04/09 && 7:37 PM}
 */
public class MyClasss {
    //
    public int firstAttribute;
    public int secondAttribute;

    public void aboutAttribute(){
        System.out.println("First Attribute: " + firstAttribute);
        System.out.println("Second Attribute: " + secondAttribute);
    }

    public void sumAttribute(){
        System.out.println("Sum attributes: " + (firstAttribute + secondAttribute));
    }

    public void maxAttribute(){
       // step-1: way
//        if (firstAttribute>=secondAttribute){
//            System.out.println("Max: " + firstAttribute);
//        } else{
//            System.out.println("Max: " + secondAttribute);
//        }

        //step-2: ternary java
        System.out.println("Max:" + (firstAttribute>=secondAttribute ? firstAttribute : secondAttribute));

        // step-3: Math library
      //  System.out.println(Math.max(firstAttribute, secondAttribute));

        // step-4:
      //  System.out.println(Integer.max(firstAttribute, secondAttribute));
    }


}
