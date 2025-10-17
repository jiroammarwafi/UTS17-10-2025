package UTS;

public class JumpingZombie extends Zombie {
    
    public JumpingZombie(int health, int level) {
        super(health, level);
    }
    
    @Override
    public void heal() {
        double healPercentage;
        switch (this.level) {
            case 1:
                healPercentage = 0.30;
                break;
            case 2:
                healPercentage = 0.40;
                break;
            case 3:
                healPercentage = 0.50;
                break;
            default:
                healPercentage = 0;
        }
        this.health += (int) (this.health * healPercentage);
    }

    @Override
    public void destroyed() {
        if (this.health > 0) {
            this.health -= (int) (this.health * 0.10);
        }
        if (this.health <= 0) {
            this.health = 0;
            System.out.println("Jumping Zombie Kalah!");
        }
    }
    
    @Override
    public String getZombieInfo() {
        return "Jumping " + super.getZombieInfo();
    }
}