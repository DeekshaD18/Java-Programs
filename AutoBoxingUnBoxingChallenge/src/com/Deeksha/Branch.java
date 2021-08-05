package com.Deeksha;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public static Branch addBranch(String name){
        return new Branch(name);

    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, ArrayList<Customer> customer){

    }

    public boolean addCustomerTransaction(String name, ArrayList<Customer> customer){

    }

    public Customer findCustomer(String name){

    }


}
