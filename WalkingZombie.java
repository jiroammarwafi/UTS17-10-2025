package UTS;

public class WalkingZombie extends Zombie {
    
    public WalkingZombie(int health, int level) {
        super(health, level);
    }
    
    @Override
    public void heal() {
        double healPercentage;
        switch (this.level) {
            case 1:
                healPercentage = 0.20;
                break;
            case 2:
                healPercentage = 0.30;
                break;
            case 3:
                healPercentage = 0.40;
                break;
            default:
                healPercentage = 0;
        }
        this.health += (int) (this.health * healPercentage);
    }

    @Override
    public void destroyed() {
        if (this.health > 0) {
            this.health -= (int) (this.health * 0.20);
        }
        if (this.health <= 0) {
            this.health = 0;
            System.out.println("Walking Zombie Kalah!");
        }
    }
    
    @Override
    public String getZombieInfo() {
        return "Walking " + super.getZombieInfo();
    }
}