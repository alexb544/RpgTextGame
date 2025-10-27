package game.util;

import game.GameManager;
import game.Player;

public class Calc {

    public static void damage(int value) {
        Player player = GameManager.getPlayer();
        int defense = player.getDefense();
        int damageTaken = value - defense;
        player.setHealth(player.getHealth() - damageTaken);
        System.out.println(Colors.color(player.getName() + " took " + damageTaken + " damage!", Colors.RED));
    }

}
