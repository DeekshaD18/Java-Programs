package com.company;

public class Main {

    public static void main(String[] args) {

        int initialValue = 10000;
        int integerMinValue = Integer.MIN_VALUE;
        int integerMaxValue = Integer.MAX_VALUE;
        System.out.println(integerMinValue);
        System.out.println(integerMaxValue);
        System.out.println(integerMinValue-1);
        System.out.println(integerMaxValue+1);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);

        long myLongLiteralValue = 214748364899L;
        System.out.println(myLongLiteralValue);

        short myShortLiteralValue = 32767;
        System.out.println(myShortLiteralValue);

        int myIntegerValue = integerMinValue/2;

        byte myByteValue = (byte) (myMinByteValue/2);

        short myShortValue = (short)(myMinShortValue/2);
    }
}
