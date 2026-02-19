package edu.narxoz.RPG.enemies.Builder;

import edu.narxoz.RPG.enemies.Factory.EnemyComponentFactory;

public class GoblinBuilder extends EnemyBuilder {

    public GoblinBuilder(EnemyComponentFactory factory) {
        super(factory);
    }

    protected void setBaseStats() {
        this.name = "Goblin";
        this.health = 120;
        this.damage = 25;
        this.defense = 10;
        this.speed = 30;
        this.element = "Elemental";
    }
}
