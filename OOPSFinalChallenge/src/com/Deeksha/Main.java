package com.Deeksha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamB = new Hamburger("Wheat","Chicken");
        hamB.addOns(true,true,true,true);
        System.out.println(hamB.getBreadRollType());
        System.out.println(hamB.getBurgerName());
        System.out.println(hamB.getMeat());
        System.out.println(hamB.getPrice());
    }
}
