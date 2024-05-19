package com;

import java.util.HashSet;
import java.util.Set;

public class Company {
    private Long id;
    private String name;
    private Set<Rate> rates;

    public Company(String name) {
        this.name = name;
        this.rates = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Rate> getRates() {
        return rates;
    }

    public void addRate(Rate rate) {
        rates.add(rate);
    }

    public Subscriber searchSubscriber(String number) {
        for (Rate rate : rates) {
            for (Subscriber subscriber : rate.getSubscribers()) {
                if (subscriber.getNumber().equals(number)) {
                    return subscriber;
                }
            }
        }
        return null;
    }
}


