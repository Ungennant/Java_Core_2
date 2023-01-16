package org.serf.javacore.lesson_12_p3;

public class Test {
    public static void main(String[] args) {
        MyArrayListDemo<String> strings = new MyArrayListDemo<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");

        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
        System.out.println(strings.get(2));

        strings.remove(2);

        System.out.println("After remove have java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2");

        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
        System.out.println(strings.get(2));



    }
}
