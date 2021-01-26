import heroes.Warrior;
import heroesDetails.PrintDetails;
import heroesDetails.SetDetails;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        SetDetails setDetails = new SetDetails();
        PrintDetails printDetails = new PrintDetails();

        setDetails.setHeroesDetails(warrior, "Warrior", 150, 10, 3, 1);
        printDetails.printHeroesDetails(warrior);
        warrior.gainXp(100);
        printDetails.printHeroesDetails(warrior);
        warrior.gainXp(120);
        printDetails.printHeroesDetails(warrior);

    }
}
