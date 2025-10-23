package game.menus;
import game.Utilities.Calc;
import game.ExperienceManager;
import game.GameManager;
import game.Utilities.Text;

public class MainMenu implements Menu {

    @Override
    public void display() {
        Text.wrapBold("[Main Menu]:\n" + Text.printLineBold() + "\n" +
                """
                [1] Next Battle
                [2] Display Stats
                [3] Merchant
                [4] Travel
                [5] Inventory
                [6] Equipment
                [0] Quit Game"""
        );
        Text.askForInput("Select an option");
        optionSelect();
    }

    @Override
    public void optionSelect() {
        switch (GameManager.getPlayerInput()) {
            case "1":
                System.out.print("\nYou go to find something to slay...");
                GameManager.getPlayerInput();
                GameManager.getPlayer().setHealth(Calc.damage(20));
                ExperienceManager.gainXP(50);
                break;
            case "2":
                Text.displayStats();
                break;
            case "3":
                System.out.println("Merchant");
                break;
            case "4":
                System.out.println("Travel");
                break;
            case "5":
                System.out.println("Inventory");
                break;
            case "6":
                System.out.println("Equipment");
                break;
            case "0":
                GameManager.quit();
                break;
            default:
                System.out.println("Invalid option selected...");
        }
        display();
    }
}
