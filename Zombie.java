package UTS;

public class Zombie extends Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {}
    
    public String getZombieInfo() {
        String info = "Zombie Data =" +
                      "\nHealth = " + this.health +
                      "\nLevel = " + this.level +
                      "\n";
        return info;
    }
}