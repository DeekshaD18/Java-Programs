package com.Deeksha;

public class Dog extends Animal{
    private int legs;
    private int eyes;
    private String skin;

    public Dog(int size, int weight, String name, int legs, int eyes, String skin) {
        super(1, size, weight, 1, name);
        this.legs = legs;
        this.eyes = eyes;
        this.skin = skin;
    }

    private void walk(){
        System.out.println("dog.walk() was called");
        move(5);
    }

    private void run(){
        System.out.println("dog.run() was called");
        move(10);
    }

    @Override
    public void move() {
        run();
        walk();

    }
}
