package edu.narxoz.RPG.characters;

import edu.narxoz.RPG.interfaces.Weapon;
import edu.narxoz.RPG.interfaces.Armor;

public interface Character {

    String getName();
    int getHealth();
    int getAttack();
    int getDefense();

    void equip(Weapon weapon, Armor armor);
    void showInfo();
}