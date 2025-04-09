public class Wizard extends Player {
    private int spell;

    public Wizard(int health, int strength, int lives, int originalHealth, int spell) {
        super(health, strength, lives, originalHealth);
        this.spell = spell;
    }

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

    public  Elf converToElf(){
        return new Elf(this.getHealth(),this.getStrength(),this.getLives(),
                this.getOriginalHealth(),this.getSpell());
    }


    @Override
    public String getRandomSpell() {
        return "Casting " + SpellLibrary.getRandomSpell();
    }
}
