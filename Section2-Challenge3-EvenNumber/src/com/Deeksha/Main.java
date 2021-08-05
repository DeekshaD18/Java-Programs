package com.Deeksha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int start = 4;
        int stop = 20;
        int count = 0;
        do{
            start++;
            if(!isEvenNumber(start)){
                continue;
            }
            System.out.println(start+" "+isEvenNumber(start));
            count++;
            if(count==5){
                break;
            }

        }while(start <= stop);
    }
    public static boolean isEvenNumber(int n){
        if(n <= 0){
            return false;
        }
        if(n%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}
