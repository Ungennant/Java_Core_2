package org.serf.javacore.lesson_03;

public class Circle {

    private double radius;
    private double diameter;

    public Circle() {
        this.radius = 5;
        this.diameter = 10;
        System.out.println("Created default circle - radius" + this.radius + ", diameter " + this.diameter);
        System.out.println();
    }

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
        System.out.println("Created circle with your params - radius " + this.radius + ", diameter " + this.diameter);
        System.out.println();
    }

    public void getArea() {
        System.out.println("Circle area = " + Math.PI * radius * radius);
    }

    public void getLength() {
        System.out.println("Circle length = " + Math.PI * 2 * radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
