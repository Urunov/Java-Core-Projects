package contact;

import contact.model.Contact;
import contact.model.Result;
import contact.model.subClasses.MenuContact;
import contact.service.ContactService;
import contact.service.ContactServiceImplement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static contact.model.subClasses.SelectedContact.createNewContact;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {CollectionFramework-3}
 * @Date: {2022/04/27 && 1:44 PM}
 */
public class ContactMain {
    public static void main(String[] args) {

        ContactServiceImplement contactService = new ContactServiceImplement();

        Scanner scanner = new Scanner(System.in);
        while (true){
            MenuContact.showMenu();
            Contact selectedContact;
            Result result;
            switch (scanner.nextInt()){
                case 0:
                    return;

                case 1:
                    selectedContact = createNewContact();
                    result = contactService.createContact(selectedContact);
                    System.out.println(result);
                    break;
                case 2:
                    selectedContact = selectContact(contactService.getContacts());
                    if (selectedContact !=null){
                       result = contactService.editContact(selectedContact);
                       System.out.println(result);
                    }
                    break;

                case 3:
                    scanner = new Scanner(System.in);
                    System.out.println("Enter ");
                    List<Contact> searchedContacts = contactService.searchContact(scanner.nextLine());
                    searchedContacts.forEach(System.out::println);
                    break;
                case 4:
                    selectedContact = selectContact(contactService.getContacts());
                    if (selectedContact !=null){
                        result = contactService.editContact(selectedContact);
                        System.out.println(result);
                    }
                    contactService.deleteContact(null);
                    break;

                default:
                    System.out.println("Error number: ");
            }
        }
    }

    public static Contact selectContact(ArrayList<Contact> contacts){
        Scanner scanner = new Scanner(System.in);
        Contact newContact = new Contact();
        System.out.println("Choose contact: ");
        for (int i=0; i < contacts.size(); i++) {
            System.out.println(i+  " -- " + contacts.get(i));
        }
        int indexValue = scanner.nextInt();
        if (indexValue>=0 && indexValue<= contacts.size()){
            return contacts.get(indexValue);
        } else{
            System.out.println("contact not found. ");
            return null;
        }
    }
}
