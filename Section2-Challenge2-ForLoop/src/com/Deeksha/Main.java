package com.Deeksha;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        for(int j = 1;j < 11; j++){
            System.out.println(j+" "+isPrime(j));
            if(isPrime(j)){
                count++;
            }
            if(count == 3){
                break;
            }
        }

    }
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
