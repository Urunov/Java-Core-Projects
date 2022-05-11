package contact.service;

import contact.model.Contact;
import contact.model.Result;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {CollectionFramework-3}
 * @Date: {2022/04/27 && 1:54 PM}
 */
public class ContactServiceImplement implements ContactService {

    public ArrayList<Contact> contacts = new ArrayList<>();

    public ContactServiceImplement() {
        this.contacts = contacts;
    }

    @Override
    public Result createContact(Contact contact) {
        Result result = new Result();
        if (!checkPhone(contact)) {
            contacts.add(contact);
            result.setMessage("Successfully created. ");
            result.setSuccess(true);
        } else {
            result.setMessage("Do not created. ");
            result.setSuccess(false);
        }
        return result;
    }

    @Override
    public Result editContact(Contact contact) {
        //
        Contact updateContact = new Contact();

        if (contact.getPhone()==null){
            System.out.println("NO such person here.");
        }
        return null;
    }

    @Override
    public Result deleteContact(Contact contact) {
        Result result = new Result();
        if(contacts.remove(contact)){
            result.setSuccess(true);
            result.setMessage("Successfully created.");
        } else {
            result.setMessage("Do not deleted.");
            result.setSuccess(false);
        }
        return result;
    }

    @Override
    public List<Contact> searchContact(String text) {
         List<Contact> contactList = new ArrayList<>();
        contacts.forEach(contact -> {
               if( contact.getPhone().toLowerCase().contains(text.toLowerCase())
                || contact.getEmail().toLowerCase().contains(text.toLowerCase())
                || contact.getCompany().toLowerCase().contains(text.toLowerCase())
                || contact.getFullName().toLowerCase().contains(text.toLowerCase())){
             contactList.add(contact);
           }
        });
        contactList.sort(Comparator.comparing(Contact::getFullName));
        return contactList;
    }

    private boolean checkPhone(Contact contact) {
        for (Contact contact1 : contacts) {
            if (contact1.getPhone().equals(contact.getPhone())) {
                return true;
            }
        }
        return false;
    }


    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}

