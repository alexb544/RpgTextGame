package game.menus;

import game.GameManager;
import game.Shop;
import game.util.Colors;
import game.util.Text;

public class TownMenu implements Menu {

    @Override
    public void display() {
        Text.wrapBold(Text.center(Colors.color("TOWN MENU", Colors.BOLD)) + "\n" + Text.printLineBold() + "\n" +
                """
                [1] Quest Board
                [2] Shop
                [3] View Stats
                [4] Check Equipment
                [5] Open Inventory
                [6] Leave Area
                [0] Quit Game"""
        );
        Text.askForInput("Select an option");
        optionSelect();
    }

    @Override
    public void optionSelect() {
        switch (GameManager.getPlayerInput()) {
            case "1": // Quest Board
                System.out.println("Quest Board");
                display();
                break;
            case "2": // Shop
                Shop shop = new Shop();
                shop.displayInventory();
                GameManager.await();
                display();
                break;
            case "3": // View Stats
                Text.displayStats();
                display();
                break;
            case "4": // Check Equipment
                System.out.println("Equipment");
                display();
                break;
            case "5": // Open Inventory
                System.out.println("Inventory");
                display();
                break;
            case "6": // Leave Area
                System.out.println("Leave Area");
                display();
                break;
            case "0":
                GameManager.quit();
            default:
                System.out.println("Invalid option selected...");
                display();
        }
    }
}
