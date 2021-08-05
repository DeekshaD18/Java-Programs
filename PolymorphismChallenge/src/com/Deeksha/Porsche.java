package com.Deeksha;

public class Porsche extends Car {
    public Porsche(int noOfCylinders, String cylinders) {
        super(noOfCylinders, cylinders);
    }

    @Override
    public String  startEngine() {
        return "porsche -> startEngine";
    }

    @Override
    public String accelerate() {
        return "porsche -> startEngine";
    }

    @Override
    public String brake() {
        return "porsche -> startEngine";
    }
}
