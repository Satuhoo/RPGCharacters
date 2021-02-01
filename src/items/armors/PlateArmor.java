package items.armors;

import java.util.HashMap;

public class PlateArmor implements ArmorType {
    @Override
    public HashMap countBonusStats(int level, String slot, int hp, int str, int dex, int intl) {
        HashMap<String, Integer> stats = new HashMap<>();

        double pieceScaling = 1;
        if (slot.equals("Head")) {
            pieceScaling = 0.8;
        } else if (slot.equals("Legs")) {
            pieceScaling = 0.6;
        }

        double health = ((hp + 30) + level * 12) / pieceScaling;
        int intHealth = (int) health;
        stats.put("hp", intHealth);

        double strength = ((str + 3) + level * 2) / pieceScaling;
        int intStrength = (int) strength;
        stats.put("str", intStrength);

        double dexterity = ((dex + 1) + level * 1) / pieceScaling;
        int intDexterity = (int) dexterity;
        stats.put("dex", intDexterity);
        stats.put("int", 0);

        return stats;
    }

    @Override
    public void setArmorPieceToSlot(HashMap itemSlots, Armor armor) {
        String slot = armor.getSlot();
        itemSlots.put(slot, armor);
    }
}
