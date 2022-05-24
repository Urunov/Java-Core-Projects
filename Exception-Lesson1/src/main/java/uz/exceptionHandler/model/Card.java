package uz.exceptionHandler.model;

import uz.exceptionHandler.enums.CardType;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Exception-Lesson1}
 * @Date: {2022/05/14 && 9:56 AM}
 */

public class Card {

    private String id;
    private String owner;
    private double balance;
    private CardType cardType;
    private boolean state;
    private String password;

    public Card() {
    }

    public Card(String id, String owner, double balance, CardType cardType, boolean state, String password) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
        this.cardType = cardType;
        this.state = state;
        this.password = password;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                ", cardType=" + cardType +
                ", state=" + state +
                ", password='" + password + '\'' +
                '}';
    }
}
