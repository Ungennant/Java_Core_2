package org.serf.javacore.lesson_14_p2;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {



        while (true) {

            programMenu();

            Scanner scanner = new Scanner(System.in);

            CommodityControl commodityControl = new CommodityControl();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    commodityControl.addNewCommodity();
                    break;
                case 2:
                    commodityControl.deleteCommodityByName();
                    break;
                case 3:
                    commodityControl.changeCommodity();
                    break;
                case 4:
                    commodityControl.sortByName();
                    break;
                case 5:
                    commodityControl.sortByLength();
                    break;
                case 6:
                    commodityControl.sortByWidth();
                    break;
                case 7:
                    commodityControl.sortByWeight();
                    break;
                case 8:
                    commodityControl.getCommodityByIndex();
                    break;
                case 9:
                    System.exit(0);
            }
        }
    }

    public static void programMenu() {
        System.out.println("1. Add commodity");
        System.out.println("2. Delete commodity by name");
        System.out.println("3. Change commodity");
        System.out.println("4. Sort commodities by name");
        System.out.println("5. Sort commodities by length");
        System.out.println("6. Sort commodities by width");
        System.out.println("7. Sort commodities by weight");
        System.out.println("8. Find commodity by sequence number");
        System.out.println("9. Exit");
        System.out.println();
        System.out.println("Enter one of above:");
    }
}
