package game;

import game.items.Item;
import game.items.ItemDatabase;
import game.util.Text;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Item> inventory = new ArrayList<>();

    public Shop() {
        populateInventory();
    }

    private void populateInventory() {
        switch(GameManager.getPlayer().getLevel()) { //TODO: ADD ITEMS FOR EACH LEVEL BRACKET
            case 1:
                inventory.add(ItemDatabase.potion);
                inventory.add(ItemDatabase.elixir);
                inventory.add(ItemDatabase.ironSword);
                break;
            case 2:
                inventory.add(ItemDatabase.potion);
                inventory.add(ItemDatabase.elixir);
                inventory.add(ItemDatabase.elixir);
                inventory.add(ItemDatabase.ironSword);
                inventory.add(ItemDatabase.potion);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            default: System.out.println("Invalid player level");
        }
    }

    public void displayInventory() {
        int lineLength = Text.getLineLength();
        System.out.println("╔" + "═".repeat(lineLength - 2) + "╗");
        for (Item item : inventory) {
            System.out.printf("║ %-15s ║ %-50s ║ %13dG ║%n", item.getName(), item.getDescription(), item.getValue());
        }
        System.out.println("╚" + "═".repeat(lineLength - 2) + "╝");
    }

    public List<Item> getInventory() {
        return this.inventory;
    }

}
