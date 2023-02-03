package org.serf.javacore.lesson_23;

import java.util.*;
import java.util.stream.Collectors;

public class Faction {

    private String factionName;
    private List<Deputy> deputyList = new ArrayList<>();

    public Faction() {
    }

    public Faction(String factionName) {
        this.factionName = factionName;
    }

    public void addToFaction() {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
        String name;
        String surname;
        int age;
        boolean bribeTaker;
        System.out.println("Enter weight:");
        weight = scanner.nextDouble();
        System.out.println("Enter height:");
        height = scanner.nextDouble();
        System.out.println("Enter name:");
        name = scanner.next();
        System.out.println("Enter surname:");
        surname = scanner.next();
        System.out.println("Enter age:");
        age = scanner.nextInt();
        System.out.println("Is bribe taker?");
        bribeTaker = scanner.nextBoolean();

        deputyList.add(new Deputy(weight, height, name, surname,age,bribeTaker));

    }

    public void deleteDeputy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter deputy surname to delete:");
        String depNameToDelete = scanner.nextLine();
        Deputy deputyToDelete = deputyList.stream().filter(element -> element.getName().equals(depNameToDelete)).findFirst().get();
        deputyList.remove(deputyToDelete);
    }

    public void showBribeTakers(){
        List<Deputy> bribeTakers = deputyList.stream().filter(Deputy::isBribeTaker).collect(Collectors.toList());
        bribeTakers.forEach(System.out::println);
    }

    public void showMaxBribeTaker(){
        Deputy maxBribeTaker = deputyList.stream().filter(Deputy::isBribeTaker).max(Comparator.comparing(Deputy::getBribeTotal)).orElseThrow(NoSuchElementException::new);
        System.out.println(maxBribeTaker);
    }

    public void showAllDeputiesInFaction(){
        deputyList.forEach(System.out::println);
    }

    public void deleteAllFractionMembers(){
        deputyList.clear();
    }

    public String getFactionName() {
        return factionName;
    }

    public void setFactionName(String factionName) {
        this.factionName = factionName;
    }

    @Override
    public String toString() {
        return "Faction{" +
                "factionName='" + factionName + '\'' +
                '}';
    }
}
