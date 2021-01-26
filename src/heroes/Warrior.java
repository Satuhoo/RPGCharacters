package heroes;

public class Warrior extends Hero{

    @Override
    public void levelUp() {
        this.setHealth(this.getHealth() + 30);
        this.setStrength(this.getStrength() + 5);
        this.setDexterity(this.getDexterity() + 2);
        this.setIntelligence(this.getIntelligence() + 1);
        this.setLevel(this.getLevel() + 1);
    }
}
