package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(myMinFloatValue);
        System.out.println(myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(myMinDoubleValue);
        System.out.println(myMaxDoubleValue);

        int value = 5/3;
        float valueFloat = 5f/3;
        double valueDouble = 5d/3;
        System.out.println(value);
        System.out.println(valueFloat);
        System.out.println(valueDouble);

        double poundValue = 200.0;
        double poundToKiloGram = 0.45359237;
        double kiloGramValue = poundValue * poundToKiloGram;
        System.out.println(kiloGramValue);

    }
}
