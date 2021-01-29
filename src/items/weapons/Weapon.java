package items.weapons;

public class Weapon {
    public String name;
    public int baseDamage;
    public int level;
    public WeaponType weaponType;
    public String type;

    public Weapon(String name, int level, WeaponType weaponType, String type) {
        this.name = name;
        this.level = level;
        this.weaponType = weaponType;
        this.type = type;
        this.baseDamage = countBaseDamage();
    }

    public String getName() {
        return name;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public int getLevel() {
        return level;
    }

    public String getType() {
        return type;
    }

    public int countBaseDamage() {
        return weaponType.countBaseDamage(this.getLevel());
    }
}
