package com.Deeksha;

public class Dog extends Animal{
    private int legs;
    private int eyes;
    private int tail;
    private String skin;
    public Dog(String name,  int size, int weight,int legs, int eyes, int tail, String skin) {
        super(name, 1,size, 1, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.skin = skin;
        this.tail = tail;
    }

    public void eatDog(){
        System.out.println("Dog.eat() called");
    }

    @Override
    public void eat() {
        eatDog();
        super.eat();

    }

    public void walk(){
        System.out.println("Dog.walk() was called.");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() was called.");
        move(10);
    }

    public void moveLegs(){
        System.out.println("moveLegs() was called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() was called.");
        moveLegs();
        super.move(speed);

    }
}
