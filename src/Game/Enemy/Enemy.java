package Game.Enemy;

import Game.Hero.Hero;
import Game.Mortal;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(5);
        System.out.println("Вражина атакует героя " + hero.getName());
    }
}
