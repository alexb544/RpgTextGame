package game.menus;

import game.GameManager;
import game.util.Colors;
import game.util.MenuUtils;
import game.util.Text;

public class TitleScreenMenu implements Menu {

    @Override
    public void display() {
        Text.displayLogo();
        Text.wrapBold(
                """
                [1] NEW GAME
                [2] OPTIONS
                [3] HELP
                [0] QUIT GAME"""
        );
        Text.askForInput("Select an option");
        optionSelect();
    }

    public void optionSelect() {
        switch (GameManager.getPlayerInput()) {
            case "1":
                System.out.println("\nStarting a New Game...");
                GameManager.setPlayerName();
                MenuUtils.show(new MainMenu());
                break;
            case "2":
                System.out.println("Options...");
                display();
                break;
            case "3":
                System.out.println("Help...");
                display();
                break;
            case "0":
                GameManager.quit();
                break;
            default:
                System.out.println("Invalid option selected...");
                display();
        }
    }
}
