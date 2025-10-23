
public class Stats {
    private int maxHealth;
    private int strength;
    private int defense;

    public Stats() {
        this.maxHealth = 100;
        this.strength = 10;
        this.defense = 10;
    }

    // Getters:
    protected int getMaxHealth() { return this.maxHealth;}
    protected int getStrength() { return this.strength; }
    protected int getDefense() { return this.defense; }

    // Setters:
    protected void setMaxHealth(int maxHealth) { this.maxHealth = maxHealth; }
    protected void setStrength(int strength) { this.strength = strength; }
    protected void setDefense(int defense) { this.defense = defense; }

    // Methods:
    protected void levelUp() {
        this.maxHealth += 25;
        this.strength += 5;
        this.defense += 5;
    }

}
