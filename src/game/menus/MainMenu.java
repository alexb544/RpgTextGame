package game.menus;

import game.util.Calc;
import game.ExperienceManager;
import game.GameManager;
import game.util.Colors;
import game.util.MenuUtils;
import game.util.Text;

public class MainMenu implements Menu {

    @Override
    public void display() {
        Text.wrapBold(Text.center(Colors.color("MAIN MENU", Colors.BOLD))+ "\n" + Text.printLineBold() + "\n" +
                """
                [1] Look Around
                [2] Use Item
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
            case "1":
                System.out.print("\nYou look around for a bit...");
                GameManager.await();
                Calc.damage(20);
                ExperienceManager.gainXP(50);
                GameManager.await();
                display();
                break;
            case "2":
                System.out.println("Use Item");
                display();
                break;
            case "3":
                Text.displayStats();
                display();
                break;
            case "4":
                System.out.println("Check Equipment");
                display();
                break;
            case "5":
                System.out.println("Open Inventory");
                display();
                break;
            case "6":
                System.out.println("Leave Area --> You go to a nearby town...");
                GameManager.await();
                MenuUtils.show(new TownMenu());
                break;
            case "0":
                GameManager.quit();
            default:
                System.out.println("Invalid option selected...");
                display();
        }
    }
}
