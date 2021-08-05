package com.Deeksha;

public class Verna extends Car{
    public Verna(int noOfCylinders, String cylinders) {
        super(noOfCylinders, cylinders);
    }

    @Override
    public String startEngine() {
        return "verna -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Verna -> startEngine";
    }

    @Override
    public String brake() {
        return "verna -> startEngine";
    }
}
