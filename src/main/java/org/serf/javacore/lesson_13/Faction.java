package org.serf.javacore.lesson_13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

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
        String deputyToDelete = scanner.nextLine();
        Iterator<Deputy> deputyIterator = deputyList.iterator();
        while (deputyIterator.hasNext()){
            if(deputyToDelete.equals(deputyIterator.next().getSurname()))
                deputyIterator.remove();
        }

    }

    public void showBribeTakers(){
        for (Deputy deputy : deputyList) {
            if(deputy.isBribeTaker())
                System.out.println(deputy);
        }
    }

    public void showMaxBribeTaker(){
        Iterator<Deputy> iterator = deputyList.iterator();
        double maxBribe = 0;
        while (iterator.hasNext()){
            Deputy deputy = iterator.next();
            if (deputy.getBribeTotal() > maxBribe)
                maxBribe = deputy.getBribeTotal();
            System.out.println("The most corrupt deputy is:" + deputy.getBribeTotal());
        }
    }

    public void showAllDeputiesInFaction(){
        for (Deputy deputy : deputyList) {
            System.out.println(deputy);
        }
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
