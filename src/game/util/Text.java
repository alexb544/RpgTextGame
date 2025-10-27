package game.util;

import game.ExperienceManager;
import game.GameManager;
import game.Player;

public class Text {
    private static int lineLength = 89;
    private static final Player player = GameManager.getPlayer();

    // Display Methods: (Menus, Info, etc.)
    public static void displayLogo() {
        System.out.print(
                """
                ███╗   ███╗██╗   ██╗    ███████╗ ██████╗ ██████╗      ██████╗  █████╗ ███╗   ███╗███████╗
                ████╗ ████║╚██╗ ██╔╝    ██╔══██╗██╔══██╗██╔════╝     ██╔════╝ ██╔══██╗████╗ ████║██╔════╝
                ██╔████╔██║ ╚████╔╝     ██████╔╝██████╔╝██║  ███╗    ██║  ███╗███████║██╔████╔██║█████╗
                ██║╚██╔╝██║  ╚██╔╝      ██╔══██╗██╔═══╝ ██║   ██║    ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝
                ██║ ╚═╝ ██║   ██║       ██║  ██║██║     ╚██████╔╝    ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗
                ╚═╝     ╚═╝   ╚═╝       ╚═╝  ╚═╝╚═╝      ╚═════╝      ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝
                """
        );
    }
    public static void displayStats() {
        System.out.println("\n" + printLineBold() + "\n" + "[Stats]:");
        wrapBold(String.format(
                String.format("%s   Level: %d   XP: %d/%d %nHP:  %s %d/%d %n",
                        player.getName(), player.getLevel(), player.getXP(), ExperienceManager.getXPThreshold(),
                        displayHPBar() ,player.getHealth(), player.getMaxHealth())
                + printLine()
                + String.format("%nSTR: %d %nDEF: %d", player.getStrength(), player.getDefense())
            )
        );
        GameManager.await();
    }
    public static void displayXPGained(int xpGained) {
        System.out.printf("You gained: [%d XP]%n", xpGained);
    }
    public static void displayLevelUp() {
        wrapImportant(player.getName() + " Leveled up!");
    }
    public static void displayGameOver() {
        wrapBold("You died!%nGAME OVER!");
    }
    public static void displayGameWon() {
        wrapBold("Congratulations! You won!");
    }

    public static String displayHPBar() {
        int hp = player.getHealth();
        int maxHP = player.getMaxHealth();

        int totalBars = 10 + (Math.max(0, (maxHP - 100) / 25));
        int filledBars = (int) Math.round((double) hp / maxHP * totalBars);
        int emptyBars = totalBars - filledBars;

        String filled = "█".repeat(filledBars);
        String empty = " ".repeat(emptyBars);

        return "[" + filled + empty + "]";
    }

    // Ask for Input:
    public static void askForInput(String ask) {
        System.out.printf("> %s: ", ask);
    }

    // Single Lines:
    public static void line() {
        System.out.println("-".repeat(lineLength));
    }
    public static void lineBold() {
        System.out.println("=".repeat(lineLength));
    }
    public static void lineImportant() {
        System.out.println("*".repeat(lineLength));
    }

    // Single Lines: (for String concatenations)
    public static String printLine() {
        return "-".repeat(lineLength);
    }
    public static String printLineBold() {
        return "=".repeat(lineLength);
    }
    public static String printLineImportant() {
        return "*".repeat(lineLength);
    }

    // Text Wraps: surrounds text on both ends
    public static void wrap(String s) {
        line();
        System.out.println(s);
        line();
    }
    public static void wrapBold(String s) {
        lineBold();
        System.out.println(s);
        lineBold();
    }
    public static void wrapImportant(String s) {
        lineImportant();
        System.out.println(s);
        lineImportant();
    }

    // Getters & Setters
    public static int getLineLength() {
        return lineLength;
    }
    public static void setLineLength(int newLength) {
        lineLength = newLength;
    }


}
