import heroes.*;
import heroesDetails.*;
import items.armors.Armor;
import items.armors.*;
import items.weapons.*;

public class Main {
    public static void main(String[] args) {
        SetDetails setDetails = new SetDetails();
        PrintDetails printDetails = new PrintDetails();

        Armor clothBodyArmor = new Armor("Body", new ClothArmor(), 2, "Cloth Chest Armor", "Cloth");
        Armor plateBodyArmor = new Armor("Body", new PlateArmor(), 3, "Plate Chest Armor", "Plate");
        Armor clothHelmet = new Armor("Head", new ClothArmor(), 1, "Cloth Helmet", "Cloth");
        Armor leatherPants = new Armor("Legs", new LeatherArmor(), 5, "Leather Pants", "Leather");

        Hero warrior = new Warrior();
        setDetails.setHeroesDetails(warrior, "Warrior", 150, 10, 3, 1);

        Weapon axe = new Weapon("Reaver's Axe", 2, new MeleeWeapon(), "Melee");
        Weapon crossbow = new Weapon("Houndmaster's Crossbow", 3, new RangedWeapon(), "Ranged");

        //Adds chest armor to warrior
        printDetails.printHeroesDetails(warrior);
        System.out.println("-----------------");
        System.out.println("Found " + clothBodyArmor.getName());
        printDetails.printArmorDetails(clothBodyArmor);
        warrior.addArmorPiece(clothBodyArmor);
        System.out.println("-----------------");
        System.out.println("Added " + clothBodyArmor.getName() + " to " + warrior.getName());

        //Changes chest armor to warrior
        printDetails.printHeroesDetails(warrior);
        System.out.println("-----------------");
        System.out.println("Found " + plateBodyArmor.getName());
        printDetails.printArmorDetails(plateBodyArmor);
        warrior.addArmorPiece(plateBodyArmor);
        System.out.println("-----------------");
        System.out.println("Changed " + plateBodyArmor.getName() + " to " + warrior.getName());

        //Warrior receives experience
        printDetails.printHeroesDetails(warrior);
        System.out.println("-----------------");
        System.out.println(warrior.getName() + " gains 120xp");
        warrior.gainXp(120);

        //Adds weapon to warrior
        printDetails.printHeroesDetails(warrior);
        System.out.println("-----------------");
        System.out.println("Found " + crossbow.getName());
        printDetails.printWeaponDetails(crossbow);
        warrior.addWeapon(crossbow);
        System.out.println("-----------------");
        System.out.println("Added " + crossbow.getName() + " to " + warrior.getName());

        //Attacks
        printDetails.printHeroesDetails(warrior);
        warrior.attack();

        //Changes weapon to warrior
        System.out.println("-----------------");
        System.out.println("Found " + axe.getName());
        printDetails.printWeaponDetails(axe);
        warrior.addWeapon(axe);
        System.out.println("-----------------");
        System.out.println("Changed " + axe.getName() + " to " + warrior.getName());

        //Attacks with new weapon
        printDetails.printHeroesDetails(warrior);
        warrior.attack();

        //Warrior receives more experience
        System.out.println("-----------------");
        System.out.println(warrior.getName() + " gains 500xp");
        warrior.gainXp(500);

        //Adds helmet to warrior
        printDetails.printHeroesDetails(warrior);
        System.out.println("-----------------");
        System.out.println("Found " + clothHelmet.getName());
        printDetails.printArmorDetails(clothHelmet);
        warrior.addArmorPiece(clothHelmet);
        System.out.println("-----------------");
        System.out.println("Added " + clothHelmet.getName() + " to " + warrior.getName());

        //Adds pants to warrior
        printDetails.printHeroesDetails(warrior);
        System.out.println("-----------------");
        System.out.println("Found " + leatherPants.getName());
        printDetails.printArmorDetails(leatherPants);
        warrior.addArmorPiece(leatherPants);
        System.out.println("-----------------");
        System.out.println("Added " + leatherPants.getName() + " to " + warrior.getName());
        printDetails.printHeroesDetails(warrior);
    }
}
