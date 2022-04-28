package contact.service;

import contact.model.Contact;
import contact.model.Result;


import java.util.ArrayList;
import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {CollectionFramework-3}
 * @Date: {2022/04/27 && 1:54 PM}
 */
public class ContactServiceImplement implements ContactService {

    public ArrayList<Contact> contactList = new ArrayList<>();

    @Override
    public Result createContact(Contact contact) {
        Result result = new Result();
        if (!checkPhone(contact)) {
            contactList.add(contact);
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
        if(contactList.remove(contact)){
            result.setSuccess(true);
            result.setMessage("Successfully created.");
        } else {
            result.setMessage("Do not deleted.");
            result.setSuccess(false);
        }
        return result;
    }

    @Override
    public List<Result> searchContact(String text) {
        return null;
    }

    private boolean checkPhone(Contact contact) {
        for (Contact contact1 : contactList) {
            if (contact1.getPhone().equals(contact.getPhone())) {
                return true;
            }
        }
        return false;
    }


    public ArrayList<Contact> getContacts() {
        return contactList;
    }
}
