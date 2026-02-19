package edu.narxoz.RPG.enemies;

import java.util.List;
import edu.narxoz.RPG.enemies.Components.Ability;
import edu.narxoz.RPG.enemies.Components.Loot;
import edu.narxoz.RPG.enemies.Components.AIBehavior;

public class Enemy implements Cloneable {

    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private String element;

    private List<Ability> abilities;
    private List<Loot> loot;
    private AIBehavior aiBehavior;

    public Enemy(String name,
                 int health,
                 int damage,
                 int defense,
                 int speed,
                 String element,
                 List<Ability> abilities,
                 List<Loot> loot,
                 AIBehavior aiBehavior) {

        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
        this.element = element;
        this.abilities = abilities;
        this.loot = loot;
        this.aiBehavior = aiBehavior;
    }


    @Override
    public Enemy clone() {
        try {
            return (Enemy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


    public void showInfo() {
        System.out.println("Enemy: " + name);
        System.out.println("HP: " + health +
                " | DMG: " + damage +
                " | DEF: " + defense +
                " | SPD: " + speed +
                " | ELEMENT: " + element);

        System.out.println("AI: " + aiBehavior.getType());

        System.out.println("Abilities:");
        for (Ability a : abilities) {
            System.out.println("- " + a.getName());
        }

        System.out.println("Loot:");
        for (Loot l : loot) {
            System.out.println("- " + l.getName());
        }

        System.out.println("---------------");
    }
}