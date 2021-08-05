package com.Deeksha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(50,true);
        System.out.println("Toner level = "+printer.addToner(12));
        System.out.println("initial page count = "+printer.getPagesPrinted());
        System.out.println("total pages printed : "+printer.pagesPrinted(500));
        System.out.println("total pages printed : "+printer.pagesPrinted(500));


    }
}
