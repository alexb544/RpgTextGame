package game;

import java.util.Scanner;
import game.util.*;
import game.menus.*;

public class GameManager {
    static Scanner input = new Scanner(System.in);
    static Player player = new Player();

    public static void main(String[] args) {
        MenuUtils.show(new TitleScreenMenu());
        gameEnd();
    }

    public static void setPlayerName() {
        while (true) {
            Text.askForInput("What is your name");
            String name = getPlayerInput();
            Text.askForInput(String.format("Your name is %s? (y/n)", name));
            String confirm = getPlayerInput();
            if (confirm.equalsIgnoreCase("y")) {
                player.setName(name);
                System.out.println();
                break;
            }
            else System.out.println();
        }
    }

    public static Player getPlayer() {
        return player;
    }

    public static String getPlayerInput() {
        return input.nextLine().trim();
    }

    public static void await() {
        input.nextLine();
    }

    public static void quit() {
        System.out.print("Are you sure you want to Quit? (y/n): ");
        String confirm = getPlayerInput();
        if (confirm.equalsIgnoreCase("y")) {
            System.out.println("Closing Game... Thanks for playing!");
            System.exit(0);
        }
        else System.out.println();
    }

    public static void gameEnd() {
        if (player.getHealth() <= 0)
            Text.displayGameOver();
        else {
            Text.displayLogo();
            Text.displayGameWon();
        }
    }

}