package edu.narxoz.RPG.enemies.Builder;

import edu.narxoz.RPG.enemies.Factory.EnemyComponentFactory;

public class DragonBuilder extends EnemyBuilder {

    public DragonBuilder(EnemyComponentFactory factory) {
        super(factory);
    }

    protected void setBaseStats() {
        this.name = "Dragon";
        this.health = 500;
        this.damage = 80;
        this.defense = 40;
        this.speed = 20;
        this.element = "Elemental";
    }
}
