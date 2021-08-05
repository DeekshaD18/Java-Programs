package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; //1 + 2 = 3
        System.out.println("1 + 2 = "+result);
        int previousResult = result;
        System.out.println("new result = "+ previousResult);
        result = result - 1;
        System.out.println("new result = "+ previousResult);
        System.out.println("new result = "+ result);

        result = result * 10; //2 * 10 = 20;
        System.out.println("2 * 10 = "+ result);

        result = result / 5; //20/5 = 4.0
        System.out.println("20 / 5 = "+result);

        result = result % 3; // 4 % 3 = 1
        System.out.println("4 % 3 = "+ result);

        result++; //result = result + 1
        System.out.println(result);

        result+=2;
        System.out.println(result);

        result*= 10;
        System.out.println(result);

        result/=4;
        System.out.println(result);

        result--;
        System.out.println(result);

        result-=2;
        System.out.println(result);

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not an alien");
            System.out.println("I am scared of aliens");
        }

        int score = 60;
        if(score == 100){
            System.out.println("Score is 100");
        }
        int topScore = 80;
        if(topScore > score && topScore < 100){
            System.out.println("Top score greater than score and less than 100");
        }

        if((score > 80) || (topScore < 90)){
            System.out.println("Either or both are true");
        }

        int value = 10;
        if( value == 10){
            System.out.println("Its 10");
        }

        boolean isCar = true;
        if(isCar){
            System.out.println("This is not good!");
        }
        boolean wascar = isCar? true: false;
        if(wascar){
            System.out.println("Was car is true");
        }
    }
}
