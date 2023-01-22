package org.serf.javacore.lesson_15;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();

        while (true) {

            Scanner scanner = new Scanner(System.in);
            int choice;

            showMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    zooClub.addClubMember();
                    break;
                case 2:
                    zooClub.addPet();
                    break;
                case 3:
                    zooClub.removePet();
                    break;
                case 4:
                    zooClub.removePerson();
                    break;
                case 5:
                    zooClub.removePetByType();
                    break;
                case 6:
                    zooClub.showZooClubInfo();
                    break;
                case 7:
                    System.out.println("Program closing...");
                    System.exit(0);
                default:
                    System.out.println("Wrong input.");
                    break;
            }
        }
    }

    public static void showMenu() {
        System.out.println("1. Add ZooClub member");
        System.out.println("2. Add pet to member");
        System.out.println("3. Remove pet from member");
        System.out.println("4. Remover club member");
        System.out.println("5. Remove pet from members by type");
        System.out.println("6. Show ZooClub info");
        System.out.println("7. Exit");
        System.out.println("___________________");
        System.out.println("Choose one of above");
        System.out.println();
    }
}
