
public class Text {

    public static void displayTitleScreen() {
        displayLogo();
        wrapThick("Your Adventure Awaits!");
        System.out.println(
            """
            [1] EXECUTE NEW RUN
            [2] LOAD SECTOR
            [3] VIEW RECORDS
            [4] TERMINATE PROGRAM
            """
        );
    }
    public static void displayLogo() {
        System.out.print(
                """
                ███╗   ███╗██╗   ██╗     ██████╗ ██████╗ ██████╗      ██████╗  █████╗ ███╗   ███╗███████╗
                ████╗ ████║╚██╗ ██╔╝    ██╔══██╗██╔══██╗██╔════╝     ██╔════╝ ██╔══██╗████╗ ████║██╔════╝
                ██╔████╔██║ ╚████╔╝     ██████╔╝██████╔╝██║  ███╗    ██║  ███╗███████║██╔████╔██║█████╗
                ██║╚██╔╝██║  ╚██╔╝      ██╔══██╗██╔═══╝ ██║   ██║    ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝
                ██║ ╚═╝ ██║   ██║       ██║  ██║██║     ╚██████╔╝    ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗
                ╚═╝     ╚═╝   ╚═╝       ╚═╝  ╚═╝╚═╝      ╚═════╝      ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝
                """
        );
    }
    public static void displayMenu() {
        wrapThick(
            """
            [1] Next Battle
            [2] Display Stats
            [3] Quit Game
            """
        );
    }
    public static void displayStats(Player player) {
        System.out.printf("%nStats:%n");
        wrapThick(
            String.format(
                String.format("%s   Level: %d   XP: %d/%d %nHP:  %d/%d %n",
                    player.getName(), player.getLevel(),
                    player.getXP(), ExperienceManager.getXPThreshold(player.getLevel()),
                    player.getHealth(), player.getMaxHealth())
                + "-".repeat(50)
                + String.format("%nSTR: %d %nDEF: %d %n", player.getStrength(), player.getDefense())
            )
        );
    }
    public static void displayXPGained(int xpGained) {
        wrap(String.format("You gained: %d XP! %n", xpGained));
    }
    public static void displayLevelUp(Player player) {
        wrapThick(String.format("%s Leveled up! %n", player.getName()));
    }
    public static void displayGameOver() {
        wrapThick("You died!%nGAME OVER!");
    }


    public static void line() {
        System.out.println("-".repeat(50));
    }
    public static void lineThick() {
        System.out.println("=".repeat(50));
    }

    public static void wrap(String s) {
        line();
        System.out.print(s + "\n");
        line();
    }
    public static void wrapThick(String s) {
        lineThick();
        System.out.print(s + "\n");
        lineThick();
    }

}
