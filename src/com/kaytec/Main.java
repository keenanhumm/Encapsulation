package com.kaytec;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
//        player.health = 390423483;
        player.weapon = "Sword";

        player.loseHealth(10);
        player.loseHealth(10);

    }
}
