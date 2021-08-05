package com.Deeksha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Case theCase = new Case("220B","Dell","240",new Dimensions(20,20,5));
        Monitor theMonitor = new Monitor("27Inch Beast","acer",27,new Resolution(2540,1440));
        MotherBoard theMotherBoard = new MotherBoard("Bj-200","Asus",4,6,"V2.44");

        PC thePc = new PC(theMotherBoard,theCase,theMonitor);
//        thePc.getTheMonitor().drawPixel(1500,1200,"red");
//        thePc.getTheCase().pressPowerButton();
//        thePc.getTheMotherBoard().loadProgram("JavaProgram");

        thePc.powerUp();
    }
}
