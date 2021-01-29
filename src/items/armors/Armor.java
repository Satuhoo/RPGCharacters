package items.armors;

import java.util.HashMap;

public class Armor {
    public ArmorType armorType;
    public String type;
    public String name;
    public String slot;
    public int health;
    public int strength;
    public int dexterity;
    public int intelligence;
    public int level;

    public Armor(String slot, ArmorType armorType, int level, String name, String type) {
        this.slot = slot;
        this.armorType = armorType;
        this.level = level;
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getSlot() {
        return slot;
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

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setArmorPieceToSlot(HashMap itemSlots, Armor armor){
        armorType.countBonusStats(itemSlots, armor);
    }
}
