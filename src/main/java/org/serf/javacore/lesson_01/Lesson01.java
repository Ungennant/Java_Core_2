package org.serf.javacore.lesson_01;

import java.util.Random;

public class Lesson01 {
    public static void main(String[] args) {

        byte minB = Byte.MIN_VALUE;
        byte maxB = Byte.MAX_VALUE;
        short minS = Short.MIN_VALUE;
        short maxS = Short.MAX_VALUE;
        int minI = Integer.MIN_VALUE;
        int maxI = Integer.MAX_VALUE;
        long minL = Long.MIN_VALUE;
        long maxL = Long.MAX_VALUE;
        float minF = Float.MIN_VALUE;
        float maxF = Float.MAX_VALUE;
        char minCh = Character.MIN_VALUE;
        char maxCh = Character.MAX_VALUE;
        System.out.println(minB);
        System.out.println(maxB);
        System.out.println(minS);
        System.out.println(maxS);
        System.out.println(minI);
        System.out.println(maxI);
        System.out.println(minL);
        System.out.println(maxL);
        System.out.println(minF);
        System.out.println(maxF);
        System.out.println(minCh);
        System.out.println(maxCh);

        int[] arr = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(10);
            System.out.println(arr[i] + " ");
        }

        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
            }
        }

        System.out.println();
        System.out.println("Min num in array:" + min);


        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        }

        System.out.println();
        System.out.println("Max num in array:" + max);
    }
}
