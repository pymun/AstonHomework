package Game.Hero;

import Game.Enemy.Enemy;

public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(13);
        System.out.println(getName() + " атакует врага мечом");
    }
}
