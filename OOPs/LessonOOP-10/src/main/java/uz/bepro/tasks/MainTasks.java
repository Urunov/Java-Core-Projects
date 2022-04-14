package uz.bepro.tasks;

import uz.bepro.tasks.account.Account;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/12 && 7:27 PM}
 */
public class MainTasks {
    public static void main(String[] args) {

        Account account = new Account();
        account.setName("Ali");
        account.setLastName("Borisov");
        account.setAccountNumber("860012341234432112334");
        account.setBalance(2112.2);

        System.out.println(account.getName() + "  " + account.getLastName());
    }
}
