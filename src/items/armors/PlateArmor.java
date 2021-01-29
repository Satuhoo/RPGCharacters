package items.armors;

import heroesDetails.SetDetails;

import java.util.HashMap;

public class PlateArmor implements ArmorType {
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

        double health = ((armor.getHealth() + 30) + levelScaling * 12) / pieceScaling;
        int intHealth = (int) health;

        double strength = ((armor.getStrength() + 3 )+ levelScaling * 2) / pieceScaling;
        int intStrength = (int) strength;

        double dexterity = ((armor.getDexterity() + 1) + levelScaling * 1) / pieceScaling;
        int intDexterity = (int) dexterity;

        itemSlots.put(slot, armor);
        setDetails.setBonusStats(armor, intHealth, intStrength, intDexterity, 0);
    }
}
