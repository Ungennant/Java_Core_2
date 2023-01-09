package org.serf.javacore.lesson_07;

public class Test {
    public static void main(String[] args) {

        AircraftControl aircraftControl = new AircraftControl();
        Su27 plane1 = new Su27(16380, 22, 15, 2500, "Blue");

        plane1.startEngine();
        plane1.takeOff();
        aircraftControl.moveUp();
        aircraftControl.moveLeft();
        aircraftControl.moveDown();
        aircraftControl.moveRight();
        plane1.stealth();
        plane1.nuclear();
        plane1.turbo();
        plane1.landing();


    }
}
