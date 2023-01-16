package org.serf.javacore.lesson_12;

public class Engine {

    private int cylinderTotal;

    public Engine(int cylinderTotal) {
        this.cylinderTotal = cylinderTotal;
    }

    public int getCylinderTotal() {
        return cylinderTotal;
    }

    public void setCylinderTotal(int cylinderTotal) {
        this.cylinderTotal = cylinderTotal;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinderTotal=" + cylinderTotal +
                '}';
    }
}
