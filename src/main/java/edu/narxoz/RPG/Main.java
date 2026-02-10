package edu.narxoz.RPG;

import edu.narxoz.RPG.characters.*;
import edu.narxoz.RPG.factory_method.*;
import edu.narxoz.RPG.abstract_factory.*;
import edu.narxoz.RPG.interfaces.*;

public class Main {

    public static void main(String[] args) {

        // ===== Factory Method (персонажи) =====
        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        Character warrior = warriorFactory.createCharacter();
        Character mage = mageFactory.createCharacter();
        Character archer = archerFactory.createCharacter();

        // ===== Abstract Factory (экипировка) =====
        EquipmentFactory medieval = new MedievalEquipmentFactory();
        EquipmentFactory magic = new MagicEquipmentFactory();
        EquipmentFactory ranger = new RangerEquipmentFactory();

        equip(warrior, medieval);
        equip(mage, magic);
        equip(archer, ranger);

        // ===== Вывод =====
        show(warrior);
        show(mage);
        show(archer);
    }

    private static void equip(Character character, EquipmentFactory factory) {
        Weapon weapon = factory.createWeapon();
        Armor armor = factory.createArmor();

        character.setWeapon(weapon);
        character.setArmor(armor);
    }

    private static void show(Character character) {
        System.out.println("Class: " + character.getName());
        System.out.println("Weapon: " + character.getWeapon().getName()
                + " | Damage: " + character.getWeapon().getDamage());
        System.out.println("Armor: " + character.getArmor().getName()
                + " | Defense: " + character.getArmor().getDefense());
        System.out.println("---------------------");
    }
}