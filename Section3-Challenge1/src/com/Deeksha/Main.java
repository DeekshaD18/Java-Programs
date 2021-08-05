package com.Deeksha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount account = new BankAccount();
        account.setAccountNumber(1223344556);
        account.setBalance(1000);
        account.setCustomerName("Deeksha Dev");
        account.setEmail("ddeeksha018@gmail.com");
        account.setPhoneNumber("9591969380");
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        System.out.println(account.getCustomerName());
        System.out.println(account.getEmail());
        System.out.println(account.getPhoneNumber());
        System.out.println(account.deposit(12000));
        System.out.println(account.withDraw(14000));
        System.out.println(account.withDraw(12000));
        System.out.println(account.withDraw(2000));

    }
}
