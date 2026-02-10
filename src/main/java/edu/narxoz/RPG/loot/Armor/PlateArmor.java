package edu.narxoz.RPG.loot.Armor;

import edu.narxoz.RPG.interfaces.Armor;

public class PlateArmor implements Armor {
    public String getName() {
        return "Plate Armor";
    }

    public int getDefense() {
        return 20;
    }
}