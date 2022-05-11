package uz.bepro.model;

import uz.bepro.enums.Role;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {TranslateApp}
 * @Date: {2022/05/10 && 9:19 AM}
 */
public class User {
    //
    public String name;
    public Role role;
    public String password;

    public User(String name, Role role, String password) {
        this.name = name;
        this.role = role;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role=" + role +
                ", password='" + password + '\'' +
                '}';
    }
}
