package com.Deeksha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int min = 0;
        int max = 0;
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter number : ");
            boolean hasInt = sc.hasNextInt();
            if(hasInt){
                int number = sc.nextInt();
                if(cont){
                    cont = false;
                    min = number;
                    max = number;
                }
                if(number > max){
                    //System.out.println(max);
                    max = number;
                }
                if(number < min ){
                    //System.out.println(min);
                    min = number;
                }
                sc.nextLine();
            }else{
                break;
            }
        }
        System.out.println("Min = " +min);
        System.out.printf("Max = "+max);
    }
}
