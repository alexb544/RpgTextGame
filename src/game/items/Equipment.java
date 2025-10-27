package game.items;

public class Equipment extends Item {
    private final TYPE type;
    private final ATTRIBUTE attribute;

    public enum ATTRIBUTE {
        STRENGTH,
        DEFENSE
    }
    public enum TYPE {
        HELM,
        CHEST,
        SWORD,
        SHIELD,
    }

    public Equipment(String name, String description, int value, TYPE type, ATTRIBUTE attribute) {
        super(name, description, value);
        this.type = type;
        this.attribute = attribute;
    }

    // Getters:
    public TYPE getType() {
        return type;
    }
    public ATTRIBUTE getAttribute() {
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
