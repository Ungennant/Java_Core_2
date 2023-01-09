package org.serf.javacore.lesson_07;

import java.util.Random;

public class Su27 extends Plane{

    private int maxSpeed;
    private String color;
    private Random random;

    public Su27(int weight, int length, int width, int maxSpeed, String color) {
        super(weight, length, width);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void turbo() {
        random = new Random();
        int overallTurbo = random.nextInt(1000);
        System.out.println("Plane speed with turbo:" + (this.maxSpeed + overallTurbo));
    }

    @Override
    public void stealth() {
        random = new Random();
        int totalStealthTime = random.nextInt(100);
        System.out.println("Plane in stealth mode for: " + totalStealthTime);
    }

    @Override
    public void nuclear() {
        random = new Random();
        int totalBombs = random.nextInt(10);
        System.out.println("Tota nuclear bombs dropped: " + totalBombs);
    }
}
