package org.serf.javacore.lesson_08;

import java.util.Scanner;

public class ConsoleMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Month[] months = Month.values();
        Season[] seasons = Season.values();

        System.out.println("1. Check whether there is such a month (we enter the month from the console, make sure that the register");
        System.out.println("2. Display all months with the same season");
        System.out.println("3. Display all months that have the same number of days");
        System.out.println("4. Display all months with fewer days on the screen");
        System.out.println("5. Display all months with more days on the screen");
        System.out.println("6. Bring the next season to the screen");
        System.out.println("7. Display the previous season on the screen");
        System.out.println("8. Display all months with an even number of days on the screen");
        System.out.println("9. Display all months with an odd number of days on the screen");
        System.out.println("10. Display whether the month entered from the console has an even number of days");
        System.out.println("________________________________");
        System.out.println("Enter your choice from 1 to 10: ");
        System.out.println();

        int choice = 0;
        choice = scanner.nextInt();

        switch (choice) {
            case (1):
                int count = 0;
                System.out.println("Enter mount to search: ");
                String monthToSearch = scanner1.nextLine().toUpperCase();
                System.out.println("You choose: " + monthToSearch);

                for (int i = 0; i < months.length; i++) {
                    if (months[i].toString().equals(monthToSearch))
                        count++;
                }
                if (count > 0) {
                    System.out.println("Month exist.");
                } else {
                    System.out.println("Wrong input! Month doesnt exist.");
                }
                break;
            case (2):
                System.out.println("Enter season: ");
                String seasonToSearch = scanner1.nextLine();
                System.out.println("You choose: " + seasonToSearch);
                for (Month month : months) {
                    if (month.getSeason().name().equalsIgnoreCase(seasonToSearch)) {
                        System.out.println(month);
                    }
                }
                break;
            case (3):
                System.out.println("Enter month: ");
                String monthToSearch2 = scanner1.nextLine().toUpperCase();
                Month month2;
                month2 = Month.valueOf(monthToSearch2);
                for (int i = 0; i < months.length; i++) {
                    if (months[i].getDays() == month2.getDays()) {
                        System.out.println(months[i]);
                    }
                }
                break;
            case (4):
                System.out.println("Enter month: ");
                String monthToSearch3 = scanner1.nextLine().toUpperCase();
                Month month3;
                month2 = Month.valueOf(monthToSearch3);
                for (int i = 0; i < months.length; i++) {
                    if (months[i].getDays() < month2.getDays()) {
                        System.out.println(months[i]);
                    }
                }
                break;
            case (5):
                System.out.println("Enter month: ");
                String monthToSearch4 = scanner1.nextLine().toUpperCase();
                Month month4;
                month4 = Month.valueOf(monthToSearch4);
                for (int i = 0; i < months.length; i++) {
                    if (months[i].getDays() < month4.getDays()) {
                        System.out.println(months[i]);
                    }
                }
                break;
            case (6):
                System.out.println("Enter season: ");
                String seasonToSearch3 = scanner1.nextLine().toUpperCase();
                System.out.println("You choose: " + seasonToSearch3);
                for (int i = 0; i < seasons.length; i++) {
                    if (seasons[i].toString().equals(seasonToSearch3)) {
                        if (i == (seasons.length - 1)) {
                            System.out.println(seasons[0]);
                        } else {
                            System.out.println(seasons[i + 1]);
                        }
                    }
                }
                break;
            case (7):
                System.out.println("Enter season: ");
                String seasonToSearch4 = scanner1.nextLine().toUpperCase();
                System.out.println("You choose: " + seasonToSearch4);
                for (int i = 0; i < seasons.length; i++) {
                    if (seasons[i].toString().equals(seasonToSearch4)) {
                        if (i == 0) {
                            System.out.println(seasons[3]);
                        } else {
                            System.out.println(seasons[i - 1]);
                        }
                    }
                }
                break;
            case (8):
                for (Month month : months) {
                    if (month.getDays() % 2 == 0) {
                        System.out.println(month);
                    }
                }
                break;
            case (9):
                for (Month month : months) {
                    if (month.getDays() % 2 != 0) {
                        System.out.println(month);
                    }
                }
            case (10):
                System.out.println("Enter month: ");
                String monthToSearch5 = scanner1.nextLine().toUpperCase();
                Month month5;
                month5 = Month.valueOf(monthToSearch5);
                if (month5.getDays() % 2 == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                break;
            default:
                System.out.println("Wrong menu input.");
        }
        scanner.close();
        scanner1.close();
    }
}

