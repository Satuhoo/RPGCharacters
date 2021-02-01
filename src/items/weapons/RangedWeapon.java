package items.weapons;

public class RangedWeapon implements WeaponType {
    @Override
    public int countBaseDamage(int level) {
        int baseDamage = 5 + 3 * level;
        return baseDamage;
    }
}
