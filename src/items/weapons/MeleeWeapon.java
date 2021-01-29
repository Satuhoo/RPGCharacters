package items.weapons;

public class MeleeWeapon implements WeaponType{
    @Override
    public int countBaseDamage(int level) {
        int baseDamage = 15 + 2 * level;
        return baseDamage;
    }
}
