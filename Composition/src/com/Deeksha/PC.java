package com.Deeksha;

public class PC {
    private MotherBoard theMotherBoard;
    private Case theCase;
    private Monitor theMonitor;

    public PC(MotherBoard theMotherBoard, Case theCase, Monitor theMonitor) {
        this.theMotherBoard = theMotherBoard;
        this.theCase = theCase;
        this.theMonitor = theMonitor;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        theMonitor.drawPixel(1200,500,"red");
    }

    private MotherBoard getTheMotherBoard() {
        return theMotherBoard;
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getTheMonitor() {
        return theMonitor;
    }
}
