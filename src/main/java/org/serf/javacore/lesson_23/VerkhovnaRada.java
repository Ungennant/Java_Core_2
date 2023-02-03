package org.serf.javacore.lesson_23;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class VerkhovnaRada {

    private static VerkhovnaRada verkhovnaRada;
    private List<Faction> factionList = new LinkedList<>();

    private VerkhovnaRada() {

    }

    public static VerkhovnaRada getInstance() {
        if (verkhovnaRada == null) {
            verkhovnaRada = new VerkhovnaRada();
            return new VerkhovnaRada();
        } else
            return verkhovnaRada;
    }

    public void addFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to add:");
        String factionName = scanner.nextLine();
        factionList.add(new Faction(factionName));
    }

    public void deleteFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to delete:");
        String facNameToDelete = scanner.nextLine();
        Faction factionToDelete = factionList.stream().filter(element -> element.getFactionName().equals(facNameToDelete)).findFirst().get();
        factionList.remove(factionToDelete);
    }

    public void showAllFactions() {
        factionList.forEach(System.out::println);
    }

    public void showSingleFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to show:");
        String facNameToShow = scanner.nextLine();
        Faction factionToShow = factionList.stream().filter(element -> element.getFactionName().equals(facNameToShow)).findFirst().get();
        System.out.println(factionToShow);


    }

    public void addDeputyToFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to add deputy:");
        String facNameToAdd = scanner.nextLine();
        Faction factionToAdd = factionList.stream().filter(element -> element.getFactionName().equals(facNameToAdd)).findFirst().get();
        factionToAdd.addToFaction();
    }

    public void deleteDeputyInFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to delete deputy:");
        String facNameToDelete = scanner.nextLine();
        Faction factionToDelete = factionList.stream().filter(element -> element.getFactionName().equals(facNameToDelete)).findFirst().get();
        factionToDelete.deleteDeputy();

    }

    public void showBribeTakersInFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to show corrupted deputies:");
        String facNameToShowBribeTakers = scanner.nextLine();
        Faction factionToShowBribeTakers = factionList.stream().filter(element -> element.getFactionName().equals(facNameToShowBribeTakers)).findFirst().get();
        factionToShowBribeTakers.showBribeTakers();
    }

    public void showMostCorruptedDeputy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to show corrupted deputies:");
        String facNameToShowMostCorrupt = scanner.nextLine();
        Faction factionToShowMostCorrupt = factionList.stream().filter(element -> element.getFactionName().equals(facNameToShowMostCorrupt)).findFirst().get();
        factionToShowMostCorrupt.showMaxBribeTaker();
    }

    public void clearFactionByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to delete all deputies:");
        String facNameToClear = scanner.nextLine();
        Faction factionToClear = factionList.stream().filter(element -> element.getFactionName().equals(facNameToClear)).findFirst().get();
        factionToClear.deleteAllFractionMembers();
    }

    public void showFactionsList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to show all deputies:");
        String facNameToShowAll = scanner.nextLine();
        Faction factionToCShowAll = factionList.stream().filter(element -> element.getFactionName().equals(facNameToShowAll)).findFirst().get();
        factionToCShowAll.showAllDeputiesInFaction();
    }
}

