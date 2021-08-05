package com.Deeksha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i = 1;i<=5;i++){
            Car car = randomCar();
            System.out.println("Car#"+i+" : \n"+car.startEngine()+"\n"+car.accelerate()+"\n"+car.brake()+"\n");
        }
    }

    public static Car randomCar(){
        int randomNumber = (int)(Math.random()*3+1);
        System.out.println("random numer ="+randomNumber);
        switch (randomNumber){
            case 1:
                return new Verna(2,"a1");

            case 2:
                return new Porsche(3,"a2");

            case 3:
                return new Benz(4,"a4");
        }
        return null;
    }
}
