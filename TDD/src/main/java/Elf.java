public class Elf extends Player{
    private int speed;

    public Elf(int health, int strength, int lives, int originalHealth, int speed) {
        super(health, strength, lives, originalHealth);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
