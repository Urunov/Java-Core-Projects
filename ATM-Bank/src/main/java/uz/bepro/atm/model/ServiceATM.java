package uz.bepro.atm.model;

public interface ServiceATM {
    void changePin(Card card);
    void balance(Card card);
    void withdraw(Card card);
    void tocount(Card card);
    boolean checkPin(Card card);
    boolean replenishaccount(Card card);
    void currencyexchange(Card card);
    void message(Card card);
}
