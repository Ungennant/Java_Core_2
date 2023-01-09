package org.serf.javacore.lesson_07;

import java.util.Random;

public abstract class Plane implements IPlaneSpecials {

    private int weight;
    private int length;
    private int width;
    private Random random;

    public Plane(int weight, int length, int width) {
        this.weight = weight;
        this.length = length;
        this.width = width;
    }

    public void startEngine() {
        random = new Random();
        int startPoint = random.nextInt(20 + 88);
        System.out.println("Ready to take off in: " + startPoint);
    }

    public void takeOff() {
        random = new Random();
        int flyDistance = random.nextInt(1000);
        System.out.println("Overall fly distance is: " + flyDistance);
    }

    public void landing() {
        System.out.println("Plane is going to land");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
