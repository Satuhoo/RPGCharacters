package heroes;

public class Mage extends Hero{

    @Override
    public void levelUp() {
        this.setHealth(this.getHealth() + 15);
        this.setStrength(this.getStrength() + 1);
        this.setDexterity(this.getDexterity() + 2);
        this.setIntelligence(this.getIntelligence() + 5);
        this.setLevel(this.getLevel() + 1);
    }
}
