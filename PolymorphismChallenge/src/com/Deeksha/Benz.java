package com.Deeksha;

public class Benz extends Car{
    public Benz(int noOfCylinders, String cylinders) {
        super(noOfCylinders, cylinders);
    }

    @Override
    public String startEngine() {
        return "Benz -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Benz -> startEngine";
    }

    @Override
    public String brake() {
        return "Benz -> startEngine";
    }
}
