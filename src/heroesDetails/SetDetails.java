package heroesDetails;

import heroes.Hero;

public class SetDetails {
    public void setHeroesDetails(Hero hero, String name, int hp, int str, int dex, int intelligence){
        hero.setName(name);
        hero.setHealth(hp);
        hero.setStrength(str);
        hero.setDexterity(dex);
        hero.setIntelligence(intelligence);
        hero.setLevel(1);
        hero.setXpToNextLevel(100);
    }
}
