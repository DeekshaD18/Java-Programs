package com.Deeksha;

public class Fish extends Animal{
    private int gills;
    private int fins;
    private int eyes;

    public Fish(String name, int size, int weight, int gills, int fins, int eyes) {
        super(name, 1, size, 1, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    public void rest(){

    }
    public void backFin(){

    }
    public void moveMuscle(){

    }

    public void swimming(int speed){
        backFin();
        moveMuscle();
        super.move(speed);
    }
}
