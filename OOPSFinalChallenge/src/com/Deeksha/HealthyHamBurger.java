package com.Deeksha;

public class HealthyHamBurger extends Hamburger{
    private String burgerName;
    private boolean carrot;
    private boolean mintSauce;
    private int price;

    public HealthyHamBurger(String meat, boolean carrot, boolean mintSauce) {
        super("Brown rye",meat);
        this.burgerName="Healthy burger";
        this.price = 40;
        this.carrot = carrot;
        this.mintSauce = mintSauce;
    }

    public void addOns(boolean carrot,boolean mintSauce){
        if(carrot){
            this.price+=5;
        }
        if(mintSauce){
            this.price+=2;
        }

    }

    @Override
    public void addOns(boolean lettuce, boolean onion, boolean Mayyonise, boolean cheese) {

        super.addOns(lettuce, onion, Mayyonise, cheese);

    }
}
