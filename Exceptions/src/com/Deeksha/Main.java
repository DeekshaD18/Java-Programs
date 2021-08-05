package com.Deeksha;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int x=10;
//        int y=0;
//        System.out.println(divideLBYL(x,y));
//        System.out.println(divideEAFP(x,y));
//        System.out.println(divide(x,y));

//        int x = getIntLBYL();
//        System.out.println(x);

        int x = getIntEAFP();
        System.out.println(x);
    }

    private static int getIntLBYL(){
        Scanner sc = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Enter an integer Value");
        String number = sc.next();
        for(int i = 0; i<number.length(); i++){
            if(!Character.isDigit(number.charAt(i))){
                isValid=false;
                break;
            }
        }
        if(isValid){
            return Integer.parseInt(number);
        }else{
            return 0;
        }
    }

    private static int getIntEAFP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer value:");
        try{
            return sc.nextInt();
        }catch (InputMismatchException e){
            return 0;
        }
    }
    private static int divideLBYL(int x, int y){
        if(y!=0){
            return x/y;
        }else{
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try{
            return x/y;
        }catch (ArithmeticException e){
            return 0;
        }
    }

    private static int divide(int x, int y){
        return x/y;
    }
}
