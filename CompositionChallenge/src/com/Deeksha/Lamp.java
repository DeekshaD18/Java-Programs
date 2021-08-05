package com.Deeksha;

public class Lamp {
    private int globeRating;
    private String style;
    private boolean battery;

    public Lamp(int globeRating, String style, boolean battery) {
        this.globeRating = globeRating;
        this.style = style;
        this.battery = battery;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on");
    }

    public String getStyle(){
        return this.style;
    }

    public int getGlobeRating() {
        return globeRating;
    }

    public boolean isBattery() {
        return battery;
    }
}
