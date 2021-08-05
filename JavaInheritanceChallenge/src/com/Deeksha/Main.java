package com.Deeksha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle cirle = new Circle(3.75);
        System.out.println("radius = "+cirle.getRadius());
        System.out.println("area = "+cirle.getArea());

        Cylinder cyl = new Cylinder(5.55,7.25);
        System.out.println("radius = "+cyl.getRadius());
        System.out.println("height = "+cyl.getHeight());
        System.out.println("volume = "+cyl.getVolume());
        System.out.println("area = "+cyl.getArea());
    }
}
