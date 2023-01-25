package org.serf.javacore.lesson_17;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[20];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
        }

        Collection collection = new Collection(intArray);
        Collection.Forward ForwardIterator = collection.createForward();

        System.out.println("SORTED FORWARD:");

        Integer[] sortedArray = (Integer[]) ForwardIterator.next();
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }

        System.out.println("SORTED BACKWARD:");

        Collection.Backward BackwardIterator = collection.createBackward();

        while (BackwardIterator.hasNext()) {
            Integer nextObj = (Integer) BackwardIterator.next();
            System.out.println(nextObj);
        }

        System.out.println("CHECK EVERY THIRD:");

        Iterator iterator = collection.anonymous();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("CHECK EVERY FIFTH:");

        Iterator iterator1 = collection.createArraySort();


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        System.out.println("CHECK EVERY SECOND:");

        Iterator iterator2 = collection.createArraySortStatic();

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
