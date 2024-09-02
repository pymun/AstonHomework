package Game.Hero;

import Game.Enemy.Enemy;

public class Mage extends Hero {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(15);
        System.out.println(getName() + " атакует врага шаровой молнией");
    }
}
