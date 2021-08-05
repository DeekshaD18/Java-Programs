package com.Deeksha;

public class Hamburger {
    private String burgerName;
    private String breadRollType;
    private String meat;
    private double price;

    private String addition1name;
    private double addition1price;

    private String addition2name;
    private double addition2price;

    private String addition3name;
    private double addition3price;

    private String addition4name;
    private double addition4price;

    public void addHamburgerAddition1(String addition1name, double addition1price){
        this.addition1name = addition1name;
        this.addition1price = addition1price;
    }

    public void addHamburgerAddition2(String addition2name, double addition2price){
        this.addition2name = addition2name;
        this.addition2price = addition2price;
    }

    public void addHamburgerAddition3(String addition3name, double addition3price){
        this.addition3name = addition3name;
        this.addition3price = addition3price;
    }

    public void addHamburgerAddition4(String addition4name, double addition4price){
        this.addition4name = addition4name;
        this.addition4price = addition4price;
    }

    public Hamburger(String burgerName, String breadRollType, String meat,double price ) {
        this.burgerName = burgerName;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public double itemizePrice(){
        double hamBurgerPrice = this.price;


    }

    public String getBurgerName() {
        return burgerName;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }
}
