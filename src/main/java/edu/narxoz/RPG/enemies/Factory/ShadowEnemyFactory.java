package edu.narxoz.RPG.enemies.Factory;

import java.util.ArrayList;
import java.util.List;
import edu.narxoz.RPG.enemies.Components.*;

public class ShadowEnemyFactory implements EnemyComponentFactory {

    public List<Ability> createAbilities() {
        List<Ability> list = new ArrayList<>();
        list.add(new ShadowAbility());
        return list;
    }

    public List<Loot> createLoot() {
        List<Loot> list = new ArrayList<>();
        list.add(new ShadowLoot());
        return list;
    }

    public AIBehavior createAI() {
        return new StealthAI();
    }
}
