package uz.bepro;

import uz.bepro.model.User;
import uz.bepro.service.UserImplement;

import java.util.Scanner;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {TranslateApp}
 * @Date: {2022/05/10 && 9:18 AM}
 */
public class MainUserApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserImplement userImplement = new UserImplement();

      //  while (true){
            System.out.println("Please, select user: ");
            for (int i = 0; i < userImplement.getUsers().size(); i++) {
                System.out.println(i+1 + "--> " + userImplement.getUsers().get(i).getName());
            }

            User currentUser = userImplement.getUsers().get(scanner.nextInt()-1);
            System.out.println(currentUser);
       // }

    }
}
