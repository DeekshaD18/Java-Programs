package com.Deeksha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player = new Player();
        player.health=10;
        player.name="Deek";
        player.weapon="gun";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("remaining health = "+player.healthRemaining());

        damage = 20;
        player.health=200;
        player.loseHealth(damage);
        System.out.println("remaining health = "+player.healthRemaining());

        UpdatedEncapsulation play = new UpdatedEncapsulation(50,"deek","gun");
        System.out.println("Initial health = "+play.getHealth());
    }
}
