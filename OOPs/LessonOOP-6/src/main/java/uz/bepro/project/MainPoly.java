package uz.bepro.project;

import uz.bepro.project.model.Electronics;
import uz.bepro.project.model.Phone;
import uz.bepro.project.model.Product;
import uz.bepro.project.model.TVs;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaInhertance}
 * @Date: {2022/04/05 && 9:55 PM}
 */
public class MainPoly {
    public static void main(String[] args) {


        Electronics electronics = new Electronics("LG", 122.2, 2.2, true);
        electronics.name = "REAL";
        electronics.price = 221.2;
        electronics.setUtil("3");
        electronics.setMaker("in Uzbekistan");

        System.out.println(electronics);

        System.out.println("------------");
        Phone phone = new Phone("matrolla", 33.3, 2.3, true);
        phone.name = "iPhone13 Pro Max";
        phone.phoneCall = "possible";
        phone.setCamera(12.2);
        phone.setPhoneNumber("9989012324444");

        System.out.println(phone);

         if (phone instanceof Product){ // true / false

             System.out.println("Yes it is...");
         } else{
             System.out.println("No it is not");
         }

        TVs tVs = new TVs("LG", 3.3, 2.2, true);
         tVs.name = "Samsung";
         tVs.price = 2323.3;
         tVs.diagonal = 19;

        System.out.println(tVs);


        Phone phone2 = new Phone("Nokia", 33.2, 22, true);
        phone2.name  = "Nokia6003";
        phone2.price = 333.33;
        phone2.setMaker("Finlandia");
        phone2.setPhoneNumber("33232323");
        System.out.println(phone2);



    }
}
