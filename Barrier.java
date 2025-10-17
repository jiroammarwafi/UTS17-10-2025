package UTS;

public class Barrier extends Destroyable {
    private int strength;
    
    public Barrier(int strength) {
        this.strength = strength;
    }
    
    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    public int getStrength() {
        return this.strength;
    }
    
    @Override
    public void destroyed() {
        if (this.strength > 0) {
            this.strength -= 9;
        }
        if (this.strength <= 0) {
            this.strength = 0;
            System.out.println("Barrier Kalah!");
        }
    }
    
    public String getBarrierInfo() {
        return "\nBarrier Strength = " + this.strength;
    }
}