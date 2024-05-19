package com;

import java.util.HashSet;
import java.util.Set;

public class Rate {
    private String name;
    private Company company;
    private Set<Subscriber> subscribers;

    public Rate(String name, Company company) {
        this.name = name;
        this.company = company;
        this.subscribers = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Set<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public int getAmountSubscribers() {
        return subscribers.size();
    }
}

