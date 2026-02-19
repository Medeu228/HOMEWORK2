package edu.narxoz.RPG.enemies.Factory;

import java.util.List;
import edu.narxoz.RPG.enemies.Components.*;

public interface EnemyComponentFactory {

    List<Ability> createAbilities();

    List<Loot> createLoot();

    AIBehavior createAI();
}
