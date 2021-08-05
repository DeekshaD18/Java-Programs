package com.company;

public class Main {

    public static void main(String[] args) {

        String myStringValue = "This is a string";
        System.out.println("This string is equal to "+ myStringValue);
        myStringValue = myStringValue + " this is more.";
        System.out.println("This string is equal to "+ myStringValue);
        System.out.println("this string is equal to "+ myStringValue + "\u00A9");
        myStringValue = "29.55" + "35.99";
        System.out.println(myStringValue);
        int myIntValue = 50;
        double myDoubleValue = 290.55;
        myStringValue = "10"+myIntValue;
        System.out.println(myStringValue);
        myStringValue="100"+myDoubleValue;
        System.out.println(myStringValue);
        myStringValue = "10";
        System.out.println(myStringValue);
    }
}
