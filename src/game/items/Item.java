package game.items;

public abstract class Item {
    private final String name; // 15 character length
    private final String description; // 50 character length
    private final int value;

    // Constructors:
    public Item(String name, String description, int value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }

    // Getters:
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getValue() {
        return value;
    }

    // Abstract Methods:
    public abstract void use();
}
