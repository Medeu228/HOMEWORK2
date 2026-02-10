package edu.narxoz.RPG;

import java.util.Scanner;

import edu.narxoz.RPG.characters.Character;
import edu.narxoz.RPG.factory_method.*;
import edu.narxoz.RPG.abstract_factory.*;
import edu.narxoz.RPG.factory_method.EquipmentFactory;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // === Выбор персонажа (Factory Method)
        System.out.println("Choose character: 1-Warrior, 2-Mage, 3-Archer");
        int c = sc.nextInt();

        CharacterFactory characterFactory;

        if (c == 1) characterFactory = new WarriorFactory();
        else if (c == 2) characterFactory = new MageFactory();
        else characterFactory = new ArcherFactory();

        Character character = characterFactory.create();

        // === Выбор экипировки (Abstract Factory)
        System.out.println("Choose equipment: 1-Medieval, 2-Magic, 3-Ranger");
        int e = sc.nextInt();

        EquipmentFactory equipmentFactory;

        if (e == 1) equipmentFactory = new MedievalEquipmentFactory();
        else if (e == 2) equipmentFactory = new MagicEquipmentFactory();
        else equipmentFactory = new RangerEquipmentFactory();

        character.equip(
                equipmentFactory.createWeapon(),
                equipmentFactory.createArmor()
        );

        // === Результат
        character.showInfo();
    }
}