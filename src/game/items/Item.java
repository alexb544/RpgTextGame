package game.items;

public abstract class Item {
    private final String name; // 15 character length
    private final String description; // 50 character length
    private final int value;

    public Item(String name, String description, int value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getValue() {
        return value;
    }

    public abstract void use();
}
