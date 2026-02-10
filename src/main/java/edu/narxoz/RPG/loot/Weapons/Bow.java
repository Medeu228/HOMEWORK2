package edu.narxoz.RPG.loot.Weapons;

import edu.narxoz.RPG.interfaces.Weapon;

public class Bow implements Weapon {
    public String getName() {
        return "Bow";
    }

    public int getDamage() {
        return 12;
    }
}