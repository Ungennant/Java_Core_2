package org.serf.javacore.lesson_13;

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
        String factionToDelete = scanner.nextLine();
        Iterator<Faction> factionIterator = factionList.iterator();
        while (factionIterator.hasNext()) {
            if (factionToDelete.equals(factionIterator.next().getFactionName()))
                factionIterator.remove();
        }

    }

    public void showAllFactions() {
        for (Faction faction : factionList) {
            System.out.println(faction);
        }
    }

    public void showSingleFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to show:");
        String factionToShow = scanner.nextLine();
        Iterator<Faction> factionIterator = factionList.iterator();
        while (factionIterator.hasNext()) {
            if (factionToShow.equals(factionIterator.next().getFactionName()))
                System.out.println(factionIterator.next());
        }

    }

    public void addDeputyToFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to add deputy:");
        String factionToAdd = scanner.nextLine();
        Iterator<Faction> factionIterator = factionList.iterator();
        while (factionIterator.hasNext()) {
            Faction faction = factionIterator.next();
            if (faction.getFactionName().equals(factionToAdd)) {
                faction.addToFaction();
            }
        }
    }

    public void deleteDeputyInFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to delete deputy:");
        String factionToDelete = scanner.nextLine();
        Iterator<Faction> factionIterator = factionList.iterator();
        while (factionIterator.hasNext()) {
            Faction faction = factionIterator.next();
            if (faction.getFactionName().equals(factionToDelete)) {
                faction.deleteDeputy();
            }
        }
    }

    public void showBribeTakersInFaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to show corrupted deputies:");
        String factionToShow = scanner.nextLine();
        Iterator<Faction> factionIterator = factionList.iterator();
        while (factionIterator.hasNext()) {
            Faction faction = factionIterator.next();
            if (faction.getFactionName().equals(factionToShow)) {
                faction.showBribeTakers();
            }
        }
    }

    public void showMostCorruptedDeputy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to show corrupted deputies:");
        String factionToShow = scanner.nextLine();
        Iterator<Faction> factionIterator = factionList.iterator();
        while (factionIterator.hasNext()) {
            Faction faction = factionIterator.next();
            if (faction.getFactionName().equals(factionToShow)) {
                faction.showMaxBribeTaker();
            }
        }
    }

    public void clearFactionByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to delete all deputies:");
        String factionToShow = scanner.nextLine();
        Iterator<Faction> factionIterator = factionList.iterator();
        while (factionIterator.hasNext()) {
            Faction faction = factionIterator.next();
            if (faction.getFactionName().equals(factionToShow)) {
                faction.deleteAllFractionMembers();
            }
        }
    }

    public void showFactionsList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faction name to show all deputies:");
        String factionToShow = scanner.nextLine();
        Iterator<Faction> factionIterator = factionList.iterator();
        while (factionIterator.hasNext()) {
            Faction faction = factionIterator.next();
            if (faction.getFactionName().equals(factionToShow)) {
                faction.showAllDeputiesInFaction();
            }
        }
    }
}

