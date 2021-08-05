package com.Deeksha;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        transactions = new ArrayList<Double>();
    }

    public static Customer newCustomer(String name){
        return new Customer(name);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(ArrayList<Double> transactions){
        transactions.add(transactions);
    }
}
