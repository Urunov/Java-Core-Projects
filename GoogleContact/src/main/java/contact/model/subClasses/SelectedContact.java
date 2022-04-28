package contact.model.subClasses;

import contact.model.Contact;

import java.util.Scanner;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {GoogleContact}
 * @Date: {2022/04/27 && 6:46 PM}
 */
public class SelectedContact {
    //
    public static Contact createNewContact() {

        Scanner scanner = new Scanner(System.in);
        Contact newContact = new Contact();

        System.out.println("FullName: ");
        newContact.setFullName(scanner.nextLine());

        System.out.println("Company: ");
        newContact.setCompany(scanner.nextLine());

        System.out.println("Email: ");
        newContact.setEmail(scanner.nextLine());

        System.out.println("Phone: ");
        newContact.setPhone(scanner.nextLine());

        return newContact;
    }
}
