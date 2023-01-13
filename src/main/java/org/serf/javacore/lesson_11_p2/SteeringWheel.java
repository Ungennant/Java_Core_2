package org.serf.javacore.lesson_11_p2;

public class SteeringWheel {

    private int wheelDiam;
    private String material;

    public SteeringWheel(int wheelDiam, String material) {
        this.wheelDiam = wheelDiam;
        this.material = material;
    }

    public int getWheelDiam() {
        return wheelDiam;
    }

    public void setWheelDiam(int wheelDiam) {
        this.wheelDiam = wheelDiam;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "wheelDiam=" + wheelDiam +
                ", material='" + material + '\'' +
                '}';
    }
}
