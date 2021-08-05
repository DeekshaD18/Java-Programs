package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByteValue = 100;
        short myShortValue = 32766;
        int myIntValue = 1_234_567;
        long myLongValue = 50_000L + 10L * (myByteValue+myIntValue+myShortValue);
        System.out.println(myLongValue);
    }
}
