package items.armors;

import java.util.HashMap;

public class ClothArmor implements ArmorType {

    @Override
    public HashMap countBonusStats(int level, String slot, int hp, int str, int dex, int intl) {
        HashMap<String, Integer> stats = new HashMap<>();

        //Checks the slot where armor piece is equipped and defines scaling value
        double pieceScaling = 1;
        if (slot.equals("Head")) {
            pieceScaling = 0.8;
        } else if (slot.equals("Legs")) {
            pieceScaling = 0.6;
        }

        //Counts the bonus stats for armor piece, adds them to hashmap and
        // scales stats based on slot where armor piece is equipped
        double health = ((hp + 10) + level * 5) / pieceScaling;
        int intHealth = (int) health;
        stats.put("hp", intHealth);

        double intelligence = ((intl + 3) + level * 2) / pieceScaling;
        int intIntelligence = (int) intelligence;
        stats.put("int", intIntelligence);

        double dexterity = ((dex + 1) + level * 1) / pieceScaling;
        int intDexterity = (int) dexterity;
        stats.put("dex", intDexterity);
        stats.put("str", 0);
        return stats;
    }


    @Override
    public void setArmorPieceToSlot(HashMap itemSlots, Armor armor) {
        String slot = armor.getSlot();
        itemSlots.put(slot, armor);
    }
}
