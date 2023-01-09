package org.serf.javacore.lesson_07;

import java.util.Random;

public class AircraftControl {

    public void moveUp() {
        Random random = new Random();
        int randomMove = random.nextInt(100);
        System.out.println("Plane moved up for distance: " + randomMove);
    }

    public void moveDown() {
        Random random = new Random();
        int randomMove = random.nextInt(100);
        System.out.println("Plane moved down for distance: " + randomMove);
    }

    public void moveLeft() {
        Random random = new Random();
        int randomMove = random.nextInt(100);
        System.out.println("Plane moved left for distance: " + randomMove);
    }

    public void moveRight() {
        Random random = new Random();
        int randomMove = random.nextInt(100);
        System.out.println("Plane moved right for distance: " + randomMove);
    }

}
