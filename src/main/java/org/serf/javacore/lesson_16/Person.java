package org.serf.javacore.lesson_16;

import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int birthYear;
    private double height;
    private double weight;

    public Person() {
    }

    public Person(String name, String surname, int age, int birthYear, double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    public void myMethod(String args) {
        System.out.println("Reflection method 1: " + args);
    }

    public void myMethod(String a, int... args) {
        System.out.println("Reflection method 2: " + a);
        for (int arg : args) {
            System.out.println(arg);
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && birthYear == person.birthYear && Double.compare(person.height, height) == 0 && Double.compare(person.weight, weight) == 0 && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, birthYear, height, weight);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthYear=" + birthYear +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
