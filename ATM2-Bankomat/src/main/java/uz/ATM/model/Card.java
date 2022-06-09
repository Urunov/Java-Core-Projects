package uz.ATM.model;

public class Card {
    private int id;
    private String accountNum;
    private String pin;
    private String owner;
    private String balance;
    private boolean state;
    private String cardType;



    public Card(int id, String accountNum, String pin, String owner, String balance, boolean state, String cardType) {
        this.id = id;
        this.accountNum = accountNum;
        this.pin = String.valueOf(pin);
        this.owner = owner;
        this.balance = balance;
        this.state = state;
        this.cardType = cardType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = String.valueOf(pin);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }



    @Override
    public String toString() {
        return  "CardData" + ":{" +
                "id=" + id +
                ", accountNum='" + accountNum + '\'' +
                ", pin=" + pin +
                ", owner='" + owner + '\'' +
                ", balance='" + balance + '\'' +
                ", state=" + state +
                ", cardType=" + cardType +
                '}';
    }
}
