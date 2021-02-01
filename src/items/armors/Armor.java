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
        this.health = (int) countArmorStats().get("hp");
        this.strength = (int) countArmorStats().get("str");
        this.dexterity = (int) countArmorStats().get("dex");
        this.intelligence = (int) countArmorStats().get("int");
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

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public HashMap countArmorStats() {
        return armorType.countBonusStats(this.getLevel(), this.getSlot(), this.getHealth(), this.getStrength(), this.getDexterity(), this.getIntelligence());
    }

    public void setArmorPieceToSlot(HashMap itemSlots, Armor armor) {
        armorType.setArmorPieceToSlot(itemSlots, armor);
    }
}
