import java.util.Scanner;

public class GameManager {
    static Scanner input = new Scanner(System.in);
    static Player player = new Player();
    static ExperienceManager experience = new ExperienceManager();

    public static void main(String[] args) {
        titleScreen();
//        await();
//        getPlayerName();
//        menuSelect();
//        gameEnd();
    }

    static void menuSelect() {
        while (player.getHealth() > 0) {
            Text.displayMenu();
            System.out.print("Select an option: ");

            switch (input.nextLine().trim()) {
                case "1": System.out.println("You go to find something to slay...");
                    break;
                case "2": Text.displayStats(player);
                    break;
                case "3": System.out.println("TBD");
                    break;
                case "4": System.out.println("Travel");
                    break;
                case "5": System.out.println("Inventory");
                    break;
                case "6": System.out.println("Equipment");
                    break;
                case "0": quit();
                    break;
                default: System.out.println("Invalid option selected.");
            }
            await();
        }
    }

    static void titleScreen() {
        Text.displayTitleScreen();
    }

    static void getPlayerName() {
        while (true) {
            System.out.print("What is your name?: ");
            String name = input.nextLine().trim();

            System.out.printf("Your name is %s? (y/n): ", name);
            String confirm = input.nextLine().trim();

            if (confirm.equalsIgnoreCase("y")) {
                player.setName(name);
                break;
            }
            else
                Text.line();
        }
    }

    static void await() {
        System.out.print("Press Enter to continue...");
        input.nextLine();
        System.out.println();
    }

    static void quit() {
        System.out.print("Are you sure you want to Quit? (y/n): ");
        String confirm = input.nextLine();
        if (confirm.equalsIgnoreCase("y")) {
            System.out.println("Closing Game... Thanks for playing!");
            System.exit(0);
        }
        else System.out.println();
    }

    public static Player getPlayer() {
        return player;
    }

}