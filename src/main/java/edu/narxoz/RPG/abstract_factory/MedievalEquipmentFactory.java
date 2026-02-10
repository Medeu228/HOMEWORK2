package edu.narxoz.RPG.abstract_factory;

import edu.narxoz.RPG.factory_method.EquipmentFactory;
import edu.narxoz.RPG.interfaces.Weapon;
import edu.narxoz.RPG.interfaces.Armor;
import edu.narxoz.RPG.loot.Weapons.Sword;
import edu.narxoz.RPG.loot.Armor.PlateArmor;

public class MedievalEquipmentFactory implements EquipmentFactory {

    public Weapon createWeapon() {
        return new Sword();
    }

    public Armor createArmor() {
        return new PlateArmor();
    }
}