package heroesDetails;

import heroes.Hero;
import items.armors.Armor;

public class PrintDetails {
    public void printHeroesDetails(Hero hero){
        System.out.println(hero.getName() + " details: ");
        System.out.println("HP: " + hero.getHealth());
        System.out.println("Str: " + hero.getStrength());
        System.out.println("Dex: " + hero.getDexterity());
        System.out.println("Int: " + hero.getIntelligence());
        System.out.println("Lvl: " + hero.getLevel());
        System.out.println("XP to next: " + hero.getXpToNextLevel());
    }

    public void printArmorDetails(Armor armor) {
        System.out.println("Item stats for: " + armor.getName());
        System.out.println("Armor type: " + armor.getType());
        System.out.println("Slot: " + armor.getSlot());
        System.out.println("Armor level: " + armor.getLevel());
        System.out.println("Bonus HP: " + armor.getHealth());
        if (armor.getStrength() != 0) {
            System.out.println("Bonus Str: " + armor.getStrength());
        }
        if (armor.getDexterity() != 0) {
            System.out.println("Bonus Dex: " + armor.getDexterity());
        }
        if (armor.getIntelligence() != 0) {
            System.out.println("Bonus Int: " + armor.getIntelligence());
        }
    }

}
