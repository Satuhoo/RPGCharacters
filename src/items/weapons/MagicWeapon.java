package items.weapons;

public class MagicWeapon implements WeaponType {
    @Override
    public int countBaseDamage(int level) {
        int baseDamage = 25 + 2 * level;
        return baseDamage;
    }
}
