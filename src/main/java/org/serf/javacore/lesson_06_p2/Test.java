package org.serf.javacore.lesson_06_p2;

public class Test {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator(5,5);
        System.out.println(myCalculator.add());
        System.out.println(myCalculator.divide());
        System.out.println(myCalculator.multiply());
        System.out.println(myCalculator.subtract());
    }

}
