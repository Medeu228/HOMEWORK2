package edu.narxoz.RPG.characters;

import edu.narxoz.RPG.interfaces.Armor;
import edu.narxoz.RPG.interfaces.Weapon;

public class Mage {

    private String name;
    private int health;
    private Weapon weapon;
    private Armor armor;

    public Mage(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void equip(Weapon weapon, Armor armor) {
        this.weapon = weapon;
        this.armor = armor;
    }
}