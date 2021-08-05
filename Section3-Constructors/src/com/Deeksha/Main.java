package com.Deeksha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount Cat = new BankAccount();
        System.out.println(Cat.getCustomerName());
        BankAccount Bob = new BankAccount("12345",1000.0,"Deek","Deek@gmail.com","9591969380");

        Bob.getBalance();

        System.out.println(Bob.deposit(50));
        System.out.println(Bob.withDraw(100));
        System.out.println(Bob.deposit(50));
        System.out.println(Bob.withDraw(100));

    }
}
