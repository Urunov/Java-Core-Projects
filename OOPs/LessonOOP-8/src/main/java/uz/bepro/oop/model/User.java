package uz.bepro.oop.model;

import java.util.Scanner;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-8}
 * @Date: {2022/04/09 && 8:28 PM}
 */
public class User {
    //
    private String id;
    public String userName;
    public String email;
    public String password;

    private String  name;
    private String address;

    public void changePassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter old password:");
        String oldPassword = scanner.nextLine();

        if(oldPassword.equals(password)){
            System.out.print("Enter new password");
            String newPassord = scanner.nextLine();
            System.out.print("Confirm new password: ");
            String confirmPassword = scanner.nextLine();
            if (newPassord.equals(confirmPassword)){
                password = newPassord;
            } else{
                System.out.println("password is not match");
            }
        } else {
            System.out.println("Old password incorrect");
        }
    }

}
