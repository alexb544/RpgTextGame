package game;

public class Player extends Stats {
    private String name;
    private int health;
    private int level = 1;
    private int xp;
    private int gold;
    //private Equipment equipment;


    public Player() {
        super();
        this.health = getMaxHealth();
    }

    // Getters:
    public String getName() { return this.name; }
    public int getHealth() { return this.health; }
    public int getLevel() { return this.level; }
    public int getXP() { return this.xp; }
    public int getGold() { return this.gold; }

    // Setters:
    public void setName(String name) { this.name = name; }
    public void setHealth(int health) { this.health = health; }
    public void setLevel(int level) { this.level = level; }
    public void setXP(int xp) { this.xp = xp; }
    public void setGold(int gold) { this.gold = gold; }

    // Methods:
    public void  payGold(int gold) {
        this.gold -= gold;
    }
    public void gainGold(int gold) {
        this.gold += gold;
    }


}
