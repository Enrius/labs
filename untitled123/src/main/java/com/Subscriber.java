package com;

public class Subscriber {
    private String data;
    private String number;
    private Rate rate;

    private int balance;

    public Subscriber(String data, String number, Rate rate) {
        this.data = data;
        this.number = number;
        this.rate = rate;
        this.balance = 0;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Rate getRate() {
        return rate;
    }

    public int getBalance() {
        return balance;
    }

    public int TopUp(int summ) {
        balance += summ;
        return balance;
    }
}

