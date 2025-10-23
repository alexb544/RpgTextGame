package game.Utilities;
import game.menus.*;

public class MenuUtils {
    public static void show(Menu menu) {
        menu.display();
    }

    public static void optionSelect(Menu menu, String input) {
        menu.optionSelect();
    }
}
