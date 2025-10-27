package game.items;

import game.enums.ATTRIBUTE_TYPE;
import game.enums.EQUIPMENT_TYPE;

public class Equipment extends Item {
    private final EQUIPMENT_TYPE type;
    private final ATTRIBUTE_TYPE attribute;

    public Equipment(String name, String description, int value, EQUIPMENT_TYPE type, ATTRIBUTE_TYPE attribute) {
        super(name, description, value);
        this.type = type;
        this.attribute = attribute;
    }

    // Getters:
    public EQUIPMENT_TYPE getType() {
        return type;
    }
    public ATTRIBUTE_TYPE getAttribute() {
        return attribute;
    }


    // Methods:
    @Override
    public void use() {
        equip(this);
    }

    public void equip(Equipment equipment) {
        System.out.println("You equipped: " + this.getName());
        switch (type) { // TODO: CREATE EQUIPMENT SLOTS FOR PLAYER
            case HELM: break;
            case SWORD: break;
            case SHIELD: break;
            case CHEST: break;
            default: System.out.println("Oh no! You forgot how to equip this...");
        }
    }
}
