package edu.narxoz.RPG.factory_method;

import edu.narxoz.RPG.interfaces.Armor;
import edu.narxoz.RPG.interfaces.Weapon;

public interface EquipmentFactory {
    Weapon createWeapon();
    Armor createArmor();
}