package Homework.wizard_archer_warrior_game;

public class Wizard extends Player {

    public Wizard(String unitName) {
        health = 125;
        strength = 58;
        name = unitName;
    }

    @Override
    public void fightWith(Player player) throws InterruptedException {
        if (player instanceof Archer) this.strength += 20;
        if (l == Location.WOODS) this.strength += 30;
        
        if (player instanceof Warrior) {
            player.fightWith(this);
            return;
        }
        super.fightWith(player);
    }


}
