package Homework.wizard_archer_warrior_game;

import java.util.Random;
import java.util.Scanner;

public abstract class Player {
    protected String name;
    protected double health;
    protected double strength;
    protected Location l;
    private Scanner sc = new Scanner(System.in);

    public Player() {
        Random r = new Random();
        int checkLocation = r.nextInt(3);

        switch (checkLocation) {
            case 0 -> l = Location.MOUNTAINS; // Bonus for archers
            case 1 -> l = Location.ARENA; // Bonus for warriors
            case 2 -> l = Location.WOODS; // bonus for wizards
        }
    }

    public void fightWith(Player player) throws InterruptedException {
        if (this == player) {
            System.out.println("The same person cant fight himself");
            return;
        }


        System.out.println("If you wanna start enter something");
        sc.nextLine();
        sc.close();

        System.out.println("Fight in the " + l.name() + " starts in");
        System.out.println(3);
        Thread.sleep(1000);
        System.out.println(2);
        Thread.sleep(1000);
        System.out.println(1);
        Thread.sleep(1000);

        statusBar(player);
    }

    private void statusBar(Player player) {
        while (true) {

            System.out.println(name + "'s health " + this.health + "\n" + player.name + "'s health " + player.health);
            player.health -= this.strength;
            if (player.health <= 0) {
                System.out.println(name + " won");
                break;
            }

            this.health -= player.strength;
            if (this.health <= 0) {
                System.out.println("\n" + player.name + " won");
                break;
            }
        }
    }

}
