package game.util;

import game.ExperienceManager;
import game.GameManager;
import game.Player;

import java.awt.*;

public class Text {
    private static int lineLength = 89;
    private static final Player player = GameManager.getPlayer();

    // Display Methods: (Menus, Info, etc.)
    public static void displayLogo() {
        System.out.print(
                Colors.color(
                """
                ███╗   ███╗██╗   ██╗    ███████╗ ██████╗ ██████╗      ██████╗  █████╗ ███╗   ███╗███████╗
                ████╗ ████║╚██╗ ██╔╝    ██╔══██╗██╔══██╗██╔════╝     ██╔════╝ ██╔══██╗████╗ ████║██╔════╝
                ██╔████╔██║ ╚████╔╝     ██████╔╝██████╔╝██║  ███╗    ██║  ███╗███████║██╔████╔██║█████╗
                ██║╚██╔╝██║  ╚██╔╝      ██╔══██╗██╔═══╝ ██║   ██║    ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝
                ██║ ╚═╝ ██║   ██║       ██║  ██║██║     ╚██████╔╝    ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗
                ╚═╝     ╚═╝   ╚═╝       ╚═╝  ╚═╝╚═╝      ╚═════╝      ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝
                """
        , Colors.MAGENTA));
    }
    public static void displayStats() {
        wrapBold(center(Colors.color("STATS", Colors.BOLD)));
        System.out.printf("%s     %s     %s%n",
                player.getName(),
                "Level: " + player.getLevel(),
                "XP: " + player.getXP() + "/" + ExperienceManager.getXPThreshold()
        );
        System.out.printf("HP: %s %d/%d%n",
                Colors.color(displayHPBar(), Colors.GREEN),
                player.getHealth(),
                player.getMaxHealth()
        );
        line();
        System.out.println("STR: " + player.getStrength());
        System.out.println("DEF: " + player.getDefense());
        lineBold();

        GameManager.await();
    }
    public static void displayXPGained(int xpGained) {
        System.out.printf("You gained: [%d XP]%n", xpGained);
    }

    // TODO: fix level up (show prev stats before showing updated stats
    public static void displayLevelUp() {
        wrapImportant(center(player.getName() + " Leveled up!"), Colors.YELLOW);
        System.out.println(Colors.color("MAX HP --> " + player.getMaxHealth(), Colors.YELLOW));
        System.out.println(Colors.color("STR    --> " + player.getStrength(), Colors.YELLOW));
        System.out.println(Colors.color("DEF    --> " + player.getDefense(), Colors.YELLOW));
        System.out.println(Colors.color(printLineImportant(), Colors.YELLOW));
        GameManager.await();
    }
    public static void displayGameOver() {
        wrapBold("You died!%nGAME OVER!");
    }
    public static void displayGameWon() {
        wrapBold("Congratulations! You won!");
    }

    // String returning methods for Displaying
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
    public static void wrap(String s, String color) {
        System.out.println(
                Colors.color(printLine() + "\n" + s + "\n" + printLine(), color)
        );
    }
    public static void wrapBold(String s) {
        lineBold();
        System.out.println(s);
        lineBold();
    }
    public static void wrapBold(String s, String color) {
        System.out.println(
                Colors.color(printLineBold() + "\n" + s + "\n" + printLineBold(), color)
        );
    }
    public static void wrapImportant(String s) {
        lineImportant();
        System.out.println(s);
        lineImportant();
    }
    public static void wrapImportant(String s, String color) {
        System.out.println(
                Colors.color(printLineImportant() + "\n" + s + "\n" + printLineImportant(), color)
        );
    }

    // Getters & Setters
    public static int getLineLength() {
        return lineLength;
    }
    public static void setLineLength(int newLength) {
        lineLength = newLength;
    }

    public static String center(String text) {
        int padding = Math.max(0, (lineLength - text.length()) / 2);
        return " ".repeat(padding) + text;
    }

    public static void space() {
        System.out.println("\n".repeat(10));
    }

}
