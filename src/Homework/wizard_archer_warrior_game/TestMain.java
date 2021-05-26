package Homework.wizard_archer_warrior_game;


public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        Player archer1 = new Archer("First Archer");
        Archer archer2 = new Archer("Second Archer");

        Player warrior1 = new Warrior("First warrior");
        Player warrior2 = new Warrior("Second warrior");

        Player wizard1 = new Wizard("First wizard");
        Wizard wizard2 = new Wizard("Second wizard");


//        warrior1.fightWith(wizard1);
//        wizard1.fightWith(archer1);
        wizard1.fightWith(warrior1);
    }
}
