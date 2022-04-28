package contact;

import contact.model.Contact;
import contact.model.subClasses.MenuContact;
import contact.service.ContactService;
import contact.service.ContactServiceImplement;

import java.util.ArrayList;
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

            switch (scanner.nextInt()){
                case 0:
                    return;
                case 1:
                    selectedContact = createNewContact();
                    contactService.createContact(selectedContact);
                    break;
                case 2:
                    System.out.println("Selected Contact: ");
                    ArrayList<Contact> contacts = contactService.getContacts();
                    for (int i=0; i < contacts.size(); i++) {
                        System.out.println(i+  " -- " + contacts.get(i));
                    }
                    int indexValue = scanner.nextInt();
                    if (indexValue>=0 && indexValue<= contacts.size()){
                        selectedContact = contacts.get(indexValue);
                        contactService.editContact(selectedContact);
                    } else{
                        System.out.println("contact number not found. ");
                    }
                    break;

                case 3:
                    contactService.searchContact("Hey bola");
                case 4:
                    contactService.deleteContact(null);

                default:
                    System.out.println("Error number: ");
            }
        }

    }


}
