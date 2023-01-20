package org.serf.javacore.lesson_14;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();
        Set<Person> personTreeSet = new TreeSet<>();

        Person person1 = new Person("Tom", 20);
        Person person2 = new Person("Bob", 22);
        Person person3 = new Person("Katy", 25);
        Person person4 = new Person("Sam", 29);
        Person person5 = new Person("Linda", 19);

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);

        personTreeSet.add(person1);
        personTreeSet.add(person2);
        personTreeSet.add(person3);
        personTreeSet.add(person4);
        personTreeSet.add(person5);

        System.out.println("Person HashSet default:");
        for (Person person : personSet) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("Person TreeSet with compareTo(by Age):");
        for (Person person : personTreeSet) {
            System.out.println(person);
        }
        System.out.println();

        List<Person> personList = new ArrayList<>(personSet);
        Collections.sort(personList, new PersonNameLengthComparator());
        System.out.println("Person HashSet sorted with Comparator by Name Length");
        for (Person person : personList) {
            System.out.println(person);
        }
        System.out.println();
        Collections.sort(personList, new PersonAgeComparator());
        System.out.println("Person HashSet sorted with Comparator by Age");
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
