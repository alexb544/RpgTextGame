package game.items;

import game.GameManager;

public class Consumable extends Item {
    private final int amount;
    private final TYPE type;

    public enum TYPE {
        HEAL,
        RESTORE,
        BUFF,
        DEBUFF
    };

    // Constructor:
    public Consumable(String name, String description, int value, int amount, TYPE type) {
        super(name, description, value);
        this.amount = amount;
        this.type = type;
    }

    // Getters:
    public int getAmount() {
        return this.amount;
    }
    public TYPE getType() {
        return type;
    }


    // Methods:
    @Override
    public void use() {
        switch (type) {
            case HEAL:    GameManager.getPlayer().heal(amount); break;
            case RESTORE: GameManager.getPlayer().restore(amount); break;
            case BUFF:    System.out.println("BUFF not yet implemented"); break;
            case DEBUFF:  System.out.println("DEBUFF not yet implemented"); break;
            default:      System.out.println("Oh no! The item was defective!"); return;
        }
    }

}
