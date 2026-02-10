package edu.narxoz.RPG.characters;

import edu.narxoz.RPG.interfaces.Weapon;
import edu.narxoz.RPG.interfaces.Armor;

public class Warrior implements Character {

    private Weapon weapon;
    private Armor armor;

    public String getName() {
        return "Warrior";
    }

    public int getHealth() {
        return 150;
    }

    public int getAttack() {
        return weapon != null ? weapon.getDamage() : 0;
    }

    public int getDefense() {
        return armor != null ? armor.getDefense() : 0;
    }

    public void equip(Weapon weapon, Armor armor) {
        this.weapon = weapon;
        this.armor = armor;
    }

    public void showInfo() {
        System.out.println(getName()
                + " | HP: " + getHealth()
                + " | ATK: " + getAttack()
                + " | DEF: " + getDefense());
    }
}