package com.Deeksha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int currentYear = 2021;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth Year?");
        boolean hasInt = sc.hasNextInt();
        if(hasInt){

            int birthYear = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter your name? ");
            String name = sc.nextLine();

            int age = currentYear - birthYear;
            if(age>=0 && age<100){
                System.out.println("Your name is "+name+", You are "+age+" years old.");
            }else{
                System.out.println("Invalid age!");
            }

        }else{
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
