
public class ExperienceManager {
    private static final int[] xpThresholds = new int[]
            {0, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

    // Getters:
    public static int getXPThreshold(int level) {
        return xpThresholds[level];
    }

    // Methods:
    public void gainXP(Player player, int xpGained) {
        player.setXP(player.getXP() + xpGained);
        Text.displayXPGained(xpGained);
        if (player.getLevel() < 10 && xpToLevel(player) <= 0) {
            levelUp(player);
        }
    }

    public void levelUp(Player player) {
        player.setXP(player.getXP() - xpThresholds[player.getLevel()]);
        player.setLevel(player.getLevel() + 1);
        player.levelUp();
        Text.displayLevelUp(player);
    }

    public int xpToLevel(Player player) {
        return xpThresholds[player.getLevel()] - player.getXP();
    }

}
