package com.kaytec;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println(this.name + " was killed.");
        } else {
            printHealthRemaining();
        }
    }
    public void printHealthRemaining() {
        System.out.println(this.name + " has a remaining health of " + this.health);
    }
}
