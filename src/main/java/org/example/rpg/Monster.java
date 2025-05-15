package org.example.rpg;

public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public double attack() {
        double bleed = this instanceof Bleedable ? ((Bleedable)this).bleed() : 0;
        double poison = this instanceof Poisonable ? ((Poisonable)this).poison() : 0;
        return getDamage() + bleed + poison;
    }
}
