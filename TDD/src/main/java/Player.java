abstract class Player {
    private int health;
    private int strength;
    private int lives;
    private final int originalHealth;

    public Player(int health, int strength, int lives, int originalHealth) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
        this.originalHealth = health;
    }



    public int getOriginalHealth() {
        return originalHealth;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }


    public void decrementLive() {
        // sub lives by 1
        this.setLives(this.getLives() - 1);
        // restored health
        setHealth(originalHealth);
        // print isdead?
        if (this.lives<=0){
            System.out.println("This character is dead");
        }
    }
    public void attack(Player playerToAttack){
        playerToAttack.setHealth(playerToAttack.getHealth()-this.getStrength());
    }

    public void checkHealth(){
        if (this.getHealth()<=0){
            decrementLive();
        }

    }






}
