package com.Deeksha;

public class Car {
    private int wheels;
    private boolean engine;
    private int noOfCylinders;
    private String cylinders;

    public Car(int noOfCylinders, String cylinders) {
        this.wheels = 4;
        this.engine = true;
        this.noOfCylinders = noOfCylinders;
        this.cylinders = cylinders;
    }

    public String  startEngine(){
        return "car -> startEngine";
    }

    public String accelerate(){
        return "car -> accelerate";
    }

    public String brake(){
        return "car -> brake";
    }

    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public String getCylinders() {
        return cylinders;
    }
}
