package game.menus;

import game.GameManager;
import game.util.Text;

public class TownMenu implements Menu {

    @Override
    public void display() {
        Text.wrapBold("TOWN MENU:\n" + Text.printLineBold() + "\n" +
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
                System.out.println("Shop");
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
