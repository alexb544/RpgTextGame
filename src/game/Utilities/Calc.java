package game.Utilities;

import game.GameManager;
import game.Player;

public class Calc {

    public static int damage(int value) {
        Player player = GameManager.getPlayer();
        int defense = player.getDefense();
        int damageTaken = value  - defense;
        return Math.max(damageTaken, 0);
    }

}
