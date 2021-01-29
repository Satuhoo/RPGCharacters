package heroes;


import items.armors.Armor;
import items.weapons.Weapon;

import java.util.HashMap;

public abstract class Hero {
    public String name;
    public int health;
    public int strength;
    public int dexterity;
    public int intelligence;
    public int level;
    public int xpToNextLevel;
    public Weapon weapon;
    HashMap<String, Armor> itemSlots = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXpToNextLevel() {
        return xpToNextLevel;
    }

    public void setXpToNextLevel(int xpToNextLevel) {
        this.xpToNextLevel = xpToNextLevel;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public HashMap<String, Armor> getItemSlots() {
        return itemSlots;
    }

    public abstract void levelUp();

    public void gainXp(int xp){
        int xpToLevelUp = this.getXpToNextLevel() - xp; //Counts the difference after gained xp
        if (xpToLevelUp < 1){ //If the difference is 0 or less, calls 'level up' method
            this.levelUp();
            double newValue = this.getXpToNextLevel() * 1.10; //Counts the required amount of experience for next level up
            int intValue = (int) newValue;
            //Sets the new amount for variable. If user got more experience than level up requires,
            // counts it off from xpToNextLevel value
            this.setXpToNextLevel(intValue + xpToLevelUp);
        } else {
            //If gained experience is less than next level up requires, subtracts remainder from xpToNextLevel value
            this.setXpToNextLevel(this.getXpToNextLevel() - xpToLevelUp);
        }
    }

    public void setItemSlots() { //Sets empty slots where user can add items
        itemSlots.put("Body", null);
        itemSlots.put("Head", null);
        itemSlots.put("Legs", null);
    }

    public void addArmorPiece(Armor armor) {
        String slot = armor.getSlot();
        if (itemSlots.get(slot) != null) { //Checks if there is already armor piece in the same slot
            removeArmor(slot); //If yes, calls the method which removes old stats
        }
        armor.setArmorPieceToSlot(itemSlots, armor);
        updateStats(armor);
    }

    public void removeArmor(String slot){
        Armor oldArmor = itemSlots.get(slot); //Searches the old armor piece from the list
        //Removes the old armor stats from hero's stats
        this.setHealth(this.getHealth() - oldArmor.getHealth());
        this.setStrength(this.getStrength() - oldArmor.getStrength());
        this.setDexterity(this.getDexterity() - oldArmor.getDexterity());
        this.setIntelligence(this.getIntelligence() - oldArmor.getIntelligence());
    }

    public void updateStats(Armor armor){
        //Adds the armor stats for hero's stats
        this.setHealth(this.getHealth() + armor.getHealth());
        this.setStrength(this.getStrength() + armor.getStrength());
        this.setDexterity(this.getDexterity() + armor.getDexterity());
        this.setIntelligence(this.getIntelligence() + armor.getIntelligence());
    }

    public void addWeapon(Weapon weapon) {
        this.setWeapon(weapon);
    }

    public void attack() {
        System.out.println("-----------------");
        try {
            if (this.getWeapon().getType().equals("Melee")) {
                double damage = this.getWeapon().getBaseDamage() + 1.5 * this.getStrength();
                int intDamage = (int) damage;
                System.out.println("Attacking for " + intDamage);
            } else if (this.getWeapon().getType().equals("Ranged")) {
                double damage = this.getWeapon().getBaseDamage() + 2 * this.getDexterity();
                System.out.println("Attacking for " + damage);
            } else if (this.getWeapon().getType().equals("Magic")) {
                double damage = this.getWeapon().getBaseDamage() + 3 * this.getIntelligence();
                System.out.println("Attacking for " + damage);
            }
        } catch (NullPointerException ex) {
            System.out.println("No damage dealt");
        }
    }
}
