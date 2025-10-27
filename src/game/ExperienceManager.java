package game;

import game.util.Text;

public class ExperienceManager {
    private static final Player player = GameManager.getPlayer();
    private static final int[] xpThresholds = new int[]
            {0, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

    public static int getXPThreshold() {
        return xpThresholds[GameManager.player.getLevel()];
    }

    // Methods:
    public static void gainXP(int xpGained) {
        player.setXP(player.getXP() + xpGained);
        Text.displayXPGained(xpGained);
        if (player.getLevel() < 10 && xpToLevel() <= 0) {
            levelUp();
        }
    }

    private static void levelUp() {
        player.setXP(player.getXP() - xpThresholds[player.getLevel()]);
        player.setLevel(player.getLevel() + 1);
        player.levelUp();
        Text.displayLevelUp();
    }

    public static int xpToLevel() {
        return xpThresholds[player.getLevel()] - player.getXP();
    }


}
