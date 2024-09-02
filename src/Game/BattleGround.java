package Game;

import Game.Enemy.Zombie;
import Game.Hero.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Warrior mark = new Warrior("Марк", 100);
        Zombie zombie = new Zombie(100);

        while (zombie.isAlive() && mark.isAlive()) {
            mark.attackEnemy(zombie);
            System.out.println("Здоровье у Марка " + mark.getHealth());
            zombie.attackHero(mark);
            System.out.println("Здоровье у зомби " + zombie.getHealth());
            if (!zombie.isAlive()) {
                System.out.println("Зомби сдох");
            } else if (!mark.isAlive()) {
                System.out.println("Марк погибает в неравной битве");
            }

        }
    }
}
