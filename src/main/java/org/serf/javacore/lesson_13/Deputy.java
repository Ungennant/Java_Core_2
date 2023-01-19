package org.serf.javacore.lesson_13;

import java.util.Scanner;

public class Deputy extends Human {

    private String name;
    private String surname;
    private int age;
    private boolean bribeTaker;
    private double bribeTotal;

    public Deputy(double weight, double height, String name,
                  String surname, int age, boolean bribeTaker) {
        super(weight, height);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.bribeTaker = bribeTaker;
    }

    public void giveBribe() {
        Scanner scanner = new Scanner(System.in);
        if (!bribeTaker) {
            System.out.println("This deputy does not take bribes");
        } else {
            System.out.println("Enter total of bribe to give:");
            double bribe = scanner.nextDouble();
            if (bribe > 5000) {
                System.out.println(bribe);
                System.out.println("Deputy was caught taking a bribe and detained by the SBU.");
                return;
            } else {
                bribeTotal += bribe;
            }
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

    public boolean isBribeTaker() {
        return bribeTaker;
    }

    public void setBribeTaker(boolean bribeTaker) {
        this.bribeTaker = bribeTaker;
    }

    public double getBribeTotal() {
        return bribeTotal;
    }

    public void setBribeTotal(double bribeTotal) {
        this.bribeTotal = bribeTotal;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", bribeTaker=" + bribeTaker +
                ", bribeTotal=" + bribeTotal +
                '}';
    }
}
