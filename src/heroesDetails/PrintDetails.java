package heroesDetails;

import heroes.Hero;

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

}
