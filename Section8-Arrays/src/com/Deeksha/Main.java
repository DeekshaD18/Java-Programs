package com.Deeksha;

import java.util.Scanner;


public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static int[] getArray(int number){
        System.out.println("Enter the integers\r");
        int[] myNewArray = new int[number];
        for(int i = 0; i<number; i++){
            myNewArray[i] = sc.nextInt();
        }
        return myNewArray;
    }

    public static double getAverage(int[] myArray){
        int sum = 0;
        double average = 0;
        for(int j = 0;j<myArray.length;j++){
            sum += myArray[j];
        }
        return sum/myArray.length;
    }


    public static void main(String[] args) {
	// write your code here

        int[] myArray = getArray(5);


        System.out.println("Average = "+getAverage(myArray));

}
}
