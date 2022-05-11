package uz.bepro.service;

import uz.bepro.enums.Role;
import uz.bepro.model.User;

import java.util.ArrayList;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {TranslateApp}
 * @Date: {2022/05/10 && 9:22 AM}
 */
public class UserImplement implements UserService{

    ArrayList<User> users = new ArrayList<User>();


    @Override
    public void create() {
        users.add(new User("Reception", Role.ADMINISTRATOR, "321"));
        users.add(new User("Student", Role.GUEST, "3214"));
        users.add(new User("User", Role.USER, "3213"));
    }

    @Override
    public void get() {

    }

    @Override
    public void update() {

    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
