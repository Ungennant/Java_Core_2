package org.serf.javacore.lesson_11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class IntegerArr {
    public static void main(String[] args) {
        Integer[] integers = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(10);
            System.out.print(integers[i]+" ");
        }
        Arrays.sort(integers);
        System.out.println();
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
        System.out.println();
        Arrays.sort(integers, Collections.reverseOrder());
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
    }
}
