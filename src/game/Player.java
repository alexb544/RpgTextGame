package game;

import game.enums.EQUIPMENT_SLOT;
import game.items.Equipment;
import java.util.HashMap;
import java.util.Map;

public class Player extends Stats {
    private String name;
    private int health;
    private int mana;
    private int level = 1;
    private int xp;
    private int gold;
    private Map<EQUIPMENT_SLOT, Equipment> equipment = new HashMap<>();



    public Player() {
        super();
        this.health = getMaxHealth();
        this.gold = 100;
    }

    // Getters:
    public String getName() { return this.name; }
    public int getHealth() { return this.health; }
    public int getMana() { return this.mana; }
    public int getLevel() { return this.level; }
    public int getXP() { return this.xp; }
    public int getGold() { return this.gold; }

    // Setters:
    public void setName(String name) { this.name = name; }
    public void setHealth(int health) { this.health = health; }
    public void setMana(int mana) { this.mana = mana; }
    public void setLevel(int level) { this.level = level; }
    public void setXP(int xp) { this.xp = xp; }
    public void setGold(int gold) { this.gold = gold; }


    // Methods:
    public void payGold(int gold) {
        this.gold -= gold;
    }
    public void gainGold(int gold) {
        this.gold += gold;
    }

        // Health Methods:
    public void heal(int amount) {
        this.health = Math.min(this.health + amount, getMaxHealth());
    }
    public void restore(int amount) {
        this.health = Math.min(this.mana + amount, getMaxMana());
    }

        // Equipment Methods:
    public void equip(EQUIPMENT_SLOT slot, Equipment equipment) {
        equipment.put(slot, item);
    }

    public Equipment getEquipped(EQUIPMENT_SLOT slot) {
        return equipment.get(slot);
    }


}
