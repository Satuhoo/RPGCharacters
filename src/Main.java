import heroes.*;
import heroesDetails.*;
import items.armors.Armor;
import items.armors.*;

public class Main {
    public static void main(String[] args) {
        SetDetails setDetails = new SetDetails();
        PrintDetails printDetails = new PrintDetails();

        Armor armor = new Armor("Body", new ClothArmor(), 2, "Cloth Armor 1", "Cloth");
        Armor armor2 = new Armor("Body", new LeatherArmor(), 3, "Leather armor 1", "Leather");
        Armor armor3 = new Armor("Head", new ClothArmor(), 1, "Cloth armor 2", "Cloth");

        Hero warrior = new Warrior();
        setDetails.setHeroesDetails(warrior, "Warrior", 150, 10, 3, 1);

        printDetails.printHeroesDetails(warrior);
        warrior.addItem(armor);
        printDetails.printArmorDetails(armor);
        printDetails.printHeroesDetails(warrior);
        System.out.println("");

        printDetails.printHeroesDetails(warrior);
        warrior.addItem(armor2);
        printDetails.printArmorDetails(armor2);
        printDetails.printHeroesDetails(warrior);
        System.out.println("");

        printDetails.printHeroesDetails(warrior);
        warrior.addItem(armor3);
        printDetails.printArmorDetails(armor3);
        printDetails.printHeroesDetails(warrior);
        System.out.println("");

        printDetails.printHeroesDetails(warrior);
        warrior.gainXp(100);
        printDetails.printHeroesDetails(warrior);
        System.out.println("");

        warrior.gainXp(130);
        printDetails.printHeroesDetails(warrior);
    }
}
