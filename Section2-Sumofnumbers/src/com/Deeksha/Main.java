package com.Deeksha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        int number = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while(count<10){
            number=count+1;
            System.out.println("Enter number #"+number);
            boolean hasInt = sc.hasNextInt();
            if(hasInt){
                sum += sc.nextInt();
                count++;
            }else{
                System.out.println("Wrong input");
                sc.next();
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
