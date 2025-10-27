package game;

public class Stats {
    private int maxHealth;
    private int maxMana;
    private int strength;
    private int defense;

    public Stats() {
        this.maxHealth = 100;
        this.strength = 10;
        this.defense = 10;
    }

    // Getters:
    public int getMaxHealth() { return this.maxHealth;}
    public int getMaxMana() { return this.maxMana;}
    public int getStrength() { return this.strength; }
    public int getDefense() { return this.defense; }

    // Setters:
    public void setMaxHealth(int maxHealth) { this.maxHealth = maxHealth; }
    public void setMaxMana(int maxMana) { this.maxMana = maxMana; }
    public void setStrength(int strength) { this.strength = strength; }
    public void setDefense(int defense) { this.defense = defense; }

    // Methods:
    protected void levelUp() {
        this.maxHealth += 25;
        this.maxMana += 25;
        this.strength += 5;
        this.defense += 5;
    }

}
