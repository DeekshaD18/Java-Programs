package com.Deeksha;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static int readInteger(){
        System.out.println("Enter how many Elements: ");
        int number = sc.nextInt();
        return number;
    }

    public static int[] readElements(int number){
        System.out.println("Enter the array elements : ");
        int[] myArray = new int[number];
        for(int i = 0; i < number; i++){
            myArray[i] = sc.nextInt();
        }
        return myArray;
    }

    public static int findMin(int[] array){
        int temp = 0;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i< array.length-1; i++){
                if(array[i]<array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1]= temp;
                    flag = true;
                }
            }
        }
        return array[4];
    }

    public static void main(String[] args) {
	// write your code here
        int number = readInteger();
        int[] myArray = new int[number];
        myArray = readElements(number);
        System.out.println(findMin(myArray));

    }
}
