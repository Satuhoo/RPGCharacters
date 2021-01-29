package items.armors;

import heroesDetails.SetDetails;

import java.util.HashMap;

public class LeatherArmor implements ArmorType {
    SetDetails setDetails = new SetDetails();

    @Override
    public void countBonusStats(HashMap itemSlots, Armor armor) {
        int levelScaling = armor.getLevel() - 1;
        String slot = armor.getSlot();
        double pieceScaling = 1;
        if (slot.equals("Head")) {
            pieceScaling = 0.8;
        } else if (slot.equals("Legs")) {
            pieceScaling = 0.6;
        }

        double health = ((armor.getHealth() + 20) + levelScaling * 8) / pieceScaling;
        int intHealth = (int) health;

        double dexterity = ((armor.getDexterity() + 3) + levelScaling * 2) / pieceScaling;
        int intDexterity = (int) dexterity;

        double strength = ((armor.getStrength() + 1) + levelScaling * 1) / pieceScaling;
        int intStrength = (int) strength;

        itemSlots.put(slot, armor);
        setDetails.setBonusStats(armor, intHealth, intStrength, intDexterity, 0);
    }
}
