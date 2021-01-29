package heroesDetails;

import heroes.Hero;
import items.armors.Armor;

public class SetDetails {
    public void setHeroesDetails(Hero hero, String name, int hp, int str, int dex, int intelligence){
        hero.setName(name);
        hero.setHealth(hp);
        hero.setStrength(str);
        hero.setDexterity(dex);
        hero.setIntelligence(intelligence);
        hero.setLevel(1);
        hero.setXpToNextLevel(100);
        hero.setItemSlots();
    }

    public void setBonusStats(Armor armor, int hp, int str, int dex, int intelligence) {
        armor.setHealth(hp);
        armor.setStrength(str);
        armor.setIntelligence(intelligence);
        armor.setDexterity(dex);

    }
}
