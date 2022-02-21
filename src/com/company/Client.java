package com.company;

public class Client extends User {

    private String cardNumber;
    private Double balance;


    public Client() {
    }

    public Client(Integer id, String name, String surname, String cardNumber, Double balance) {
        super(id, name, surname);
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return super.toString()  +  " " + this.cardNumber + " " + this.balance + "\n";


    }
}
