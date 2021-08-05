package com.Deeksha;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int result = divide();
        System.out.println("Result = "+result);
    }

    private static int divide(){
        int x = getInt();
        int y = getInt();
        System.out.println("X = "+x+", y = "+y);
        return x/y;
    }

    private static int getInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer value : ");
        //sc.nextLine();
        return sc.nextInt();
    }
}
