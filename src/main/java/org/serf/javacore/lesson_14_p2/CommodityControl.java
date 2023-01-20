package org.serf.javacore.lesson_14_p2;

import java.util.*;

public class CommodityControl {

    Set<Commodity> commoditySet = new LinkedHashSet<>();
    Scanner scanner = new Scanner(System.in);

    public void addNewCommodity() {

        String name;
        int length;
        int width;
        int weight;

        System.out.println("Enter commodity name:");
        name = scanner.nextLine();
        System.out.println("Enter commodity length:");
        length = scanner.nextInt();
        System.out.println("Enter commodity width:");
        width = scanner.nextInt();
        System.out.println("Enter commodity weight:");
        weight = scanner.nextInt();

        commoditySet.add(new Commodity(name, length, width, weight));
        System.out.println("Commodity added successfully");
        for (Commodity commodity : commoditySet) {
            System.out.println(commodity + "\n");
            System.out.println(commoditySet.size());
        }
        System.out.println(commoditySet);
        System.out.println(commoditySet.size());
        System.out.println();

    }

    public void deleteCommodityByName() {

        String name;
        System.out.println("Enter commodity name to delete:");
        name = scanner.nextLine();
        Iterator<Commodity> commodityIterator = commoditySet.iterator();
        while (commodityIterator.hasNext()) {
            if (name.equals(commodityIterator.next().getName()))
                commodityIterator.remove();

        }
    }

    public void changeCommodity() {

        String name;
        int length;
        int width;
        int weight;

        System.out.println("Enter new commodity name:");
        name = scanner.nextLine();
        System.out.println("Enter new commodity length:");
        length = scanner.nextInt();
        System.out.println("Enter new commodity width:");
        width = scanner.nextInt();
        System.out.println("Enter new commodity weight:");
        weight = scanner.nextInt();

        for (Commodity commodity : commoditySet) {
            if (name.equals(commodity.getName()) & (length == commodity.getLength()) &
                    (width == commodity.getWidth()) & (weight == commodity.getWeight())) {
                commodity.setName(name);
                commodity.setLength(length);
                commodity.setWidth(width);
                commodity.setWeight(weight);
                System.out.println("You changed commodity with name " + commodity.getName());
            }
        }
    }

    public void sortByName() {
        System.out.println("Sorted by name commodities:");
        List<Commodity> commodityList = new LinkedList<>(commoditySet);
        commodityList.sort(new CommodityNameComparator());
        for (Commodity commodity : commoditySet) {
            System.out.println(commodity.toString());
        }
    }

    public void sortByLength() {
        List<Commodity> commodityList = new LinkedList<>(commoditySet);
        System.out.println("Sorted by length commodities:");
        commodityList.sort(new CommodityLengthComparator());
        for (Commodity commodity : commoditySet) {
            System.out.println(commodity);
        }
    }

    public void sortByWidth() {
        List<Commodity> commodityList = new LinkedList<>(commoditySet);
        System.out.println("Sorted by width commodities:");
        commodityList.sort(new CommodityWidthComparator());
        for (Commodity commodity : commoditySet) {
            System.out.println(commodity);
        }
    }

    public void sortByWeight() {
        List<Commodity> commodityList = new LinkedList<>(commoditySet);
        System.out.println("Sorted by weight commodities:");
        commodityList.sort(new CommodityWeightComparator());
        for (Commodity commodity : commoditySet) {
            System.out.println(commodity);
        }
    }

    public void getCommodityByIndex(){
        List<Commodity> commodityList = new LinkedList<>(commoditySet);
        int index;
        System.out.println("Please enter sequence number of commodity to search:");
        index = scanner.nextInt();
        System.out.println("You searching by number " + index + ", here is your commodity " + commodityList.get(index));
    }

}
