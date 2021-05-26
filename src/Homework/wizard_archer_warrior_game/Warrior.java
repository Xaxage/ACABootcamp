package Homework.wizard_archer_warrior_game;

public class Warrior extends Player {

    public Warrior(String unitName) {
        health = 250;
        strength = 42;
        name = unitName;
    }

    @Override
    public void fightWith(Player player) throws InterruptedException {
        if (player instanceof Wizard) this.strength += 20;
        if (l == Location.ARENA) this.strength += 30;
        
        if (player instanceof Archer) {
            player.fightWith(this);
            return;
        }
        super.fightWith(player);
    }


}
