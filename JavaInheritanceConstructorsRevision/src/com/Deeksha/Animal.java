package com.Deeksha;

public class Animal {
    private int body;
    private int size;
    private int weight;
    private int head;
    private String name;

    public Animal(int body, int size, int weight, int head, String name) {
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.head = head;
        this.name = name;
    }

    public void move(int speed){
        System.out.println("animal.move() was called");
        System.out.println("moving at "+speed);
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public int getHead() {
        return head;
    }

    public String getName() {
        return name;
    }
}
