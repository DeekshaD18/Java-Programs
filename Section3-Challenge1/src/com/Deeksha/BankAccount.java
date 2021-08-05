package com.Deeksha;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public long getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String deposit(double amount){
        this.balance += amount;
        return "Your current balance is "+this.balance;
    }
    public String  withDraw(double amount){
        if(balance < amount){
            return "Insufficient Funds";
        }else{
            this.balance -= amount;
            return "Withdrew "+amount+" Your current balance is "+this.balance;
        }
    }
}
