package com.Deeksha;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount(){

        this("55555",0.0,"Default Name","Default Email","Default Phone");
        System.out.println("Empty constructor called!");
    }
    public BankAccount(String number, double balance, String customerName, String customerEmail, String customerPhone){
        System.out.println("Constructor called");
        this.number=number;
        this.balance=balance;
        this.customerName=customerName;
        this.customerEmail=customerEmail;
        this.customerPhone=customerPhone;
    }

    public String deposit(double amount){
        this.balance += amount;
        return "Balance = "+this.balance;
    }

    public String withDraw(double amount){
        if(balance < amount){
            return "Cant process withdrawal of "+amount+" as balance = "+this.balance;
        }else
        {
            this.balance -= amount;
            return "Withdraw of "+amount+" Successful. Your current balance = "+this.balance;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
