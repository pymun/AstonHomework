package Game.Hero;

import Game.Enemy.Enemy;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(5);
        System.out.println(getName() + " атакует врага из лука");
    }
}
