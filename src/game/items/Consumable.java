package game.items;

import game.GameManager;
import game.enums.CONSUMABLE_TYPE;

public class Consumable extends Item {
    private final int amount;
    private final CONSUMABLE_TYPE type;

    // Constructor:
    public Consumable(String name, String description, int value, int amount, CONSUMABLE_TYPE type) {
        super(name, description, value);
        this.amount = amount;
        this.type = type;
    }

    // Getters:
    public int getAmount() {
        return this.amount;
    }
    public CONSUMABLE_TYPE getType() {
        return type;
    }

    // Methods:
    @Override
    public void use() {
        switch (type) {
            case HEAL    -> GameManager.getPlayer().heal(amount);
            case RESTORE -> GameManager.getPlayer().restore(amount);
            case BUFF    -> System.out.println("BUFF not yet implemented");
            case DEBUFF  -> System.out.println("DEBUFF not yet implemented");
        }
    }

}
