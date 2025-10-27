package game.items;

public class ItemDatabase {

    public static final Consumable potion = new Consumable(
            "Potion", "heals HP by 50", 25, 50, Consumable.TYPE.HEAL
    );
    public static final Consumable elixir = new Consumable(
            "Elixir", "restores MP by 50", 25, 50, Consumable.TYPE.RESTORE
    );
    public static final Equipment ironSword = new Equipment(
            "Iron Sword", "a respectable travelling companion", 60, Equipment.TYPE.SWORD, Equipment.ATTRIBUTE.STRENGTH
    );

}
