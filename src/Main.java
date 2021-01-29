import heroes.*;
import heroesDetails.*;
import items.armors.Armor;
import items.armors.*;
import items.weapons.*;

public class Main {
    public static void main(String[] args) {
        SetDetails setDetails = new SetDetails();
        PrintDetails printDetails = new PrintDetails();

        Armor armor = new Armor("Body", new ClothArmor(), 2, "Cloth Armor 1", "Cloth");
        Armor armor2 = new Armor("Body", new LeatherArmor(), 3, "Leather armor 1", "Leather");
        Armor armor3 = new Armor("Head", new ClothArmor(), 1, "Cloth armor 2", "Cloth");

        Hero warrior = new Warrior();
        setDetails.setHeroesDetails(warrior, "Warrior", 150, 10, 3, 1);

        Weapon weapon = new Weapon( "Axe", 2, new MeleeWeapon(), "Melee");
        Weapon weapon1 = new Weapon("Long bow", 3, new RangedWeapon(), "Ranged");
        printDetails.printWeaponDetails(weapon);
        printDetails.printWeaponDetails(weapon1);

        printDetails.printHeroesDetails(warrior);
        warrior.addArmorPiece(armor);
        warrior.attack();
        warrior.addWeapon(weapon);
        printDetails.printWeaponDetails(weapon);
        warrior.attack();
        printDetails.printArmorDetails(armor);
        printDetails.printHeroesDetails(warrior);

        printDetails.printHeroesDetails(warrior);
        warrior.addArmorPiece(armor2);
        printDetails.printArmorDetails(armor2);
        printDetails.printHeroesDetails(warrior);

        printDetails.printHeroesDetails(warrior);
        warrior.addArmorPiece(armor3);
        printDetails.printArmorDetails(armor3);
        printDetails.printHeroesDetails(warrior);

        printDetails.printHeroesDetails(warrior);
        warrior.gainXp(100);
        printDetails.printHeroesDetails(warrior);
        warrior.attack();
        printDetails.printHeroesDetails(warrior);

        warrior.gainXp(130);
        printDetails.printHeroesDetails(warrior);
    }
}
