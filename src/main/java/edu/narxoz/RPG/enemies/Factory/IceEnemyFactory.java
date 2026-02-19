package edu.narxoz.RPG.enemies.Factory;

import java.util.ArrayList;
import java.util.List;
import edu.narxoz.RPG.enemies.Components.*;

public class IceEnemyFactory implements EnemyComponentFactory {

    public List<Ability> createAbilities() {
        List<Ability> list = new ArrayList<>();
        list.add(new IceAbility());
        return list;
    }

    public List<Loot> createLoot() {
        List<Loot> list = new ArrayList<>();
        list.add(new IceLoot());
        return list;
    }

    public AIBehavior createAI() {
        return new DefensiveAI();
    }
}
