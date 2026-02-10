package edu.narxoz.RPG.abstract_factory;

import edu.narxoz.RPG.factory_method.EquipmentFactory;
import edu.narxoz.RPG.interfaces.Weapon;
import edu.narxoz.RPG.interfaces.Armor;
import edu.narxoz.RPG.loot.Weapons.Staff;
import edu.narxoz.RPG.loot.Armor.Robe;

public class MagicEquipmentFactory implements EquipmentFactory {

    public Weapon createWeapon() {
        return new Staff();
    }

    public Armor createArmor() {
        return new Robe();
    }
}