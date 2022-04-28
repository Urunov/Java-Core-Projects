package contact.service;


import contact.model.Contact;
import contact.model.Result;

import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {CollectionFramework-3}
 * @Date: {2022/04/27 && 1:44 PM}
 */
public interface ContactService {
    //
   Result createContact(Contact contact);
   Result editContact(Contact contact);
   Result deleteContact(Contact contact);
   List<Result> searchContact(String text);
}
