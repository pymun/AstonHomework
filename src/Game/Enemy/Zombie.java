package Game.Enemy;

import Game.Hero.Hero;

public class Zombie extends Enemy{

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        int riseFromDead = (int) (Math.random() * 10);
        if (!isAlive() && riseFromDead > 5) {
            setHealth(100);
            System.out.println("Зомби востал из метрвых");
        }
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(10);
        System.out.println("Зомби атакует " + hero.getName());
    }
}
