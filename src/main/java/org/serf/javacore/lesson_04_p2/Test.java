package org.serf.javacore.lesson_04_p2;

public class Test {
    public static void main(String[] args) {

        Animal animal = new Animal("bird", 25, 6);
        System.out.println("Animal name: " + animal.getName() + ", animal speed: " + animal.getSpeed() + ", animal age: " + animal.getAge());
        System.out.println();

        animal.setName("turtle");
        animal.setSpeed(1);
        animal.setAge(120);

        System.out.println("Animal name: " + animal.getName() + ", animal speed: " + animal.getSpeed() + ", animal age: " + animal.getAge());
    }
}
