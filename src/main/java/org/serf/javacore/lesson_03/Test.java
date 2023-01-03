package org.serf.javacore.lesson_03;

public class Test {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(20, 15);

        rectangle1.getPerimeter();
        rectangle2.getPerimeter();
        System.out.println();
        rectangle1.getArea();
        rectangle2.getArea();

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(20.5,15.5);

        circle1.getArea();
        circle2.getArea();
        System.out.println();
        circle1.getLength();
        circle2.getLength();
    }
}
