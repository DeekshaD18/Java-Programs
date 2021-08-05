package com.Deeksha;

import java.util.Locale;

public class Car {
    //state defining as fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("boxster")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }

    }

    public String getModel(){
        return this.model;
    }
}
