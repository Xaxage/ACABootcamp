package Homework.wizard_archer_warrior_game;

public class Archer extends Player {

    public Archer(String unitName) {
        health = 150;
        strength = 34;
        name = unitName;
    }

    @Override
    public void fightWith(Player player) throws InterruptedException {
        if (player instanceof Warrior) this.strength += 20;
        if (l == Location.MOUNTAINS) this.strength += 30;

        if (player instanceof Wizard) {
            player.fightWith(this);
            return;
        }
        super.fightWith(player);
    }


}
