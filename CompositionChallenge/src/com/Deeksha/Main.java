package com.Deeksha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(55,12);

        Lamp lamp = new Lamp(10,"Modern",false);

        Bed bed = new Bed("Modern",5,2,3,6);

        Bedroom bedroom = new Bedroom(wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
