package com.Deeksha;

public class UpdatedEncapsulation {
    private int health=100;
    private String name;
    private String weapon;

    public UpdatedEncapsulation(int health, String name, String weapon) {
        if(health > 0 && health <=100){
            this.health = health;
        }
        this.name = name;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out!");
        }
    }

    public int getHealth(){
        return this.health;
    }
}
