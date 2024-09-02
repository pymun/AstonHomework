package Game;

import Game.Enemy.Zombie;
import Game.Hero.Archer;
import Game.Hero.Hero;
import Game.Hero.Mage;
import Game.Hero.Warrior;

public class TrainingGround {
    public static void main(String[] args) {

        Zombie zombie = new Zombie(100);

        Warrior mark = new Warrior("Марк", 100);
        mark.attackEnemy(zombie);

        Mage merlin = new Mage("Мерлин", 100);
        merlin.attackEnemy(zombie);

        Archer robin = new Archer("Робин", 100);
        robin.attackEnemy(zombie);
    }
}
