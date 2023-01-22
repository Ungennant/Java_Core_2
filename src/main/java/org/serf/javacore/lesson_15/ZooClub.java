package org.serf.javacore.lesson_15;

import org.serf.javacore.lesson_14.Person;

import java.util.*;

public class ZooClub {

    Map<Person, List<Animal>> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public ZooClub() {
    }

    public void addClubMember() {

        String name;
        int age;

        System.out.println("Enter person name:");
        name = scanner.next();
        System.out.println("Enter person age:");
        age = scanner.nextInt();

        Person person = new Person(name, age);

        if (map.containsKey(person)) {
            System.out.println("Member already exist");
        } else {
            map.put(person, new ArrayList<>());
            System.out.println("Member added.");
            System.out.println(person);
            System.out.println(map.size());
        }
    }

    public void addPet() {

        String name;
        int age;

        System.out.println("Enter person name:");
        name = scanner.next();
        System.out.println("Enter person age:");
        age = scanner.nextInt();

        Person person = new Person(name, age);

        if (map.containsKey(person)) {

            String type;
            String petName;

            System.out.println("Enter animal type(cat, dog)");
            type = scanner.next();
            System.out.println("Enter animal name");
            petName = scanner.next();
            map.get(person).add(new Animal(petName, type));
            System.out.println("Pet added to "+ name);
        } else {
            System.out.println("Member not found!");
        }
    }

    public void removePet() {

        String name;
        int age;

        System.out.println("Enter person name:");
        name = scanner.nextLine();
        System.out.println("Enter person age:");
        age = scanner.nextInt();

        Person person = new Person(name, age);

        if (map.containsKey(person)) {

            String type;
            String petName;

            System.out.println("Enter animal type(cat, dog)");
            type = scanner.next();
            System.out.println("Enter animal name");
            petName = scanner.next();

            Animal animal = new Animal(type, name);

            map.get(person).remove(map.get(person).indexOf(animal));
        } else {
            System.out.println("Pet not found!");
        }
    }

    public void removePerson(){

        String name;
        int age;

        System.out.println("Enter person name:");
        name = scanner.nextLine();
        System.out.println("Enter person age:");
        age = scanner.nextInt();

        Person person = new Person(name, age);

        if (map.containsKey(person)) {
            map.remove(person);
        } else {
            System.out.println("Member not found!");
        }
    }

    public void removePetByType(){

        String type;

        type = scanner.next();

        Set<Person> keys = map.keySet();
        for (Person key : keys) {
            ListIterator<Animal> iter = map.get(key).listIterator();
            while (iter.hasNext()){
                Animal animal = iter.next();
                if(animal.getType().equals(type)){
                    iter.remove();
                }
            }
        }
    }

    public void showZooClubInfo(){
        Set<Person> keys = map.keySet();
        for (Person key : keys) {
            for (Animal animal : map.get(key)) {
                System.out.println(key + ", " + animal);
            }
            if(map.get(key).isEmpty()){
                System.out.println(key);
            }
        }
        if(map.isEmpty()){
            System.out.println("Member not found!");
        }
    }

}
