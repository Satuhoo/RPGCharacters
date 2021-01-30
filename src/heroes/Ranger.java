package heroes;

public class Ranger extends Hero{

    @Override
    public void upgradeStats() {
        this.setHealth(this.getHealth() + 20);
        this.setStrength(this.getStrength() + 2);
        this.setDexterity(this.getDexterity() + 5);
        this.setIntelligence(this.getIntelligence() + 1);
        this.setLevel(this.getLevel() + 1);
        System.out.println("\n*************");
        System.out.println("* LEVEL UP! *");
        System.out.println("*************\n");
    }
}
