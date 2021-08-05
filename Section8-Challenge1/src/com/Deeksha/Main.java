package com.Deeksha;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static int[] getIntegers(int number){
        int[] myArray = new int[number];
        System.out.println("Enter the array elements : ");
        for(int i = 0;i<number;i++){
            myArray[i]=sc.nextInt();
        }
        sc.close();
        return myArray;
    }

    public static void printArray(int[] array){
        for(int i = 0; i< array.length;i++){
            System.out.println("Element "+i+" contents "+array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int [] copiedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp = 0;
        while (flag){
            flag = false;
            for(int i = 0; i<copiedArray.length - 1;i++){
                if(copiedArray[i]<copiedArray[i+1]){
                    temp = copiedArray[i];
                    copiedArray[i] = copiedArray[i+1];
                    copiedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return copiedArray;
    }


    public static void main(String[] args) {
	// write your code here
        int[] myArray = getIntegers(5);
        //printArray(myArray);
        int[] copiedArray = sortIntegers(myArray);
        //System.out.println("After sorting ");
        printArray(copiedArray);



    }
}
