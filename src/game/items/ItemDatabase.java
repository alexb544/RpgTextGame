package game.items;

import game.enums.ATTRIBUTE_TYPE;
import game.enums.CONSUMABLE_TYPE;
import game.enums.EQUIPMENT_TYPE;

public class ItemDatabase {

    public static final Consumable potion = new Consumable(
            "Potion",
            "heals HP by 50",
            25,
            50,
            CONSUMABLE_TYPE.HEAL
    );
    public static final Consumable elixir = new Consumable(
            "Elixir",
            "restores MP by 50",
            25,
            50,
            CONSUMABLE_TYPE.HEAL
    );
    public static final Equipment ironSword = new Equipment(
            "Iron Sword",
            "a respectable travelling companion",
            60,
            EQUIPMENT_TYPE.SWORD,
            ATTRIBUTE_TYPE.STRENGTH
    );

}
