package edu.narxoz.RPG.enemies.Builder;

import edu.narxoz.RPG.enemies.Enemy;
import edu.narxoz.RPG.enemies.Factory.EnemyComponentFactory;

public abstract class EnemyBuilder {

    protected String name;
    protected int health;
    protected int damage;
    protected int defense;
    protected int speed;
    protected String element;

    protected EnemyComponentFactory componentFactory;

    public EnemyBuilder(EnemyComponentFactory factory) {
        this.componentFactory = factory;
    }

    protected abstract void setBaseStats();

    // ===== Factory Method внутри Builder =====
    public Enemy build() {

        setBaseStats();

        return new Enemy(
                name,
                health,
                damage,
                defense,
                speed,
                element,
                componentFactory.createAbilities(),
                componentFactory.createLoot(),
                componentFactory.createAI()
        );
    }
}
