package org.serf.javacore.lesson_13;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        VerkhovnaRada verkhovnaRada = VerkhovnaRada.getInstance();

        while (true) {

            Scanner scanner = new Scanner(System.in);

            programMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    verkhovnaRada.addFaction();
                    break;
                case 2:
                    verkhovnaRada.deleteFaction();
                    break;
                case 3:
                    verkhovnaRada.showAllFactions();
                    break;
                case 4:
                    verkhovnaRada.clearFactionByName();
                    break;
                case 5:
                    verkhovnaRada.showSingleFaction();
                    break;
                case 6:
                    verkhovnaRada.addDeputyToFaction();
                    break;
                case 7:
                    verkhovnaRada.deleteDeputyInFaction();
                    break;
                case 8:
                    verkhovnaRada.showBribeTakersInFaction();
                    break;
                case 9:
                    verkhovnaRada.showMostCorruptedDeputy();
                    break;
                case 10:
                    verkhovnaRada.showFactionsList();
                    break;
                default:
                    System.out.println("No such option in menu. Please choose correct one and try again");
            }
        }
    }

    public static void programMenu() {
        System.out.println("1. Add faction");
        System.out.println("2. Delete faction by name");
        System.out.println("3. Show all factions");
        System.out.println("4. Clear faction by name");
        System.out.println("5. Show faction by name");
        System.out.println("6. Add deputy to faction");
        System.out.println("7. Delete deputy from faction");
        System.out.println("8. Show all corrupted deputies from faction");
        System.out.println("9. Show the most corrupted deputy in faction");
        System.out.println("10. Show all deputies in faction");
        System.out.println();
        System.out.println("Enter one of above:");
    }
}
