package com.company;

public class Main {

    public static void main(String[] args) {

        double valueOne = 20;
        double valueTwo = 80;
        double addBoth = valueOne + valueTwo;
        System.out.println("Sum = "+ addBoth);
        double mult = addBoth * 100;
        System.out.println("Multiplication = "+ mult);
        int remainderValue = (int)(mult % 40.0);
        System.out.println("Remainder = "+ remainderValue);
        boolean boolValue = false;
        if (remainderValue == 0){
            boolValue = true;
        }
        System.out.println("True or False = "+boolValue);
        if(!boolValue){
            System.out.println("Got some remainder");
        }

        double doubleValue = 20;
        double doubleSecondValue = 80;
        double doubleAddition= (doubleValue + doubleSecondValue) * 100.0d;
        System.out.println(doubleAddition);
        double doubleRemainder = doubleAddition % 40.0d;
        System.out.println(doubleRemainder);
        boolean values = (doubleRemainder == 0)? true : false;
        System.out.println(values);
        if(!values){
            System.out.println("It is not true");
        }
    }
}
