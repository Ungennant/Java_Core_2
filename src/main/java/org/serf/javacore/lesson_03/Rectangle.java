package org.serf.javacore.lesson_03;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle() {
        this.height = 10;
        this.width = 5;
        System.out.println("Created default rectangle - height " + this.height + ", width " + this.width);
        System.out.println();
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        System.out.println("Created rectangle with your params - height " + this.height + ", width " + this.width);
        System.out.println();
    }

    public void getPerimeter() {
        System.out.println("Perimeter = " + 2 * (width + height));
    }

    public void getArea() {
        System.out.println("Area = " + (width * height));
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
