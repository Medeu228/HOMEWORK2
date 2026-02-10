package edu.narxoz.RPG.abstract_factory;

import edu.narxoz.RPG.factory_method.EquipmentFactory;
import edu.narxoz.RPG.interfaces.Weapon;
import edu.narxoz.RPG.interfaces.Armor;
import edu.narxoz.RPG.loot.Weapons.Bow;
import edu.narxoz.RPG.loot.Armor.LeatherArmor;

public class RangerEquipmentFactory implements EquipmentFactory {

    public Weapon createWeapon() {
        return new Bow();
    }

    public Armor createArmor() {
        return new LeatherArmor();
    }
}